package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

public class Dessert {
    String name;
    int gramsOfSugar;
    double cost;
    boolean nutSafe;


    //default constructor
    public Dessert(){
        String name = "";
        gramsOfSugar = 0;
        cost = 0.0;
        nutSafe = true;
    }

    //partent method recipe
    public void recipe(){
        System.out.println("Mix ingredients and bake.");
    }

    //constructor
    public Dessert(String name, int gramsOfSugar, double cost, boolean nutSafe){
        this.name = name;
        this.gramsOfSugar = gramsOfSugar;
        this.nutSafe = nutSafe;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGramsOfSguar() {
        return gramsOfSugar;
    }

    public void setGramsOfSguar(int gramsOfSguar) {
        this.gramsOfSugar = gramsOfSguar;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isNutSafe() {
        return nutSafe;
    }

    public void setNutSafe(boolean nutSafe) {
        this.nutSafe = nutSafe;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", gramsOfSugar=" + gramsOfSugar +
                ", cost=" + cost +
                ", nutSafe=" + nutSafe +
                '}';
    }
}
