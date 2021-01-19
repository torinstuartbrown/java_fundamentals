package labs_examples.objects_classes_methods.labs.objects.Ex3;

public class RoadbikeController {
    public static void main(String[] args) {
        Roadbike newRoadbike = new Roadbike();
        newRoadbike.setBrand("Giant");
        newRoadbike.setTubeless(true);
        newRoadbike.setSize(54);
        System.out.println(newRoadbike.toString());

        Roadbike oldRoadbike = new Roadbike("Trek", 56, false);
        System.out.println(oldRoadbike.toString());

        Roadbike nextRoadbike = new Roadbike("Fuji");
        System.out.println(nextRoadbike.toString());
    }
}
