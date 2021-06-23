package mysql.labs;

public class Flights {
    private int flight_id;
    private int duration;
    private String departure_time;
    private String arrival_int;
    private int arrival_id;
    private int departure_id;
    private int plane_id;

    public Flights() {
    }

    public Flights(int flight_id, int duration, String departure_time, String arrival_int, int arrival_id, int departure_id, int plane_id) {
        this.flight_id = flight_id;
        this.duration = duration;
        this.departure_time = departure_time;
        this.arrival_int = arrival_int;
        this.arrival_id = arrival_id;
        this.departure_id = departure_id;
        this.plane_id = plane_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_int() {
        return arrival_int;
    }

    public void setArrival_int(String arrival_int) {
        this.arrival_int = arrival_int;
    }

    public int getArrival_id() {
        return arrival_id;
    }

    public void setArrival_id(int arrival_id) {
        this.arrival_id = arrival_id;
    }

    public int getDeparture_id() {
        return departure_id;
    }

    public void setDeparture_id(int departure_id) {
        this.departure_id = departure_id;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(int plane_id) {
        this.plane_id = plane_id;
    }
}
