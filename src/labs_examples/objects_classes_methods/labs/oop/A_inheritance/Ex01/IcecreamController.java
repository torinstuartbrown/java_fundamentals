package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Ex01;

//controller
public class IcecreamController {
    public static void main(String[] args) {

        Icecream lemonIceCream = new Icecream("Lucy's Lemon",32,4.99,false,"Meyer Lemon",false,"IC");
        Icecream defaultIceCream = new Icecream();
        Dessert defaultDessert = new Dessert();
        Softserve oreoSoftServe = new Softserve("Ollie's Oreo", 30, 3.99, true,"Cookies&Cream",false,"SS","Oreos");

        System.out.println(defaultDessert);
        defaultDessert.recipe();
        System.out.println();
        //default dessert does not have access to getNutWarning as it is in icecream class

        System.out.println(defaultIceCream);
        defaultIceCream.recipe();
        defaultIceCream.getNutWarning(defaultIceCream.nutSafe);
        System.out.println();
        //difference between .nutsafe and .isnutsafe?

        System.out.println(lemonIceCream);
        lemonIceCream.recipe();
        double lemonICFreezingTemp = lemonIceCream.getFreezingTemp(lemonIceCream.gramsOfSugar);
        System.out.println("The Freezing temp of " + lemonIceCream.name + " is "+ lemonICFreezingTemp);
        lemonIceCream.getNutWarning(lemonIceCream.isNutSafe());
        System.out.println();


        //Why isn't this working?
        System.out.println(oreoSoftServe);
        double oreoSSFreezingTemp = oreoSoftServe.getFreezingTemp(oreoSoftServe.gramsOfSugar);
        System.out.println("The Freezing temp of " + oreoSoftServe.name + " is "+ oreoSSFreezingTemp);
        oreoSoftServe.getNutWarning(oreoSoftServe.nutSafe);
        oreoSoftServe.recipe();



    }


}
