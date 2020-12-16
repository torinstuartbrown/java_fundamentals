package labs_examples.datatypes_operators.examples.casting;

import java.sql.SQLOutput;

public class NarrowingConversions {


    public static void main(String[] args) {


        double x = 10.23;

        // double "x" is being casted to an (int) "z" below
        System.out.println("x = " + x);
        float f = (float) x;
        System.out.println("f = "+ f);
        int z = (int) x;
        System.out.println("z = " + z);
        // more examples
        double d = 100.04;
        System.out.println("d =" + d);
        // cast double "d" to long "l" - explicit type casting required
        long l = (long) d;
        System.out.println("l = " + l);
        // cast long "l" to int "i" - explicit type casting required
        int i = (int) l;
        System.out.println("i = " + i);
        System.out.println("Long value " + l);
        System.out.println("int value " + i);
    }

}
