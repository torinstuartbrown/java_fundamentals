package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class IntelHarddrive implements Harddrive{

    @Override
    public void turnOn() {
        System.out.println("Intel HD turning on");
    }
}
