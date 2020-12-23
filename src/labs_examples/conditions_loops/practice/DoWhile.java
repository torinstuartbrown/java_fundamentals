package labs_examples.conditions_loops.practice;

import javax.sound.midi.Soundbank;

public class DoWhile {

    public static void main(String[] args) {
        int outterCount = 0;
        int innerCount = 0;


        while(outterCount <10){
            while (innerCount < 10) {
                System.out.println("outter count = " + outterCount + "and inner count = " + innerCount);
                innerCount++;
            }
            innerCount  =0;
            outterCount++;
                            }

        System.out.println("all done with while loop");
    }
}
