package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {
        int x = 1;
        while (x<10){
            System.out.println("x = " + x);
            if (x == 8){
                break;}
                x++;
        }
    }
}

