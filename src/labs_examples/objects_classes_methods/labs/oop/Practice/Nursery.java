package labs_examples.objects_classes_methods.labs.oop.Practice;

public class Nursery {
    public static void main(String[] args) {
        Tree newTree = new Tree(true);
        Bush newBush = new Bush(false);
        Plant newPlant = new Plant();

        System.out.println(newBush.toString());
        System.out.println(newTree.toString());
        System.out.println(newPlant.toString());
    }
}
