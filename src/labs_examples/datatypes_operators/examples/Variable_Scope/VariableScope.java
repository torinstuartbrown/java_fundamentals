package labs_examples.datatypes_operators.examples.Variable_Scope;

import java.sql.SQLOutput;

public class VariableScope {

    int globalVar = 10;

    public static int multiply (int a, int b){
        Vehicle myCar = new Vehicle();
        myCar.make = "Ford";
        myCar.model = "Escape";
        myCar.year = 2011;

        if (myCar.make.equalsIgnoreCase("Toyota") {
            String Message = "It's a toyota";
            System.out.println(Message);
        }
    }

        int result = a * b * globalVar;
        return result;
    }

        public static int divide(int a, int b){
            int val = globalVar /a / b;
            return val;
        }
}
