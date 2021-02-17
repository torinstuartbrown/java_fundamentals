package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SamsungMonitor implements Monitor{
    @Override
    public void turnOn() {
        System.out.println("Samsung Monitor turning on");
    }
}
