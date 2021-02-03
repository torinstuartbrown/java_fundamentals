package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Bakedgood extends Dessert {
//    boolean glutenFree;
//    boolean frosted;
//    String flourType;
    double bakingTemp;

    public void getBakingTime(){
        System.out.println("Baking time is equal to bakingTemp / 4");
    }

    public Bakedgood(){
        bakingTemp = 0;
    }

    //constructor
    public Bakedgood(double bakingTemp){
        this.bakingTemp = bakingTemp;
    }
}
