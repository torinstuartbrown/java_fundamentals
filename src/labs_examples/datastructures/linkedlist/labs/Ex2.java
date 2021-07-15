package labs_examples.datastructures.linkedlist.labs;
import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex2<T> {
    public static void main(String[] args) throws Exception {
        TorinsLinkedList myList2 = new TorinsLinkedList();
        myList2.add("Hi");
        myList2.add("Bye");
        System.out.println(myList2);
        System.out.println(myList2.indexOf("Hi"));
        myList2.remove(myList2.indexOf("Hi"));
        System.out.println(myList2);
        try{ System.out.println(myList2.get(myList2.indexOf("Bye")));}
        catch (Exception x){
            System.out.println(x.getMessage());
        };

        TorinsDoublyLinkedList myList3 = new TorinsDoublyLinkedList();
        myList3.add(6);
        System.out.println(myList3);

    }


}
