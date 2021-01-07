package labs_examples.arrays.labs;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import sun.security.util.ArrayUtil;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a number from 1 to 10: ");
        int num = scanner.nextInt();

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        System.out.println("The index of " + num + " is " + (array.length - num));


    }
}
