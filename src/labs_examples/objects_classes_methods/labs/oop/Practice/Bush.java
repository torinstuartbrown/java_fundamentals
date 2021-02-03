package labs_examples.objects_classes_methods.labs.oop.Practice;

public class Bush extends Plant{
    boolean hasBerries;

    @Override
    public String toString() {
        return "Bush{" +
                "hasBerries=" + hasBerries +
                '}';
    }

    public Bush(boolean hasBerries){
        this.hasBerries = hasBerries;
        setType("Bush");
        setMaxHeight(10);

    }

}
