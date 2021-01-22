package labs_examples.objects_classes_methods.labs.methods;


import labs_examples.objects_classes_methods.labs.objects.demo.Guitar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MethodTraining {


    public static void main(String[] args) {
        double a = 5;
        double b = 50;


        // 2
        System.out.println("Demonstrate the difference between pass by value and pass by reference");
        passByValue(a, b);
        System.out.println();
        System.out.println("3) Create a method that will return the largest of 4 numbers (all of which are passed in as " +
                "arguments)");
        int largestNumber = largestNum(4, 93, 29, 0);
        System.out.println(largestNumber);
        System.out.println();
        countConsonants("");
        System.out.println();
        System.out.println( "5) Write a method that will print some kind of ascii art to the console Google ascii art if " +
                "needed)");
        art("print");
        System.out.println();
        System.out.println("6) Write a method that will determine whether or not a number is prime");
        boolean isNumberPrime = isPrime(7);
        System.out.println("If the number entered was prime print true, if not print false:");
        System.out.println(isNumberPrime);

        System.out.println("  7) Write a method that will return a small array containing the highest and lowest numbers " +
                "in a given numeric array, which is passed in as an argument");



        minMax(new int[]{23, 4, 9, 999});
        System.out.println();

        System.out.println(" 8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.\n" +
                "//            In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is\n" +
                "//            divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the\n" +
                "//            length of the returned list");
        arrayList1(50, 2, 10);
        System.out.println();
        System.out.println("    //            9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot\n" +
                "//            instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this\n" +
                "//            variable is used to temporarily store individual values in the array");
        arrayReverser(new int[]{1, 2, 3, 4});
        System.out.println();

    }

    //    1) Demonstrate method overloading in this class
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

//    2) Demonstrate the difference between "pass by value" and "pass by reference"

    // pass by value
    public static void passByValue(double a, double b) {
        a = a * 2;
        System.out.println(a);
        b = b * 10;
        System.out.println(b);
    }

    public static void passByReference(String[] args) {
        Guitar methodGuitar = new Guitar("Fender", 12, false);
        System.out.println(methodGuitar.toString());
        makeGuitarElectric(methodGuitar);
        System.out.println(methodGuitar.toString());

    }

    public static void makeGuitarElectric(Guitar guitar) {
        guitar.electric = true;

    }
//            3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)

    public static int largestNum(int x, int y, int z, int i) {
        int l = 0;
        if (x > y && x > y && x > i) {
            l = x;
        }
        if (y > x && y > z && y > i) {
            l = y;
        }
        if (z > x && z > y && z > i) {
            l = z;
        }
        if (i > x && i > z && i > y) {
            l = i;
        }
        return l;


    }

    //            4) Write a method to count all consonants (the opposite of vowels) in a String
    public static void countConsonants(String args){
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.print("");
            }else if(ch != ' '){
                count++;
            }
        }
        System.out.println("Number of consonants in the given sentence is " + count);
    }



    //            5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)

    public static void art(String s) {
        if (s == "print") {
            System.out.println(" . *  /\\ .   *    .   ");
            System.out.println("    ./ `\\ . *   .   * ");
            System.out.println("  * /````\\       .    ");
            System.out.println("   /``````\\\\>-|o     ");
            System.out.println(". /```.````\\   .      ");
            System.out.println(" /``````````\\    .  . ");
        }

    }
//            6) Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int a){
        boolean prime = true;
        for(int i = 2; i <= a /2; i++){
            if (a % i == 0){
                prime = false;
            }
        }
        return prime;
    }
//            7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument
    public static void minMax(int[] nums) {

        int min = 0;
        int max = 0;

        for(int i=0; i < nums.length-1; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        int minMaxArray[] = new int[2];
        minMaxArray[0] = min;
        minMaxArray[1] = max;

        for(int i=0; i < minMaxArray.length; i++)
            System.out.print(" " + minMaxArray[i]);
    }


    //            8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//            In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//            divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//            length of the returned list

    public static void arrayList1(int max, int div1, int div2){
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i <= max; i++){
            if(i % div1 == 0 && i % div2 == 0){
                list.add(i);
            }

        }
        System.out.println(list);
    }


    //            9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//            instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//            variable is used to temporarily store individual values in the array
    public static void arrayReverser(int[] nums){


        int temp;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        for(int i = 0; i < nums.length / 2; i++){
            // swap elements at indexes in array
            // you have two indices readily available for you to use "i" (which increments) and "nums.length"
            // you've also got this "temp" variable you can use to hold a value temporarily
            temp = nums[i];
            nums[i] = nums[nums.length -1 - i];
            nums[nums.length - 1 - i] = temp;

        }
        System.out.print("Contents of array after for loop - ");
        // print each element of the array to verify reverse order
        for(int i : nums){
            System.out.print(i + " ");
        }
    }





}

