package labs_examples.arrays.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Provide 10 Numbers: ");
//        int[] nums = new int[10];
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Provide Number " + i);
//            nums[i - 1] = scanner.nextInt();
//            sum += nums[i-1];
//
//        }

        System.out.println("Please enter ten numbers seperated by commas: ");
        String input = scanner.next();
        String[] strNums = input.split(",");
        int sum = 0;
        for(String s : strNums){
            sum += Integer.parseInt(s);
        }

        double avg = (double)sum / strNums.length;




        System.out.println("The sum is " + sum);
        System.out.println("The Average is " + avg);


    }
}

