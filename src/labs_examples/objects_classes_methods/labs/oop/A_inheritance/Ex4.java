package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Ex4 {

    public static void main(String[] args) {
        Parent c = new Child();
        c.doSomething();
        System.out.println(c.i);
    }
}

    class Parent {
        int i = 4;
        public void doSomething() {
            System.err.println("Parent called");
        }
    }

    class Child extends Parent {
        int i = 9;
        public void doSomething() {
            System.err.println("Child called");
        }
    }
