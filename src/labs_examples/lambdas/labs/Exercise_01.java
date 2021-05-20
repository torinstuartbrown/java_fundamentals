package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 * <p>
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface.
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */
@FunctionalInterface
interface Demo {
    public void method();
}

@FunctionalInterface
interface Demo2<T extends Number> {
    public T method2(T a, T b);
}

class Example {
    public static void main(String[] args) {
        Demo d = () -> {
            System.out.println("Demo");
        };
        d.method();

        Demo e = () -> System.out.println("Demo2");
        e.method();

        Demo t = new Demo() {
            @Override
            public void method() {
                System.out.println("Demo3");
            }
        };

        t.method();
        Example2 f = new Example2();
        f.method();

        BiFunction<String, String, Integer> obj = (a, b) -> {
            int i = Integer.parseInt(a);
            int x = Integer.parseInt(b);
            return i + x;
        };

        int b = obj.apply("7", "9");
        System.out.println(b);
    }

    Demo2<Double> k = (Double a, Double b) -> {
        double q = a + b;
        return q;
    };

    public static void test(Demo f) {
        f.method();

    }


}

class Example2 implements Demo {

    @Override
    public void method() {
        System.out.println("Demo4");
    }

}

@FunctionalInterface
interface moreThanFifty {
    public boolean moreThan(int a, int b);
}
