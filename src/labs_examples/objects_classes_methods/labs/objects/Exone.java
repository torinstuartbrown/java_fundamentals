package labs_examples.objects_classes_methods.labs.objects;

class Exone {
    public static void main(String[] args) {
        Manufacturer planeManufacturer = new Manufacturer("Boeing");
        Occupency planeOccupency = new Occupency(250);
        Airplane planePlane = new Airplane(planeManufacturer, planeOccupency,100, 50);

        System.out.println("This plane is made by " + planePlane.manufacturer + " has  " + planePlane.occupency + " seats and the current fuel level is "

                + planePlane.currentFuelLevel + " out of " + planePlane.fuelCapacity);

        System.out.println(planePlane.toString());

    }
}


class Manufacturer {

    String brand;

    public Manufacturer(String brand){

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

    double seats;

    public Occupency(double seats){

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
    Manufacturer manufacturer;

    Occupency occupency;

    double fuelCapacity;

    double currentFuelLevel;

    public Airplane(Manufacturer manufacturer, Occupency occupency, double fuelCapacity, double currentFuelLevel){
        this.occupency = occupency;

        this.manufacturer = manufacturer;

        this.fuelCapacity = fuelCapacity;

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

