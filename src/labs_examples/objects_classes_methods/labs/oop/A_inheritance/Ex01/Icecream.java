package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

class Icecream extends Dessert {
    String flavor;
    boolean nonDairy;
    String base;

    public Icecream(){
        super();
        flavor = "";
        nonDairy = true;
        base = "";
    }

    //constructor
    public Icecream(String name, int gramsOfSugar, double cost, boolean nutSafe, String flavor, boolean nonDairy, String base) {
        super(name, gramsOfSugar, cost, nutSafe);
        flavor = "";
        nonDairy = true;
        base = "";
    }

    public Icecream(String name, int gramsOfSugar, double cost, boolean nutSafe, String flavor, boolean nonDairy, String base, String addIn) {
    }
}
