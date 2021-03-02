package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;
    private boolean declineNextCard;
    private int currentBet;

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
        hand = new Hand();
        declineNextCard = false;
    }

    public void bet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many do you want to bet?");
        int betAmount = scanner.nextInt();
        while(betAmount > potValue){
            System.out.println("Not enough chips. Enter bet less than: " + potValue);
            betAmount = scanner.nextInt();
        }
        currentBet = betAmount;
    }

    public boolean hit() {
        if(declineNextCard){
            return false;
        }
        if (name.equalsIgnoreCase("Computer")) {
            if (getHand().getHandValue() < 17) {
                return true;
            } else {
                declineNextCard = true;
                return false;
            }
        } else {
            System.out.println("Would you like another card? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else {
                declineNextCard = true;
                return false;
            }
        }
    }

    public boolean isDeclineNextCard() {
        return declineNextCard;
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

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public void updatePotValue(boolean won){
        if(won){
            setPotValue(getPotValue() + getCurrentBet());
        }else{
            setPotValue(getPotValue() - getCurrentBet());
        }
    }


    public int getCurrentBet() {
        return currentBet;
    }

    public void setDeclineNextCard(boolean declineNextCard) {
        this.declineNextCard = declineNextCard;
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
