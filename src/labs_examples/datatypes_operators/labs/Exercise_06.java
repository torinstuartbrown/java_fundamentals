package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        int h = 5;
        float r = (float) 3.14;
        float v = (float) Math.PI * r * r;
        float u = (float) ((float) Math.PI * Math.pow(r, 2));
        float a = (float) ((float) 2 * Math.PI * r * h + 2 * Math.PI * r *r);

        System.out.println("Volume = " + v);
        System.out.println("Surface Area = " + a);

    // better to use double than float
    }
}