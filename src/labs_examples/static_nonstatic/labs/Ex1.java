package labs_examples.static_nonstatic.labs;

public class Ex1 {
    public static void main(String[] args) {
    }
}

class ClassOne{

    public static void staticMethodOne(){
        System.out.println("This is a static method");
    }

    //1) A static method calling another static method in the same class
    public static void staticMethodTwo(){
        staticMethodOne();
    }

    //2) A static method calling a non-static method in the same class
    public static void staticMethodThree(){
        ClassOne obj = new ClassOne();
        obj.nonStaticMethodOne();
    }

    public void nonStaticMethodOne(){
        System.out.println("This is a non static method");
    }

    //5) A non-static method calling a non-static method in the same class
    public void nonStaticMethodTwo(){
        nonStaticMethodOne();

        //7) A non-static method calling a static method in the same class
        staticMethodOne();
    }
}

class ClassTwo{

    //3) A static method calling a static method in another class
    public static void staticMethodThree(){
        ClassOne.staticMethodOne();
    }

    //4) A static method calling a non-static method in another class
    public static void staticMethodFour(){
        ClassOne obj = new ClassOne();
        obj.nonStaticMethodOne();
    }

    //6) A non-static method calling a non-static method in another class
    public void NonStaticMethodFour(){
        ClassOne obj = new ClassOne();
        obj.nonStaticMethodOne();

        //8) A non-static method calling a static method in another class
        ClassOne obj2 = new ClassOne();
        obj2.nonStaticMethodOne();
    }


}
