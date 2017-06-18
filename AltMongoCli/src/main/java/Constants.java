import java.util.HashMap;
import java.util.Map;

public class Constants {
    private static Map<String, String> operations = null;

    public  static Map<String, String> getOperations() {
        if(operations == null) {
            operations = new HashMap<>();
            operations.put(">", "$gt");
            operations.put(">=", "$gte");
            operations.put("<", "$lt");
            operations.put("<=", "$lte");
            operations.put("=", "$eq");
        }

        return operations;
    }
}
