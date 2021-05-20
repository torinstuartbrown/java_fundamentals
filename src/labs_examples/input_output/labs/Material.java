package labs_examples.input_output.labs;

import java.io.Serializable;

public class Material implements Serializable {
    private int id;
    private String type;
    private double cost;
    private double weight;
    private String description;

    public Material() {
    }

    public Material(int id, String type, double cost, double weight, String description) {
        this.id = id;
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
