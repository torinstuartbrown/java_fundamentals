package labs_examples.datastructures.hashmap.labs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Ex1 {
    public static void main(String[] args) {
        HashMap<String, Integer> vendorMap = new HashMap<>();

        vendorMap.put("Dell", 102);
        vendorMap.put("Cisco", 264);
        vendorMap.put("Toshiba", 254);
        vendorMap.put("HP", 764);
        vendorMap.put("Microsoft", 653);

        int c = vendorMap.get("Cisco");
        System.out.println("Cisco's vendor id is: " + c);
        System.out.println("Size: " + vendorMap.size());
        boolean validVendor = vendorMap.containsKey("Dell");
        boolean validId = vendorMap.containsValue("653");

        System.out.println("Is Dell a valid vendor? " + validVendor);
        System.out.println("Is 777 a valid vendor id? " + validId);

        System.out.println("Key set: " + vendorMap.keySet());

        vendorMap.remove("HP");

        System.out.println("Entry set: " +vendorMap.entrySet());

        vendorMap.replace("Cisco", 264, 574);

        c = vendorMap.get("Cisco");
        System.out.println("Cisco's vendor id is: " + c);

        vendorMap.putIfAbsent("Acer", 341);

        //thought this wasnt supposed to change?
        vendorMap.putIfAbsent("HP", 74);

        System.out.println("Entry set: " +vendorMap.entrySet());

        vendorMap.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });

        HashMap<String, Integer> newMap = new HashMap<String, Integer>();
        newMap.putAll(vendorMap);

        System.out.println("Entry set: " + newMap.entrySet());
        vendorMap.clear();
        System.out.println("Entry set: " + vendorMap.entrySet());



    }
}
