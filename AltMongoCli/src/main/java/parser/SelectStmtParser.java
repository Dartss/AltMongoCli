package parser;

import parser.antlr.SQLite2BaseListener;
import parser.antlr.SQLite2Lexer;
import parser.antlr.SQLite2Parser;
import model.ParsedSQLStatement;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;


/**
 * Parses select statements using ANTLR lexer and converts 'conditions' into Bson documents,
 * that are suitable for mongodb method 'find()'.
 * Also retrieves 'target' and 'projections'.
 * All retrieved data puts into {@code ParsedSQLStatement} object
 *
 * !!!Warning. In current version, it can parse equality ONLY
 * of string values that are wrapped with '"' for example:
 * select * from name == '"'Dima'"'   : here name - is column name and '"'Dima'"' - string value
 *
 */
public class SelectStmtParser implements SQLStatementParser {
    private static SelectStmtParser instance = null;
    private ParsedSQLStatement parsedSQLStatement = null;

    private SelectStmtParser() {
    }

    public static SelectStmtParser getInstance() {
        if (instance == null) {
            instance = new SelectStmtParser();
        }

        return instance;
    }

    @Override
    public ParsedSQLStatement parse(String statement) {
        //initiation of lexer
        CharStream in = new ANTLRInputStream(statement);
        SQLite2Lexer lexer = new SQLite2Lexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLite2Parser parser = new SQLite2Parser(tokens);

        ParseTree tree = parser.select_stmt();

        // Walk the `select_stmt` production and listen when the parser
        // enters the `expr` production.
        ParseTreeWalker.DEFAULT.walk(new SQLParserHelper(), tree);

        return parsedSQLStatement;
    }

    private List<Bson> getConditions(SQLite2Parser.ExprContext conditions) {
        List<Bson> query = null;
        if (conditions != null) {
            query = parseConditions(conditions);
        }
        return query;
    }

    private List<Bson> parseConditions(SQLite2Parser.ExprContext exprContext)
    {
        List<Bson> b = new ArrayList<>();
        if (exprContext.comparing_operators() != null) {
            String columnName = null;
            String operator = null;
            Object expression = null;
            for (SQLite2Parser.ExprContext expr : exprContext.expr()) {
                if (expr.target_name() != null && columnName == null)
                    columnName = expr.target_name().getText();

                if (expr.literal_value() != null) {
                    expression = Double.valueOf(expr.literal_value().getText());
                }

                if (expr.STRING_VALUE()!= null) {
                    String s = expr.STRING_VALUE().getText();
                    expression = s.replace("\"", "");
                }
            }

            operator = exprContext.comparing_operators().getText();
            b.add(getBsonByOperator(operator, columnName, expression));
        } else {
            List<Bson> sq = new ArrayList<>();
            if (exprContext.K_AND() != null) {
                for  (int i = 0; i < exprContext.expr().size(); i++) {
                    sq.addAll(parseConditions(exprContext.expr(i)));
                }
                b.add(and(sq));
            } else if (exprContext.K_OR() != null) {
                for  (int i = 0; i < exprContext.expr().size(); i++) {
                    sq.addAll(parseConditions(exprContext.expr(i)));
                }
                b.add(or(sq));
            } else {
                for  (int i = 0; i < exprContext.expr().size(); i++) {
                    b.addAll(parseConditions(exprContext.expr(i)));
                }
            }
        }

        return b;
    }

    private Bson getBsonByOperator(String operator, String columnName, Object expression) {
        Bson query = null;
        switch (operator) {
            case ("=="):
                query = eq(columnName, expression);
                break;
            case ("!="):
                query = ne(columnName, expression);
                break;
            case (">"):
                query = gt(columnName, expression);
                break;
            case ("<="):
                query = lte(columnName, expression);
                break;
            case (">="):
                query = gte(columnName, expression);
                break;
            case ("<"):
                query = lt(columnName, expression);
                break;
        }
        return query;
    }

    class SQLParserHelper extends SQLite2BaseListener {

        @Override
        public void enterSelect_stmt(@NotNull SQLite2Parser.Select_stmtContext ctx) {
            //table
            String targetName = ctx.select_or_values(0).table_or_subquery().get(0).getText();

            //condition
            SQLite2Parser.ExprContext conditions = ctx.select_or_values(0).expr(0);
            List<Bson> query = getConditions(conditions);
            System.out.println("Query : " + query);

            //projections
            List<String> projections = null;
            if (ctx.select_or_values(0).result_column() != null) {
                projections = new ArrayList<>();
                for (SQLite2Parser.Result_columnContext rc : ctx.select_or_values(0).result_column()) {
                    projections.add(rc.getText());
                }
            }

            parsedSQLStatement = new ParsedSQLStatement(targetName, query, projections, 0);
        }
    }
}