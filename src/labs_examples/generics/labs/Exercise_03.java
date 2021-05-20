package labs_examples.generics.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03{
    public <U extends Number> double addition(U x, U y){
        double s = x.doubleValue() + y.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        Exercise_03 obj = new Exercise_03();
        double sum = obj.addition(2.2, 3.3);
        System.out.println(sum);
        sum = obj.addition(2, 3.1);
        System.out.println(sum);
    }

    public static <S extends Collection> void countStrings(S s){
        System.out.println(s.size());
    }

    public <A> void exchange(A[] a){

        A t = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = t;

    }

    public static <K extends Comparable> K maxValue (List<K> list, int begin, int end){
        K max = list.get(begin);
        for (int i = begin + 1; i < end; i++){
            K value1 = list.get(i);
            if(value1.compareTo(max) > 0)
                max = value1;
        }
        return max;
    }

}