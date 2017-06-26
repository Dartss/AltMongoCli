package model;

public interface Condition {
    String getOperator();
    String getColumnName();
    Object getExpression();
}
