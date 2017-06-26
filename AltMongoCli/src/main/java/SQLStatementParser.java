import model.ParsedSQLStatement;

public interface SQLStatementParser {
    ParsedSQLStatement parse(String statement);
}
