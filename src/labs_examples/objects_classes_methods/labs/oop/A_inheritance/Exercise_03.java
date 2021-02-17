package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 * Class A Constructor
 * Class B Constructor
 * Class C Constructor
 * You answer: Since C inherts B which inherts A and each contain a method that prints "Class # Constructor" when Ex_03
 * runs C_1 all of the above print lines have been inherted into the method?
 */

class A_1 {
    public A_1() {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1() {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1() {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args) {
        C_1 c = new C_1();
    }
}
