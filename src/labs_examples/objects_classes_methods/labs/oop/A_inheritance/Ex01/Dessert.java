package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Dessert {
    String name;
    int gramsOfSguar;
    double cost;
    boolean nutSafe;


    //default constructor
    public Dessert(){
        String name = "";
        gramsOfSguar = 0;
        cost = 0.0;
        nutSafe = true;
    }

    //constructor
    public Dessert(String name, int gramsOfSugar, double cost, boolean nutSafe){
        this.name = name;
        this.gramsOfSguar = gramsOfSugar;
        this.nutSafe = nutSafe;
        this.cost = cost;
    }


}
