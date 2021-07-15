package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.stack.labs.TorinsCustomStack;

public class Ex3 {

    public static void main(String[] args) throws Exception {
        TorinsCustomStack<String> myStack = new TorinsCustomStack<>();
        System.out.println(myStack.peakFirst());
//        myStack.pop();
        myStack.push("red");
        myStack.push("blue");
        myStack.push("green");
        myStack.push("yellow");
        myStack.push("black!");

        System.out.println(myStack);
        myStack.print();

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.push("white");
        myStack.push("grey");
        myStack.push("pink");
        myStack.push("orange");
        myStack.push("silver");
        myStack.push("gold");
        myStack.push("bronze");
        myStack.push("brown");
        myStack.push("piano");
        myStack.push("guitar");
        myStack.push("trumpet");
        myStack.push("car");
        myStack.print();
        System.out.println(myStack.pop());
        System.out.println(myStack.peakFirst());
        System.out.println(myStack.peakLast());
    }
    }

