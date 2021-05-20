package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

class Ex1 {
    public static void main(String[] args) {
        //lamda
        Part1 p1 = () -> {
            System.out.println("Part two");
        };
        p1.method();

        //anon innerclass
        Part1 anon = new Part1() {
            @Override
            public void method() {
                System.out.println("Part two");
            }
        };
        anon.method();

        //traditional interface implementation
        Demo1 d1 = new Demo1();
        d1.method();

        Part3 addOne = (b) -> b + 1;
        System.out.println(addOne.methodTwo(4));

        Part5 matches = (st1, st2) -> st1.matches(st2);
        System.out.println(matches.methodThree("cat", "cat"));

    }
}

class Demo1 implements Part1{

    @Override
    public void method() {
        System.out.println("Part two");
    }
}

@FunctionalInterface
interface Part1 {
    public void method();
}

@FunctionalInterface
interface Part3 {
    int methodTwo(int a);
}

@FunctionalInterface
interface Part5 {
    boolean methodThree(String s1, String s2);
}

