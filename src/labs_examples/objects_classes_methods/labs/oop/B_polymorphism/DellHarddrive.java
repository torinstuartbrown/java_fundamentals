package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DellHarddrive implements Harddrive{
    @Override
    public void turnOn() {
        System.out.println("Dell HD turning on");
    }
}
