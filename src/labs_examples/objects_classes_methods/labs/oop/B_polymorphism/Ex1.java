package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.sql.SQLOutput;

public class Ex1 implements Ex1Interface{
    // overloading

    int addition (int a, int b){
        return a+b;
    }

    int addition (int a, int b, int c){
        return a+b+c;
    }

    public void printOpperator(){
        System.out.println("Addition");
    }

    //overriding
    @Override
    public void opperator(){
        System.out.println("Addition");
    }



}
