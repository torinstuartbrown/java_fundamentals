package labs_examples.input_output.labs;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

import java.io.*;


public class Exercise_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        BufferedReader inputStreamTwo = null;
        PrintWriter outputStreamTwo = null;

        int i;

        try {
            inputStream = new BufferedReader(new FileReader("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt"));
            outputStream = new PrintWriter(new FileWriter("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_write.txt"));
            String l;

            do {
                i = inputStream.read();
                if (i != -1)
                    if ((char) i == 'a')
                        i = '-';
                if ((char) i == 'e')
                    i = '~';
                outputStream.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("ERROR: " + exc.getMessage());
        } finally {
            {
                try {
                    inputStream.close();
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
                outputStream.close();
            }
        }

        try {
            inputStreamTwo = new BufferedReader(new FileReader("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_write.txt"));
            outputStreamTwo = new PrintWriter(new FileWriter("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data_write_two.txt"));
            String l;

            do {
                i = inputStreamTwo.read();
                if (i != -1)
                    if ((char) i == '-')
                        i = 'a';
                if ((char) i == '~')
                    i = 'e';
                outputStreamTwo.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("ERROR: " + exc.getMessage());
        } finally {
            {
                try {
                    inputStreamTwo.close();
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
                outputStreamTwo.close();
            }
        }
    }
}