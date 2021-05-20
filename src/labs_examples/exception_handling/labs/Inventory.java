package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        try {
            findItem();
        } catch (InventoryFullException e){
            System.out.println(e.toString());
        }
    }

    public static void findItem() throws InventoryFullException{
        pickUpItem();
    }

    public static void pickUpItem() throws InventoryFullException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the item larger than 10oz?");
        String response = scanner.next();

        if(response.equalsIgnoreCase("y")){
            throw new InventoryFullException();
        }

        System.out.println("Item added to inventory.");
    }
}
