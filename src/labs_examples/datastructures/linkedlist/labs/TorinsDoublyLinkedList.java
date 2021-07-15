package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

public class TorinsDoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public TorinsDoublyLinkedList(T... data) {
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
            tail = head;
        } else {
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }

            iterator.next = new Node(iterator, data);
            tail = iterator.next;
        }
        size++;
    }

    public int size() {

        return size;
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
            }
            return;
        } else {
            Node iterator = head;
            while (!iterator.next.data.equals(data) && iterator.next != null) {
                iterator = iterator.next;
            }
            if (iterator.next == null) {
                return;
            } else {
                if (iterator.next.next != null) {
                    iterator.next = iterator.next.next;
                    iterator.next.prev = iterator;
                } else {
                    iterator.next = null;
                }
            }
        }
    }
    public void print(){
        Node iterator = head;
        StringBuilder sb = new StringBuilder();

        while(iterator != null){
            sb.append(iterator.data).append(",");
            iterator = iterator.next;
        }
        System.out.println(sb.toString());
    }


}


class DemoDouble {
    public static void main(String[] args) {
        TorinsDoublyLinkedList<String> myDouble = new TorinsDoublyLinkedList();
        myDouble.add("One");
        myDouble.add("Two");
        myDouble.add("Three");
        myDouble.add("Four");
        myDouble.add("Five");
        myDouble.add("Six");
        myDouble.print();
        myDouble.remove("One");
        myDouble.print();
        myDouble.remove("Six");
        myDouble.print();
        myDouble.remove("Four");
        myDouble.print();
    }
}
