package labs_examples.objects_classes_methods.labs.objects.Ex3;

public class RoadbikeController {
    public static void main(String[] args) {
    Roadbike newRoadbike = new Roadbike();
    newRoadbike.setBrand("Giant");
    newRoadbike.setTubeless(true);
    newRoadbike.setSize(54);
        System.out.println(newRoadbike.toString());


    Roadbike oldRoadbike = new Roadbike();
    oldRoadbike.setBrand("Trek");
    oldRoadbike.setTubeless(false);
    oldRoadbike.setSize(56);
        System.out.println(oldRoadbike.toString());


    Roadbike nextRoadbike = new Roadbike();
    nextRoadbike.setSize(54);
    nextRoadbike.setBrand("Fuji");
    nextRoadbike.setTubeless(true);
        System.out.println(nextRoadbike.toString());
    }


}
