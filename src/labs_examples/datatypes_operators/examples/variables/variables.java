package labs_examples.datatypes_operators.examples.variables;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class variables {

    static double val = 123.45;

    public static void main(String[] args) {

        Person myPerson = new Person("Torin", 25);
        Person yourPerson = new Person("Jeff", 30);
        Person einstein = new Person ("Einstein", 110);
        Person adi = new Person ("adi", 25);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());
        System.out.println(adi.toString());


        //double x = multiply(val, val * 2);
    }

    public static double multiply(double a, double b){

        double product = a * b;

        if (product >0){
            double testVal = product * 2;
            System.out.println(testVal);
        }
        printNum(product);
        return product;
    }

    public static void printNum (double numToPrint){
        System.out.println("numToPrint = " + numToPrint);
        System.out.println(val);
    }
}
