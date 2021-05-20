package labs_examples.lambdas.labs;

import java.util.*;
import java.util.stream.IntStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list
 * 4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable.
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * 6) Demontsrate how to Stream a text file and print out each line
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the element at the 1 index for each array.
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the sum of all elements at index 2.
 * 9) Demonstrate the anyMatch() function.
 * 10) Demonstrate the allMatch() function.asdfasdfas
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 */

public class Exercise_04 {


    public static void main(String[] args) throws IOException {

        String bandsFile = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";
        String textFile = "C:\\Users\\torin\\CN\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";

        System.out.println("EX1");
        IntStream
                .range(1, 16)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("EX2");
        int range = IntStream.range(1, 50)
                .sum();
        System.out.println(range);


        System.out.println("EX3");
        int sum = Arrays.stream(new int[]{1, 3, 5, 7, 9})
                .map(x -> x + 1)
                .sum();
        System.out.println(sum);

        System.out.println("EX4");
        OptionalDouble avg = Arrays.stream(new int[]{2, 20, 3, 40, 2, 30, 50})
                .filter(x -> x < 10)
                .average();
        System.out.println(avg);

        System.out.println("EX5");
        double total = Stream.of(1.1, 2.2, 3.3)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println(total);

        System.out.println("EX6");
        Stream<String> bands = Files.lines(Paths.get(bandsFile));
        bands
                .forEach(System.out::println);
        bands.close();

        System.out.println("EX7");
        Stream<String> rows1 = Files.lines(Paths.get(textFile));
        rows1
                .map(x -> x.split(","))
                .forEach(x -> System.out.println(x[1]));
        rows1.close();

        System.out.println("EX8");
        Stream<String> rows2 = Files.lines(Paths.get(textFile));
        double totalTwo = rows2
                .map(x -> x.split(","))
                .map(x -> x[2])
                .mapToDouble(x -> Double.parseDouble(x))
                .sum();
        System.out.println(totalTwo);

        System.out.println("EX9");
        Stream<String> bandFinder = Files.lines(Paths.get(bandsFile));
        boolean found = bandFinder.anyMatch(s -> s.contains("John Mayer"));
        System.out.println(found);

        System.out.println("EX10");
        Stream<String> rows3 = Files.lines(Paths.get(bandsFile));
        boolean answer = rows3.allMatch(x -> x.length() > 12);
        System.out.println(answer);

        System.out.println("EX11");
        List<String> bands11 = Files.lines(Paths.get(bandsFile))
                .filter(x -> x.startsWith("The"))
                .collect(Collectors.toList());
        bands11.forEach(x -> System.out.println(x));
    }
}



