package labs_examples.multi_threading.labs;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {

    public static void main(String args[]) {

        Counter cnt = new Counter();
        ThreadedCount s1 = new ThreadedCount(cnt, "trd1");
        ThreadedCount s2 = new ThreadedCount(cnt, "trd2");
        s1.start();
        s2.start();

    }
}

class Counter {
    int count = 0;

    public synchronized void count() {

        count++;

        System.out.println(count + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
            notifyAll();
            wait();
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
    public synchronized void count2() {

        count++;

        System.out.println(count + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
            notifyAll();
            wait();
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }

    }
}


class ThreadedCount extends Thread {

    Counter counter;


    ThreadedCount(Counter obj, String name) {
        super(name);
        counter = obj;
    }

    public void run() {
        if (Thread.currentThread().getName().equalsIgnoreCase("trd1")){
            for (int k = 0; k < 50; k++) {
                counter.count();
            }
        } else {
            for (int k = 0; k < 50; k++) {
                counter.count2();
            }
        }
    }
}


