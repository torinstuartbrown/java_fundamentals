package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {
        int bust = 22;
        int win = 21;

        Deck deck = new Deck();


        System.out.println("Hello, what is your name?");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.next();

        Player player = new Player(name, 100);
        Player computer = new Player("Computer", 100);

        System.out.println("Hello " + name);
        System.out.println("Would you like to play a hand of BlackJack? (Y/N)");

        Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.next();
        while (playAgain.equalsIgnoreCase("Y")) {
            System.out.println("You currently have " + player.getPotValue() + " chips.");
            System.out.println("How many do you want to bet?");
            Scanner bet = new Scanner(System.in);
            String betAmount = scanner.next();
            System.out.println();


            System.out.println("Dealing... \n");

            player.getHand().getCards().add(deck.deal());
            player.getHand().getCards().add(deck.deal());
            System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue());

            computer.getHand().getCards().add(deck.deal());
            computer.getHand().getCards().add(deck.deal());
            System.out.println("Computer's hand: " + computer.getHand().toStringCompter());
            System.out.println();


            for (int i = 0; i < 10; i++) {
                boolean playerHit = true;
                boolean computerHit = true;
                //I want the system NOT to ask if I want another card if I have already said no should i embed another if statement?
                if (playerHit && player.hit()) {
                    playerHit = true;
                    player.getHand().getCards().add(deck.deal());
                    System.out.println("Player Hits...");
                    System.out.println();
                    System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue());
                } else {
                    System.out.println("Player Stays...");
                    System.out.println();
                    System.out.println("Your Hand: " + player.getHand().toStringPlayer());
                    playerHit = false;
                }
                if (player.getHand().getHandValue() >= bust)
                    break;
                if (computerHit && computer.hit()) {
                    computerHit = true;
                    computer.getHand().getCards().add(deck.deal());
                    System.out.println("Computer hits...");
                    System.out.println();
                    System.out.println("Computer's hand: " + computer.getHand().toStringCompter());
                } else {
                    computerHit = false;
                    System.out.println();
                    System.out.println("Computer Stays...");
                    System.out.println();
                    System.out.println("Computer's hand: " + computer.getHand().toStringCompter());
                }
                if (computer.getHand().getHandValue() == win)
                    break;
                if (computer.getHand().getHandValue() >= bust)
                    break;
                if (playerHit == false & computerHit == false)
                    break;

            }
            System.out.println();
            System.out.println("Computer relieves hand...");
            System.out.println();
            System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue());
            System.out.println("Computer's Hand: " + computer.getHand().toStringPlayer() + " Score: " + computer.getHand().getHandValue());
            System.out.println();

            if (computer.getHand().getHandValue() == win) {
                System.out.println("Computer scored 21!!!!! \n You Lose!");
            }
            if (player.getHand().getHandValue() >= bust) {
                System.out.println("Player busts! \nYou lose!");
            }
            if (computer.getHand().getHandValue() >= bust) {
                System.out.println("Computer busts! \nYou WIN!");
            }
            if (player.getHand().getHandValue() < bust && computer.getHand().getHandValue() < player.getHand().getHandValue()) {
                System.out.println("Player WINS!");
            }
            if (computer.getHand().getHandValue() < bust && player.getHand().getHandValue() <= computer.getHand().getHandValue()) {
                System.out.println("Computer WINS!");

                System.out.println();



        }
            System.out.println("Would you like to play again? (Y/N)");

            playAgain = scanner.next();

            player.getHand().removeCards();
            computer.getHand().removeCards();
        }

            System.out.println("No problem, have a good day!");
    }

}
