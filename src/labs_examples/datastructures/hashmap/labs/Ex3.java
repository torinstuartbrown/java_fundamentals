package labs_examples.datastructures.hashmap.labs;

import sun.misc.Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Ex3 {

    public static void main(String[] args) {


        LinkedList<Integer> thisList = new LinkedList();
        Stack<Integer> thisStack = new Stack();
        PriorityQueue<Integer> thisQueue = new PriorityQueue<>();
        HashMap<Integer, String> thisHashmap = new HashMap();


        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            thisList.add(i + 2);
        }

        for (int i = 0; i < 100; i++) {
            thisList.set(i, i);
        }

        boolean isThere;

        for (int i = 0; i < 100; i++) {
            isThere = thisList.contains((i));
        }

        for (int i = 0; i < 100; i++) {
            thisList.remove();
        }

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds for linked list: " + timeElapsed);

        startTime = System.currentTimeMillis();


        for (int i = 0; i < 100; i++) {
            thisStack.add(i + 2);
        }

        for (int i = 0; i < 100; i++) {
            thisStack.set(i, i);
        }

        for (int i = 0; i < 100; i++) {
            isThere = thisStack.contains((i));
        }

        for (int i = 0; i < 100; i++) {
            thisStack.pop();
        }


        endTime = System.currentTimeMillis();

        timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds for stack: " + timeElapsed);

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            thisQueue.add(i);
        }

        System.out.println("cannot update elements in queue");

        for (int i = 0; i < 100; i++) {
            isThere = thisQueue.contains((i));
        }

        for (int i = 0; i < 100; i++) {
            thisQueue.remove();
        }

        endTime = System.currentTimeMillis();

        timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds for queue: " + timeElapsed);

        startTime = System.currentTimeMillis();


        for (int i = 0; i < 100; i++) {
            thisHashmap.put(i, "hello");
        }

        for (int i = 0; i < 100; i++) {
            thisHashmap.replace(i, "hello", "world");
        }


        for (int i = 0; i < 100; i++) {
            isThere = thisHashmap.containsKey(i);
        }

        for (int i = 0; i < 100; i++) {
            thisHashmap.remove(i);
        }

        endTime = System.currentTimeMillis();

        timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds for hashmap: " + timeElapsed);

        startTime = System.currentTimeMillis();

    }

}
