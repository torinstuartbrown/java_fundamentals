package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {

    public static void main(String[] args) {

        Collection<String> collect = new ArrayList<String>();
        collect.add("Two");
        collect.add("Three");
        collect.add("Four");

        LinkedList<String> myList = new LinkedList();

        myList.add("One");
        myList.addAll(collect);
        myList.addFirst("Zero");
        myList.addLast("Five");
        myList.get(2);
        myList.set(4,"5");
        myList.push("-1");
        myList.pop();
        myList.remove(2);
        boolean yes = myList.contains("Three");
        System.out.println(yes);
        Iterator iter = myList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }
        System.out.println();
        //myList.clear();



        System.out.println(myList);

    }
}
