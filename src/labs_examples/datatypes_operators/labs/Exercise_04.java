package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {


        int a = 10;
        int b = 11;
        int c = 12;
        int d = 13;
        int e = 13;


        if (a < b){
            System.out.println("a is less than b");
        }
        if (c > b){
            System.out.println("c is greater than b");
        }
        if (a <= b){
            System.out.println("a is less or equal to b");
        }
        if (c >= b){
            System.out.println("a is greater or equal to b");
        }
        if (e == d){
            System.out.println("d is equal to e");
        }

    }

}

