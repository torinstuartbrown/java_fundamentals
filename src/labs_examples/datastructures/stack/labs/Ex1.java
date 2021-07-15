package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();
        if (myStack.empty()){
            System.out.println("Empty Stack");
        }
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.search("Two"));
    }
}
