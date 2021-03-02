package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.util.Arrays;

public class Card {

    private char suit;
    private int cardValue;

    public Card(int cardValue, char suit) {
        this.suit = suit;
        this.cardValue = cardValue;

    }

    public char getSuit() {
        return suit;
    }

    public String getFaceValue() {
        if (cardValue == 1) {
            return "A";
        } else if (cardValue > 1 && cardValue < 11) {
            return String.valueOf(cardValue);
        } else if (cardValue == 11) {
            return "J";
        } else if (cardValue == 12) {
            return "Q";
        } else {
            return "K";
        }
    }

    public int getPointValue() {
        if (cardValue == 1) {
            return 11;
        } else if (cardValue < 11) {
            return cardValue;
        } else {
            return 10;
        }

    }

    @Override
    public String toString() {
        return getFaceValue() + getSuit();
    }

}
