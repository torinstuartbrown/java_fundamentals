package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Computer {
    Monitor monitor;
    Harddrive harddrive;
    public void start(){
        monitor.turnOn();
        harddrive.turnOn();
    }

    public Computer(Monitor monitor, Harddrive harddrive) {
        this.monitor = monitor;
        this.harddrive = harddrive;
    }
}

class Controller{
    public static void main(String[] args) {
        Computer myComputer = new Computer(new SonyMonitor(),new DellHarddrive());
        Computer yourComputer = new Computer(new SamsungMonitor(), new IntelHarddrive());
        myComputer.start();
        yourComputer.start();
    }
}