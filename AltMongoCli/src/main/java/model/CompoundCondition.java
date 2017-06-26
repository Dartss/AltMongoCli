package model;

import java.util.List;

public class CompoundCondition implements Condition {
    private String compoundOperator;
    private List<Condition> conditions;

    public String getCompoundOperator() {
        return compoundOperator;
    }

    public void setCompoundOperator(String compoundOperator) {
        this.compoundOperator = compoundOperator;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public String getOperator() {
        return compoundOperator;
    }

    @Override
    public String getColumnName() {
        return null;
    }

    @Override
    public Object getExpression() {
        return null;
    }
}
