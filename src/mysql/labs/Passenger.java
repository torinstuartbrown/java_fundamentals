package mysql.labs;

public class Passenger {
    private int passenger_Id;
    private String name;
    private String email;
    private String country_Of_Origin;
    private String meal_prefrences;

    public Passenger() {
    }

    public Passenger(int passenger_Id, String name, String email, String country_Of_Origin, String meal_prefrences) {
        this.passenger_Id = passenger_Id;
        this.name = name;
        this.email = email;
        this.country_Of_Origin = country_Of_Origin;
        this.meal_prefrences = meal_prefrences;
    }

    public int getPassenger_Id() {
        return passenger_Id;
    }

    public void setPassenger_Id(int passenger_Id) {
        this.passenger_Id = passenger_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry_Of_Origin() {
        return country_Of_Origin;
    }

    public void setCountry_Of_Origin(String country_Of_Origin) {
        this.country_Of_Origin = country_Of_Origin;
    }

    public String getMeal_prefrences() {
        return meal_prefrences;
    }

    public void setMeal_prefrences(String meal_prefrences) {
        this.meal_prefrences = meal_prefrences;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_Id=" + passenger_Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country_Of_Origin='" + country_Of_Origin + '\'' +
                ", meal_prefrences='" + meal_prefrences + '\'' +
                '}';
    }
}

