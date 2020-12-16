package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {


        // write your code below
        boolean a = true;
        boolean b = false;
        if (a & b) {
            System.out.println("a and b is true");}
        else {System.out.println("a and b is false");
        }
        if (a && b){
            System.out.println("a and b is true");}
        else{System.out.println("a and b is false");
        }
        if (a | b){
            System.out.println("a and b is true");}
        else{System.out.println("a and b is false");
        }
        if (a || b){
            System.out.println("a and b is true");}
        else{System.out.println("a and b is false");
        }
        if (a ^ b){
            System.out.println("a and b is true");}
        else{System.out.println("a and b is false");
        }
    }

}

