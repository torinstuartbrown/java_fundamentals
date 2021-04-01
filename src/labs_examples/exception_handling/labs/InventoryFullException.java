package labs_examples.exception_handling.labs;

public class InventoryFullException extends Exception{
    @Override
    public String toString() {
        return "InventoryFullException{No space to put that}";
    }
}
