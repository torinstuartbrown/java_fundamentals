package labs_examples.objects_classes_methods.labs.objects;

class Exone {
    public static void main(String[] args) {
        Manufacturer planeManufacturer = new Manufacturer("Boeing");
        Occupency planeOccupency = new Occupency(250);
        Airplane planePlane = new Airplane(planeManufacturer, planeOccupency,100, 50);

        System.out.println("This plane is made by " + planePlane.getManufacturer().getBrand() + " has  " +
                planePlane.getOccupency().getSeats() + " seats and the current fuel level is " +
                planePlane.getCurrentFuelLevel() + " out of " + planePlane.getFuelCapacity());

        System.out.println(planePlane.toString());

    }
}


class Manufacturer {

    private String brand;

    public Manufacturer(String brand){

        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

class Occupency {

    private double seats;

    public Occupency(double seats){

        this.seats = seats;
    }

    public double getSeats() {
        return seats;
    }

    public void setSeats(double seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Occupency{" +
                "seats=" + seats +
                '}';
    }
}

class Airplane {
    private Manufacturer manufacturer;

    private Occupency occupency;

    private double fuelCapacity;

    private double currentFuelLevel;

    public Airplane(Manufacturer manufacturer, Occupency occupency, double fuelCapacity, double currentFuelLevel){
        this.occupency = occupency;

        this.manufacturer = manufacturer;

        this.fuelCapacity = fuelCapacity;

        this.currentFuelLevel = currentFuelLevel;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Occupency getOccupency() {
        return occupency;
    }

    public void setOccupency(Occupency occupency) {
        this.occupency = occupency;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer=" + manufacturer +
                ", occupency=" + occupency +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

