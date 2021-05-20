package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {
    public static void main(String[] args) {
        AnotherThread thread1 = new AnotherThread("First Thread");
    }
}

class AnotherThread extends Thread{
    AnotherThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
    }
}