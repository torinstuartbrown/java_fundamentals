package labs_examples.enumerations.labs;

public enum StringedInstrument {
    GUITAR(6, "Medium"),
    BASS(4, "Large"),
    UKULELE(4, "Small"),
    VIOLIN(4, "Small"),
    HARP(47, "Large");

    private final int numStrings;
    private final String size;

    StringedInstrument(int numStrings, String  size) {
        this.numStrings = numStrings;
        this.size = size;
    }

    @Override
    public String toString() {
        return "StringedInstrument{" +
                "numStrings=" + numStrings +
                ", size='" + size + '\'' +
                '}';
    }
}

class AboutInstrument{
    public static void main(String[] args) {
        StringedInstrument si = StringedInstrument.GUITAR;
        System.out.println(si);
    }
}