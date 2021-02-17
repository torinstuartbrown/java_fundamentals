package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

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
        this.flavor = flavor;
        this.nonDairy = nonDairy;
        this.base = base;
    }

    public double getFreezingTemp(int gramsOfSugar){
        double freezingTemp = gramsOfSugar * 0.5;
        return freezingTemp;
    }

    public void getNutWarning(boolean nutSafe) {
        if (nutSafe == true) {
            System.out.println("Allergen safe");
        } else {
            System.out.println("WARNING this product contains or was manufactured in a facility with nut products.");
        }
    }

    @Override
    public void recipe(){
        System.out.println("Mix ingredients and churn.");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isNonDairy() {
        return nonDairy;
    }

    public void setNonDairy(boolean nonDairy) {
        this.nonDairy = nonDairy;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Icecream{" +
                "name='" + name + '\'' +
                ", gramsOfSugar=" + gramsOfSugar +
                ", cost=" + cost +
                ", nutSafe=" + nutSafe +
                ", flavor='" + flavor + '\'' +
                ", nonDairy=" + nonDairy +
                ", base='" + base + '\'' +
                '}';
    }
}

