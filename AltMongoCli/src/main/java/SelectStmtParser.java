import antlr.SQLite2BaseListener;
import antlr.SQLite2Lexer;
import antlr.SQLite2Parser;
import model.SimpleCondition;
import model.ParsedSQLStatement;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

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

    public ParsedSQLStatement parse(String statement) {
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

    private List<SimpleCondition> getConditions(SQLite2Parser.ExprContext conditions) {
        List<SimpleCondition> conditionList = null;
        if (conditions != null) {
            conditionList = new ArrayList<>();
            if (conditions.comparing_operators() != null) {
                parseExpression(conditionList, conditions);
            } else {
                for (int i = 0; i < conditions.expr().size(); i++) {
                    parseExpression(conditionList, conditions.expr(i));
                }
            }
        }
        return conditionList;
    }

    private void parseExpression(List<SimpleCondition> list, SQLite2Parser.ExprContext exprContext) {
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
            }
            if (expression == null) expression = exprContext.expr(1).getText();
            if (exprContext.comparing_operators() != null)
                operator = exprContext.comparing_operators().getText();

            SimpleCondition con = new SimpleCondition(columnName, operator, expression);
            list.add(con);
        } else {
            for  (int i = 0; i < exprContext.expr().size(); i++) {
                parseExpression(list, exprContext.expr(i));
            }
        }
    }

    class SQLParserHelper extends SQLite2BaseListener {

        @Override
        public void enterSelect_stmt(@NotNull SQLite2Parser.Select_stmtContext ctx) {
            //table
            String targetName = ctx.select_or_values(0).table_or_subquery().get(0).getText();
            //condition
            SQLite2Parser.ExprContext conditions = ctx.select_or_values(0).expr(0);
            List<SimpleCondition> conditionList = getConditions(conditions);
            //projections
            List<String> projections = null;
            if (ctx.select_or_values(0).result_column() != null) {
                projections = new ArrayList<>();
                for (SQLite2Parser.Result_columnContext rc : ctx.select_or_values(0).result_column()) {
                    projections.add(rc.getText());
                }
            }

            parsedSQLStatement = new ParsedSQLStatement(targetName, conditionList, projections, 0);
        }
    }
}
//select * from customers where root.age > 5 and age < 10 or name != '111'