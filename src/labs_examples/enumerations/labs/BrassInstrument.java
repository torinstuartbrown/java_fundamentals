package labs_examples.enumerations.labs;

public enum BrassInstrument {
    TUBA,
    TRUMPET,
    TROMBONE,
    BARITONE,
    FRENCHHORN;

}
class FristEnum {
    public static void main(String[] args) {
        BrassInstrument newBrass = BrassInstrument.TRUMPET;
        System.out.println("I just bought a " + newBrass);
    }
}