package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread Interrupted.");
        }
        System.out.println("\n" + msg + "Send");
    }
}

class ThreadedSend extends Thread{
    private String msg;
    private Thread t;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run(){
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

class SyncDemo {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend(" HI ", snd);
        ThreadedSend s2 = new ThreadedSend(" Bye ", snd);
        s1.start();
        s2.start();

        try{
            s1.join();
            s2.join();
        } catch (Exception e){
            System.out.println("Interrupted");
        }

    }
}