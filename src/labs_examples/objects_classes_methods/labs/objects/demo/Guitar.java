package labs_examples.objects_classes_methods.labs.objects.demo;

public class Guitar {
    private String brand;
    private int numStrings;
    private boolean electric;

    //my.guitar
    public Guitar(){}

    //electric.guitar
    public Guitar(boolean electric){
        this.electric = electric;
    }

    //ryan.guitar
    public Guitar(String brand, int numStrings, boolean electric) {
        this.brand = brand;
        this.numStrings = numStrings;
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "brand='" + brand + '\'' +
                ", numStrings=" + numStrings +
                ", electric=" + electric +
                '}';


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        if (numStrings > 0)
            this.numStrings = numStrings;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
