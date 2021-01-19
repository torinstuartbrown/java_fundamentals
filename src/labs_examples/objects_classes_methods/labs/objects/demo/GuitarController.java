package labs_examples.objects_classes_methods.labs.objects.demo;

public class GuitarController {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.setNumStrings(6);
        myGuitar.setBrand("Taylor");
        myGuitar.setElectric(true);
        System.out.println(myGuitar.toString());




        Guitar ryanGuitar = new Guitar("Fender", 12, false);
        System.out.println(ryanGuitar.toString());

        Guitar electricGuitar = new Guitar(true);
        System.out.println(electricGuitar.toString());

        MusicStore store = new MusicStore();
        store.getElectricGuitars().add(myGuitar);
        store.getAcousticGuitars().add(ryanGuitar);


    }

}
