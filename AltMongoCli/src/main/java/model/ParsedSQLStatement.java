package model;

import org.bson.conversions.Bson;

import java.util.List;

public class ParsedSQLStatement {
    private final String target;
    private final List<Bson> conditions;
    private final List<String> projections;
    private final int limit;

    public ParsedSQLStatement(String target, List<Bson> conditions, List<String> projections, int limit) {
        this.target = target;
        this.conditions = conditions;
        this.projections = projections;
        this.limit = limit;
    }

    public String getTarget() {
        return target;
    }

    public List<Bson> getConditions() {
        return conditions;
    }

    public List<String> getProjections() {
        return projections;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "ParsedSQLStatement{" +
                "target='" + target + '\'' +
                ", conditions=" + conditions +
                ", projections=" + projections +
                ", limit=" + limit +
                '}';
    }
}
