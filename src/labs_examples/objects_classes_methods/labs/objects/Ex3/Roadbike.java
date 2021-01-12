package labs_examples.objects_classes_methods.labs.objects.Ex3;


public class Roadbike {
    private String brand;
    private int size;
    private boolean tubeless;

    public Roadbike(){}

    public Roadbike(String brand, int size, boolean tubeless) {
        this.brand = brand;
        this.size = size;
        this.tubeless = tubeless;
    }

    @Override
    public String toString() {
        return "Roadbike{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", tubeless=" + tubeless +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isTubeless() {
        return tubeless;
    }

    public void setTubeless(boolean tubeless) {
        this.tubeless = tubeless;
    }
}
