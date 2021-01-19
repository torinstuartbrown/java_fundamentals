package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {


    public static void main(String[] args) {
        int count1 = countArgs("1", "2", "3");
        int count2 = countArgs("hi");

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(5, 6));
        System.out.println(divide(50, 5));
        joke("tell me a joke");
        System.out.println(yearsToSeconds(9));
        int secs = yearsToSeconds(7);
        System.out.println(secs);
        System.out.println(count1);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        int quotent = a / b;
        return quotent;

    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void joke(String s) {
        if (s == "tell me a joke"){
            System.out.println("The AFC East");
        }

    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int a) {
        int sec = a * 365 * 24 * 60 * 60;
        return sec;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    // is this what you are asking for?

    public static int countArgs(String... args){
        return args.length;
    }

}




