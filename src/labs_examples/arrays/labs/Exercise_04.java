package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregArray = {
                {2, 1},
                {5, 6, 7}
        };

        for(int i=0; i<irregArray.length; i++){
            for(int j=0; j<irregArray[i].length; j++){
                System.out.print(irregArray[i][j]+ " ");
            }
        System.out.println();
        }
    }

}
