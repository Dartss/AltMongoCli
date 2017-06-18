package model;

import com.sun.istack.internal.NotNull;

public class Condition {
    @NotNull
    private final String columnName;
    @NotNull
    private final String operator;
    @NotNull
    private final String expression;

    public Condition(String columnName, String operator, String expression) {
        this.columnName = columnName;
        this.operator = operator;
        this.expression = expression;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getOperator() {
        return operator;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Condition condition = (Condition) o;

        if (!columnName.equals(condition.columnName)) return false;
        if (!operator.equals(condition.operator)) return false;
        return expression.equals(condition.expression);
    }

    @Override
    public int hashCode() {
        int result = columnName.hashCode();
        result = 31 * result + operator.hashCode();
        result = 31 * result + expression.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "columnName='" + columnName + '\'' +
                ", operator='" + operator + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
