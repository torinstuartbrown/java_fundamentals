package labs_examples.datastructures.queue.labs;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        TorinsCustomQueue<String> myQueue = new TorinsCustomQueue();
        myQueue.add("Zero");
        myQueue.add("one");
        myQueue.print();
        myQueue.add("two");
        myQueue.add("three");
        myQueue.print();

        System.out.println("Size: " + myQueue.size());

        System.out.println("Pop: " + myQueue.pop());
        myQueue.print();
        System.out.println("Peeking first: " + myQueue.peakFirst());
        System.out.println("Pop: " + myQueue.pop());

        System.out.println("Size: " + myQueue.size());
        myQueue.print();
        myQueue.clear();
        System.out.println("Cleared");
        myQueue.print();
        myQueue.add("newZero");
        myQueue.add("newOne");
        myQueue.add("newTwo");
        System.out.println("Peeking first: " + myQueue.peakFirst());

        myQueue.print();
        System.out.println("Size: " + myQueue.size());
        System.out.println("Peeking last: " + myQueue.peakLast());
        myQueue.add("newThree");
        myQueue.add("newFour");
        myQueue.add("newFive");
        myQueue.add("newSix");
        myQueue.add("newSeven");
        myQueue.add("newEight");

        myQueue.clear();
        System.out.println("Cleared");
        myQueue.add("thirdone");
        System.out.println("size: " + myQueue.size());
        System.out.println("Length: " + myQueue.length());
        myQueue.print();
        System.out.println("Peeking first: " + myQueue.peakFirst());


    }
}
