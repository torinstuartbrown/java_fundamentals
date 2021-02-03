package labs_examples.conditions_loops.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchPracticeTwo {

    /*
        do another switch case exercise
        take in 2 numbers from the user
        and ask them if they would like multiply, divide, add or subtract those numbers
        then use a switch case on which operation they'd like to do and print out the result
        white_check_mark
        eyes
        raised_hands

        Give me one number:
        Give me another number:
        Would you like add, subtract, multiply or divide these numbers?
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me one number:");
        int num1 = scanner.nextInt();
        System.out.println("Give me another number: ");
        int num2 = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append("What would you like to do with these numbers?")
                .append("\n1) Add")
                .append("\n2) Subtract")
                .append("\n3) Multiply")
                .append("\n4) Divide");
        System.out.println(sb.toString());

        int operation = scanner.nextInt();
        int result = 0;
        char operator = '+';

        switch (operation){
            case 1:
                result = num1 = num2;
                operator = '+';
                break;
            case 2:
                result = num1 - num2;
                operator = '-';
                break;
            case 3:
                result = num1 * num2;
                operator = '*';
                break;
            case 4:
                result = num1 / num2;
                operator = '/';
                break;
        }
        System.out.println("The result of the " + num1 + " " + operator + " " + num2 + " is " + result);
    }
}
