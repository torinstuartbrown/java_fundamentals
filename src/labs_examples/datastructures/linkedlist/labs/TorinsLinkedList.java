package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;
import labs_examples.datastructures.linkedlist.examples.Node;

import java.util.LinkedList;


public class TorinsLinkedList<T> {


    private Node<T> head;
    private int size;

    public TorinsLinkedList(T... data) {
        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    public void add(T data) {
        insert(data);
    }

    public void insert(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }

            iterator.next = new Node(data);

        }
        size++;
    }

    public int size() {

        return size;
    }

    public void remove(T data) {
        if (head == null){
            return;
        }
        if(head.data.equals(data)){
            if(head.next != null){
                head = head.next;
            } else{
                head = null;
            }
            return;
        } else {
            Node iterator = head;
            while (!iterator.next.data.equals(data) && iterator.next != null){
                iterator = iterator.next;
            }
            if (iterator.next == null){
                return;
            } else{
                if(iterator.next.next != null){
                    iterator.next = iterator.next.next;
                } else {
                    iterator.next = null;
                }
            }
        }

    }


    public T get(int index) throws Exception {
        if (index > size) {
            throw new Exception("Index out of bounds: " + index);
        }

        try {

            int count = 0;

            Node iterator = head;

            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;

        } catch (NullPointerException ex) {
            return null;
        }
    }


    public int indexOf(T o) throws Exception {
        int index = 0;
        if (size == 0) {
            return -1;
        }
        if (o == null) {
            throw new Exception("Unable to find index of null");

        } else {
            Node iterator = head;
            if (o.equals(head.data)) {
                return index;
            }
            index++;
            while (iterator.next != null) {
                iterator = iterator.next;
                if(o.equals(iterator.data)){
                    return index;
                }
                index++;

            }
        }
        return index;
    }


    public String toString() {
        Node iterator = head;
        String output = "";

        // iterate through list
        while (iterator != null) {
            output += iterator.data + " ";
            iterator = iterator.next;
        }

        return output;
    }

    public boolean isEmpty() {
        return head == null;
    }
}


