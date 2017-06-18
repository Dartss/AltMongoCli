package model;

import java.util.Set;

public class SqlStatementEntities {
    private Set<Condition> conditions;
    private Set<Projection> projections;
    private int limit;
    private Target target;

    public SqlStatementEntities(Target target) {
        this.target = target;
    }

    public SqlStatementEntities() {
    }

    public Set<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(Set<Condition> conditions) {
        this.conditions = conditions;
    }

    public Set<Projection> getProjections() {
        return projections;
    }

    public void setProjections(Set<Projection> projections) {
        this.projections = projections;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "SqlStatementEntities{" +
                "conditions=" + conditions +
                ", projections=" + projections +
                ", limit=" + limit +
                ", target=" + target +
                '}';
    }
}
