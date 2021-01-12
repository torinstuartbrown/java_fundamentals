package labs_examples.objects_classes_methods.labs.objects.demo;

import java.util.ArrayList;

public class MusicStore {
   private ArrayList<Guitar> electricGuitars = new ArrayList<>();
    private ArrayList<Guitar> acousticGuitars = new ArrayList<>();

    public ArrayList<Guitar> getElectricGuitars() {
        return electricGuitars;
    }

    public void setElectricGuitars(ArrayList<Guitar> electricGuitars) {
        this.electricGuitars = electricGuitars;
    }

    public ArrayList<Guitar> getAcousticGuitars() {
        return acousticGuitars;
    }

    public void setAcousticGuitars(ArrayList<Guitar> acousticGuitars) {
        this.acousticGuitars = acousticGuitars;
    }
}
