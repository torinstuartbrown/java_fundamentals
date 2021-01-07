package labs_examples.arrays.Practice;

public class ArrayExample {

    public static void main(String[] args) {


        int[] intArray = new int[5];

        intArray[0] = 97;
        intArray[1] = 17;
        intArray[2] = 56;
        intArray[3] = 14;
        intArray[4] = 39;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("The array value at the index of " + i + " is " + intArray[i]);
        }

//        int[] intArray2 = {23, 34, 54, 26, 88};
//        System.out.println( intArray2[2]);
//
//        public static void printArray(int[] vals){
//        for(int i = 0; i< vals.length; i++){
//            System.out.println(vals[i]);
//        }
//
//
//    }
//
    }
}