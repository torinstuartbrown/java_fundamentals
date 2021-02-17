package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private ArrayList<Integer> usedCards = new ArrayList<>();
    private Card cards[] = new Card[52];

    public Deck() {
        populateDeck();
    }

    public void populateDeck() {
        // do all the stuff to populate an array of 52 unique cards
        // the cards[] will be an instance variable in the Deck class

        int count = 0;
        for(int i = 1; i <= 13; i++){
            for(int j = 0; j < 4; j++){
                Card card = new Card(i, suit[j]);
                cards[count] = card;
                count++;
            }
        }
    }

    public Card deal() {
        Random rand = new Random();
        int int_random;

        do{
            int_random = rand.nextInt(52);
        }while(usedCards.contains(int_random));

        usedCards.add(int_random);

        return cards[int_random];
    }



}
    // etc





