package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 * <p>
 * 1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 * 10 of them! You can do it! You'll know so much about them when you're done!
 */

public class Exercise_02 {

    public static void main(String[] args) {
        tryPredicate();
        tryFunction();
        tryBiFunction();
        trySupplier(8);
        tryConsumer();
        tryBinaryOperator();
        tryDoubleToInt(6.7);
        tryBiConsumer();
        tryUnaryOperator("WORD");
        tryToIntBiFunction();
    }

    private static void tryPredicate() {
        Predicate<Integer> moreThan = i -> (i > 10);
        System.out.println(moreThan.test(15));
    }

    private static void tryFunction() {
        Function<Integer, Double> area = a -> a * a * 3.14;
        System.out.println(area.apply(2));
    }

    private static void tryBiFunction() {
        BiFunction<Integer, Integer, Double> hypotenous = (a, b) -> Double.valueOf(a * a + b * b);
        System.out.println(hypotenous.apply(3, 8));
    }

    private static void trySupplier(int x) {
        Supplier<Integer> stringSupplier = () -> Math.incrementExact(x);
        System.out.println(stringSupplier.get());
    }

    private static void tryConsumer() {
        List<String> names = Arrays.asList("torinb", "ryand", "adic", "colling", "kylek");
        names.forEach((name) -> System.out.println(name + "@gmail.com"));
    }

    private static void tryBinaryOperator() {
        BinaryOperator<String> combine = (s1, s2) -> s1.concat(s2);
        String s3 = combine.apply("hello", "world");
        System.out.println(s3);
    }

    private static void tryDoubleToInt(double y) {
        DoubleToIntFunction roundDown = a -> (int) a;
        System.out.println(roundDown.applyAsInt(y));
    }

    private static void tryBiConsumer() {
        BiConsumer<Double, Double> average = (t, u) -> System.out.println((t + u) / 2);
        average.accept(5.5, 12.3);
    }

    private static void tryUnaryOperator(String s) {

        UnaryOperator<String> lowerCase = s1 -> s1.toLowerCase();
        String s2 = lowerCase.apply(s);
        System.out.println(s2);
    }

    private static void tryToIntBiFunction() {
        ToIntBiFunction<String, String> add = (a, b) -> Integer.parseInt(a) + Integer.parseInt(b);
        int s = (add.applyAsInt("20", "64"));
        System.out.println(s);
    }

}