package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

class Softserve extends Icecream{
    String addIn;

    public Softserve(){
//        super();
        addIn = "";
    }

    //constructor
    public Softserve(String name, int gramsOfSugar, double cost, boolean nutSafe, String flavor, boolean nonDairy, String base, String addIn) {
        super(name, gramsOfSugar,cost, nutSafe, flavor, nonDairy, base);
        this.addIn = addIn;
    }

    public String getAddIn() {
        return addIn;
    }

    public void setAddIn(String addIn) {
        this.addIn = addIn;
    }

    @Override
    public double getFreezingTemp(int gramsOfSugar){
        double freezingTemp = gramsOfSugar * 0.75;
        return freezingTemp;
    }

    @Override
    public void getNutWarning(boolean nutSafe) {
        System.out.println("WARNING all SoftServe products are mixed in a equipment that also processes nuts.");
    }

    public Softserve(String addIn) {
        this.addIn = addIn;
    }

    @Override
    public String toString() {
        return "Softserve{" +
                "name='" + name + '\'' +
                ", gramsOfSugar=" + gramsOfSugar +
                ", cost=" + cost +
                ", nutSafe=" + nutSafe +
                ", flavor='" + flavor + '\'' +
                ", nonDairy=" + nonDairy +
                ", base='" + base + '\'' +
                ", addIn='" + addIn + '\'' +
                '}';
    }
}
