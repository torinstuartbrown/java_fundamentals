package labs_examples.exception_handling.labs;

public class ExceptionLabs {


    public static void main(String[] args) {

        //1) Demonstrate a try/catch.
        System.out.println("EX. 1");
        try {
            int x = 1;
            int y = 0;
            int z = x / y;

        } catch (ArithmeticException exc) {
            System.out.println("cannot divide by zero");
        }

        //2)  Demonstrate a try/catch with multiple catch statements.
        System.out.println("Ex.2");
        int[] nums = {0, 5, 10};
        try {
            int a = nums[10];
        } catch (ArithmeticException one) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException two) {
            System.out.println("Out of bounds Error");
        }

        //3) Demonstrate a try/catch/finally block.
        System.out.println("Ex.3");
        try {
            int x = 1;
            int y = 0;
            int z = x / y;

        } catch (ArithmeticException exc) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("Finally Statement.");
        }

        //4) Demonstrate a nested try/catch.
        //cant get this one to work when dividing by 0.
        System.out.println("Ex.4");
        int[] nums2 = {0, 50, 100};
        try {
            int b = nums2[1] / nums2[0];
        } catch (Exception three) {
            System.out.println("Out of bounds Error");
            try {
                int b = nums2[1] / nums2[0];
            } catch (ArithmeticException four) {
                System.out.println("cannot divide by zero");
            }
        }

        //6) Dmonstrate throwing an exception in one method and catching it in another method.
        System.out.println("Ex.6");

        try {
            int o = divide(5, 0);
        } catch (ArithmeticException five) {
            System.out.println("Exception thrown");
        }
        System.out.println("done");

        //7)1) Create a custom exception.
        //  2) Demonstrate a method throwing your custom exception.


    }

    //5) Demonstrate how to throw an exception.
    public static int divide(int u, int w) throws ArithmeticException {
        return u / w;
    }

    public static void demo() throws InventoryFullException {
        throw new InventoryFullException();
    }
}




