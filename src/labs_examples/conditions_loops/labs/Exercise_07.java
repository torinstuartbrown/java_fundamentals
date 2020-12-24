package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {

    public static void main(String[] args) {
        //      // create scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word: ");

        // Sting input
        String word = scanner.nextLine();
        String vowels = "aeiou";
        int i = 0;
        while(i < word.length()){
            char letter = word.charAt(i);
            int x = vowels.indexOf(letter);
            if (x != -1){
                System.out.println("the first vowel in " + word + " is " + letter);
                break;
            }
            i++;
        }


    }

}

