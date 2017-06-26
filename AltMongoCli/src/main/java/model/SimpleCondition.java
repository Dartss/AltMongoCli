package model;

import com.sun.istack.internal.NotNull;

public class SimpleCondition implements Condition{
    @NotNull
    private final String columnName;
    @NotNull
    private final String operator;
    @NotNull
    private final Object expression;

    public SimpleCondition(String columnName, String operator, Object expression) {
        this.columnName = columnName;
        this.operator = operator;
        this.expression = expression;
    }

    public String getColumnName() {
        return columnName;
    }

    @Override
    public String getOperator() {
        return operator;
    }

    @Override
    public Object getExpression() {
        return expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleCondition condition = (SimpleCondition) o;

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
        return "\nSimpleCondition{" +
                "columnName='" + columnName + '\'' +
                ", operator='" + operator + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
