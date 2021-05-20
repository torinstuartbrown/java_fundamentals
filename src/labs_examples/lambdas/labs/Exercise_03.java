package labs_examples.lambdas.labs;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 3:
 * <p>
 * 1) Demonstrate the use of a static method reference
 * 2) Demonstrate the use of an instance (nonstatic) method reference
 * 3) Demonstrate the use of a constructor reference
 */
public class Exercise_03 {


    public static void main(String[] args) {
        Predicate<String> p1 = (Reference::lessThanTen);
        boolean r1 = p1.test("Hello World");
        boolean r2 = p1.test("Hello");
        System.out.println(r1 + ", " + r2);

        DrinkInterface drinkCreator = Drink::new;


        Drink d1 = drinkCreator.createDrink("Pepsi", "Cola", "Florida");
        System.out.println(d1.toString());

//        Reference n1 = new Reference(8);
//        Reference n2 = new Reference(10);
//
//        boolean b1 = n1.lessThanNum("18");
//        boolean b2 = n2.lessThanNum("15");

        Reference r3 = new Reference(4);
        Predicate<String> p2 = (r3::lessThanNum);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("One");
        l1.add("TWO");
        l1.add("three");

        l1.stream().map(String::toLowerCase).forEach(System.out::println);
        l1.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));
    }

}

class Reference {
    static int num;

    public Reference(int num) {
        this.num = num;
    }

    public static boolean lessThanTen(String s) {
        return s.length() < 10;
    }
    public boolean lessThanNum(String s) {
        return s.length() < num;
    }
}

interface DrinkInterface {
    Drink createDrink(String brand, String type, String location);
}

class Drink {
    String brand;
    String type;
    String location;

    public Drink(String brand, String type, String location) {
        this.brand = brand;
        this.type = type;
        this.location = location;
    }

    @Override
    public String toString() {
        return brand + " manufactures " + type + " in " + location;
    }
}




