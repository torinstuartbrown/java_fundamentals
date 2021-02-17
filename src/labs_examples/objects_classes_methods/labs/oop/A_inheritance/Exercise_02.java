package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: This prints 10 because while B extends A we are returning a methods of class A called a. So we return the value of i from A.
 *
 */
class A {
    int i = 10;
    int y = 5;
    public void printA(){
        System.out.println("A");
    }
}

class B extends A{
    int i = 20;
    int x = 30;
    public void printB(){
        System.out.println("B");
    }
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.y);

        System.out.println(a.i);

    }
}