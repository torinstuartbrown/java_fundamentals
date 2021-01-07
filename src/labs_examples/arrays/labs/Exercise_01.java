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
        System.out.print("Provide 10 Numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();
        int seven = scanner.nextInt();
        int eight = scanner.nextInt();
        int nine = scanner.nextInt();
        int ten = scanner.nextInt();
        int[] arrayOne = {one, two, three, four, five, six, seven, eight, nine, ten};
        for (int i = 0; i <arrayOne.length; i++){

            System.out.println(arrayOne[i]);



            }
        int sum =0;
        for (int value : arrayOne) {
            sum += value;
        }
        System.out.println(sum);
        System.out.println(arrayOne.length);
        double avg = sum / arrayOne.length;

        System.out.println(avg);
        }

    }

