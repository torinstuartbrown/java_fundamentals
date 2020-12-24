package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a upper and lower ");
        // assign input to variable as int
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        int sum = upper + lower ;
        int prod = upper * lower ;

        System.out.println("The sum of " + upper + " and " + lower + " is eqaul to " + sum);
        System.out.println("The product of " + upper + " and " + lower + " is eqaul to " + prod);

        int s = 0;
        int count = 0;


        for(int i = lower; i <= upper; i++){
            s += i;
            count++;
        }
        double a = (double)s / count;
        System.out.println(s);
        System.out.println(a);


    }
}
