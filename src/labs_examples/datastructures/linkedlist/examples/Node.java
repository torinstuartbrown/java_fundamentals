package labs_examples.datastructures.linkedlist.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class Node<T> {
    // a "link" to the "next" Node in the LinkedList
    public Node<T> next;
    // a "link" to the "previous" Node in the LinkedList
    public Node<T> prev;

    // a generic variable to hold the data we want to store in the list
    public T data;



    // a simple constructor that takes in data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public Node(T data, Node node) {
        this.data = data;
        this.next = node;

    }

    public Node(Node<T> prev, T data) {
        this.prev = prev;
        this.data = data;
    }
}