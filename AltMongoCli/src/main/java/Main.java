import asg.cliche.InputConverter;
import asg.cliche.ShellFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("", "", new MongoShell())
                .commandLoop(); // and three.,


//        final List<String> functionNames = new ArrayList<String>();
//
//        String str = "SELECT test_column1, test_column2 from t where condition1 < 2 and condition2 > 5";
////        String str = "SELEC test_column";


        // Print the parsed functions.
    }

   }
