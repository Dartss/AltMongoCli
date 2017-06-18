import antlr.SQLiteBaseListener;
import antlr.SQLiteLexer;
import antlr.SQLiteParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SelectCommandParser {
    private static SelectCommandParser instance = null;
    private List<String> output = null;

    private SelectCommandParser() {
    }

    public static SelectCommandParser getInstance() {
        if (instance == null) {
            instance = new SelectCommandParser();
        }

        return instance;
    }

    public List<String> parseSelect(String statement) {
        output = new ArrayList<>();
        CharStream in = new ANTLRInputStream(statement);
        SQLiteLexer lexer = new SQLiteLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);

        ParseTree tree = parser.select_stmt();

        // Walk the `select_stmt` production and listen when the parser
        // enters the `expr` production.
        ParseTreeWalker.DEFAULT.walk(new SQLiteBaseListener() {

            @Override
            public void enterSelect_stmt(@NotNull SQLiteParser.Select_stmtContext ctx) {
                //table
                String collectionName = ctx.select_or_values(0).table_or_subquery().get(0).getText();
                //condition
                SQLiteParser.ExprContext conditions = ctx.select_or_values(0).expr(0);
//                ctx.select_or_values(0).expr(0).children.forEach(System.out::println);
//                System.out.println(ctx.select_or_values(0).expr(0).getRuleContext().getText());
                if (conditions != null) {
                    for (SQLiteParser.ExprContext expr : conditions.expr()) {
                        System.out.println(expr.getText());

                        if (expr.column_name() != null)
                        System.out.println(expr.column_name().getText());

                        if (expr.table_name() != null)
                        System.out.println(expr.table_name().getText());
                    }

                    List<String> a = new ArrayList<>();
                    for (ParseTree child : conditions.children) {
                        rec(a, child);
                    }
                    System.out.println(a);
                }

                try {
                    output = MongodbHelper.getInstance().getDocuments(collectionName, null, null);
                } catch (DatabaseNotSelectedException e) {
                    output.add(e.getMessage());
                    Logger.getLogger(this.getClass().getName()).info("DB wasn't selected");
                    return;
                }

                //projections
//                List<String> projections = new ArrayList<>();
//                ctx.select_or_values(0).result_column().forEach(e -> projections.add(e.getText()));
            }
        }, tree);

        return output;
    }

    public void rec (List<String> list, ParseTree pt) {
        if (pt.getChildCount() == 0) {
            list.add(pt.getText());
        } else {
            for  (int i = 0; i < pt.getChildCount(); i++) {
                rec(list, pt.getChild(i));
            }
        }
    }


}
