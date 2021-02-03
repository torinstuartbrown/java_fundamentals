package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Cake extends Bakedgood {
//    String spongeType;
    int servingsPerCake;

    public Cake(double bakingTemp){
        super();
        servingsPerCake = 0;
    }

    @Override
    public void getBakingTime(){
        System.out.println("Baking time is equal to bakingTemp / 4 plus" + servingsPerCake);
    }
}
