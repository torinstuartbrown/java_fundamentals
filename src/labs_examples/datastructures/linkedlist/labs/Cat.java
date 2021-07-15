package labs_examples.datastructures.linkedlist.labs;

public class Cat {
    String breed;
    String name;
    Cat next;
}
class Demo{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.next = cat2;
    }
}