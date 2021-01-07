package labs_examples.arrays.Practice;

import java.util.ArrayList;

public class arrayListexample {



    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("Is");
        arrayList.add("So");
        arrayList.add("Cool");

        //  String val = arrayList.get(4);
        boolean check = arrayList.contains("Programming");
        System.out.println(check);

        for (String s : arrayList) {
            System.out.println(s);
        }

        int lastIndexOfProgramming = arrayList.lastIndexOf("Programming");



    }
}