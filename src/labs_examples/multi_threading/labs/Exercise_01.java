package labs_examples.multi_threading.labs;

import javafx.scene.layout.Priority;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("** Main Thread Start **");
        NewRunnable runnable1 = new NewRunnable();
        Thread thread1 = new Thread(runnable1, "option1");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        Thread thread2 = new Thread(new NewRunnable(), "option2");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        thread2.start();

        new Thread(new NewRunnable(), "Option3").start();

        System.out.println("** Main Thread End **");
    }
}

class NewRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
    }
}






