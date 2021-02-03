package labs_examples.objects_classes_methods.labs.oop.Practice;

public class Plant {
    private int height;
    private int maxHeight;
    private String type;



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", maxHeight=" + maxHeight +
                ", type='" + type + '\'' +
                '}';
    }
}
