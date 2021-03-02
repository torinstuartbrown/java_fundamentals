package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getHandValue() {
        int totalScore = 0;
        boolean hasAce = false;
        for (Card c : cards) {
            totalScore += c.getPointValue();
            if(c.getFaceValue().equalsIgnoreCase("A")){
                hasAce = true;
            }
        }
        if(totalScore > 21 && hasAce){
            totalScore -= 10;
        }
        return totalScore;
    }

    public ArrayList<Card> removeCards() {
        cards.removeAll(cards);
        return cards;
    }

    //@Override
    public String toStringPlayer() {
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c.toString()).append(" ");
        }
        return sb.toString();
    }

    public String toStringCompter() {
        StringBuilder sb = new StringBuilder();
        sb.append("?? ");
        for (int i = 1; i < cards.size(); i++) {
            sb.append(cards.get(i).toString()).append(" ");
        }
        return sb.toString();
    }
}





