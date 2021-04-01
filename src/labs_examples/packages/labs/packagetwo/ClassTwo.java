package labs_examples.packages.labs.packagetwo;

import labs_examples.packages.labs.packageone.ClassOne;



public class ClassTwo {

    public static void main(String[] args) {
        PublicMethodTwo();
        ProtectedMethodTwo();
        ClassOne.PublicMethodOne();

        //See that I can call both the public and protected method from this package
        //but ONLY the public method from Class One since the other method is protected.

    }

    public static void PublicMethodTwo(){
        System.out.println("This Method is also public");
    }

    protected static void ProtectedMethodTwo(){
        System.out.println("This Method is also protected");
    }


}
