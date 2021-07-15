package labs_examples.datastructures.queue.labs;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

public class Ex1 {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        System.out.println(myQueue.peek());
        boolean hasJava = myQueue.contains("Two");
        System.out.println(hasJava);
        myQueue.remove("One");
        String s = myQueue.element();
        System.out.println("S is " + s);
        myQueue.size();
        myQueue.offer("Blue");
        myQueue.toArray();
        myQueue.poll();
        myQueue.clear();
    }
}
