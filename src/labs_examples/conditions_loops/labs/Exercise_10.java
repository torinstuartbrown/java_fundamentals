package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        // please demonstrate the use of the "continue" keyword below within a for loop
        for (int i = 0; i <= 100; i += 5) {
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50) {

                continue;
            }
            System.out.println("i = " + i);
        }
    }
}