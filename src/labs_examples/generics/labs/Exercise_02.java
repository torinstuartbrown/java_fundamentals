package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */
public class Exercise_02 {
    public static <N extends Number> double totalSum (List<N> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(10);

        double x = totalSum(l);
        System.out.println(x);

        List<Double> d = new ArrayList();
        d.add(7.4);
        d.add(1.2);
        d.add(9.9);

        double y = totalSum(d);
        System.out.println(y);
    }

}