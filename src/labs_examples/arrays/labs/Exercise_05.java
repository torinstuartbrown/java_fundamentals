package labs_examples.arrays.labs;

/**
 * Traversing Arrays Backwards
 * <p>
 * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 * element in the array in reverse order.
 */

//Could not get to work for multi dim


public class Exercise_05 {
    public static void main(String[] args) {
        int arraySix[][] = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
        };
//        System.out.println(arraySix[1]);

//        for(int i = 0; i < arraySix.length; i++){
////            for(int j = 0; j < arraySix[i].length; j++){
//                arraySix[i][j] = i+j;
//
        for (int i = arraySix.length - 1; i >= 0; i--) {
            for (int j = arraySix[i].length - 1; j >= 0; j = j -2){
                System.out.println(arraySix[i][j]);
            }

        }

    }


}







