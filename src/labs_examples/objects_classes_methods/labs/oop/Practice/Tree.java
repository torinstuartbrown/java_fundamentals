package labs_examples.objects_classes_methods.labs.oop.Practice;

public class Tree extends Plant{
    boolean hardwood;

    public Tree(boolean hardwood){
         this.hardwood = hardwood;
         setMaxHeight(300);
         setType("Tree");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "hardwood=" + hardwood +
                '}';
    }
}
