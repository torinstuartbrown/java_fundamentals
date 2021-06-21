package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
<<<<<<< HEAD:src/labs_examples/objects_classes_methods/labs/methods/Exercise_04.java
        int x = factorial(5);
        System.out.println(x);
=======
//        int x = factorial(5);
//        System.out.println(x);
//        should print 120
>>>>>>> fec017cf762c928306a10d145e5739a410f073b2:src/labs_examples/objects_classes_methods/labs/methods/Exercise_03.java
    }

    static int factorial(int x){
        int total;
        if(x == 1)
            return 1;
        total = factorial(x - 1) * x;
        return total;
    }



}

