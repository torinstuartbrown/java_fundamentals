package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

class Softserve extends Icecream{
    String addIn;

    public Softserve(){
        super();
        addIn = "";
    }

    //constructor
    public Softserve(String name, int gramsOfSugar, double cost, boolean nutSafe, String flavor, boolean nonDairy, String base, String addIn) {
        super(name, gramsOfSugar,cost, nutSafe, flavor, nonDairy, base, addIn);
        addIn = "";
    }
}
