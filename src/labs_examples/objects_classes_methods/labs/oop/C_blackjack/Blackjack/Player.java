package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;


    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        hand = new Hand();
    }

    public boolean hit(){
        if(name.equalsIgnoreCase("Computer")){
            if (getHand().getHandValue() < 17){
                return true;
            }
            else{
                return  false;
            }
        }
        else {
            System.out.println("Would you like another card? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equalsIgnoreCase("Y")){
                return true;
            }
            else{
                return false;
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        if (name.equalsIgnoreCase("Computer")) {
            return hand;
        } else {
            return hand;
        }
    }





    public int getPotValue() {
        return potValue;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
