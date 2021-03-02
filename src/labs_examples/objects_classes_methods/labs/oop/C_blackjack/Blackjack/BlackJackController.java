package labs_examples.objects_classes_methods.labs.oop.C_blackjack.Blackjack;

import java.util.Scanner;


public class BlackJackController {

    /**
     * This method creates a new Blackjack game and calls the method that contains the game.
     */
    public static void main(String[] args) {
        BlackJackController controller = new BlackJackController();
        controller.playBlackJack();

    }

    /**
     * This method contains various other methods that contain the logic to play a game of Blackjack.
     */
    public void playBlackJack() {
        Deck deck = new Deck();

        Player player = initalizePlayer(false);
        Player computer = initalizePlayer(true);

        Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.next();
        while (playAgain.equalsIgnoreCase("Y")) {

            dealInitialCards(player, computer, deck);

            dealAdditionalCards(player, computer, deck);

            printGameStatus(player, computer);

            determineWinner(player, computer);

            playAgain = playAgain(player, computer, deck);

        }
        System.out.println("Game ended, have a good day!");

    }

    /**
     * This method creates a computer and user players and asks the human player if they want to play.
     *
     * @param computer - The object that represents the dealer.
     */

    public Player initalizePlayer(boolean computer) {
        Player player;
        if (!computer) {
            System.out.println("Hello, what is your name?");
            Scanner nameScanner = new Scanner(System.in);
            String name = nameScanner.next();
            System.out.println("Hello " + name);
            System.out.println("Would you like to play a hand of BlackJack? (Y/N)");

            player = new Player(name, 100);
        } else {
            player = new Player("Computer", 100);
        }
        return player;
    }

    /**
     * This method deals the initial two card hand to both the player and the dealer.
     *
     * @param deck - This represents a shuffled deck of 52 playing cards.
     */
    public void dealInitialCards(Player player, Player computer, Deck deck) {
        System.out.println("You currently have " + player.getPotValue() + " chips.");
        player.bet();

        System.out.println("Dealing... \n");

        player.getHand().getCards().add(deck.deal());
        player.getHand().getCards().add(deck.deal());
        System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue());

        computer.getHand().getCards().add(deck.deal());
        computer.getHand().getCards().add(deck.deal());
        System.out.println("Computer's hand: " + computer.getHand().toStringCompter() + "\n");
    }

    /**
     * This method allows the players to request more cards, if either player wins or busts the process stops.
     *
     * @param deck - This represents a shuffled deck of 52 playing cards.
     */
    public void dealAdditionalCards(Player player, Player computer, Deck deck) {
        int bust = 22;
        int win = 21;

        while (true) {


            //I want the system NOT to ask if I want another card if I have already said no should i embed another if statement?
            if (player.hit()) {

                player.getHand().getCards().add(deck.deal());
                System.out.println("Player Hits... \n");
                System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue());
            } else {
                System.out.println("Player Stays... \n");
                System.out.println("Your Hand: " + player.getHand().toStringPlayer());

            }
            if (player.getHand().getHandValue() >= bust)
                break;
            if (computer.hit()) {

                computer.getHand().getCards().add(deck.deal());
                System.out.println("Computer hits... \n");
                System.out.println("Computer's hand: " + computer.getHand().toStringCompter() + "\n");
            } else {
                System.out.println("Computer Stays... \n");
                System.out.println("Computer's hand: " + computer.getHand().toStringCompter() + "\n");
            }
            if (computer.getHand().getHandValue() == win)
                break;
            if (computer.getHand().getHandValue() >= bust)
                break;
            if (player.isDeclineNextCard() && computer.isDeclineNextCard())
                break;
        }

    }

    /**
     * This method prints the game status.
     *
     * @param player   - The object that represents the user.
     * @param computer - The object that represents the dealer.
     */
    public void printGameStatus(Player player, Player computer) {
        System.out.println();
        System.out.println("Computer reveals hand... \n");
        System.out.println("Your Hand: " + player.getHand().toStringPlayer() + " Score: " + player.getHand().getHandValue() + "\n");
        System.out.println("Computer's Hand: " + computer.getHand().toStringPlayer() + " Score: " + computer.getHand().getHandValue() + "\n");
    }

    /**
     * This method determines the game winner.
     *
     * @param player   - The object that represents the user.
     * @param computer - The object that represents the dealer.
     */
    public void determineWinner(Player player, Player computer) {
        int bust = 22;
        int win = 21;

        boolean playerWin = false;
        if (computer.getHand().getHandValue() == win) {
            System.out.println("Computer scored 21!!!!! \n You Lose!");
        } else if (player.getHand().getHandValue() >= bust) {
            System.out.println("Player busts! \nYou lose!");
        } else if (computer.getHand().getHandValue() >= bust) {
            System.out.println("Computer busts! \nYou WIN!");
            playerWin = true;
        } else if (player.getHand().getHandValue() < bust && computer.getHand().getHandValue() < player.getHand().getHandValue()) {
            System.out.println("You WINS!");
            playerWin = true;
        } else if (computer.getHand().getHandValue() < bust && player.getHand().getHandValue() <= computer.getHand().getHandValue()) {
            System.out.println("Computer WINS! \n");
        }
        player.updatePotValue(playerWin);
    }

    /**
     * This method determines if the player can and will play again.
     *
     * @param player   - The object that represents the user.
     * @param computer - The object that represents the dealer.
     * @param deck     - This represents a shuffled deck of 52 playing cards.
     * @return - "Y" if yes. "N" if no.
     */
    public String playAgain(Player player, Player computer, Deck deck) {
        if (player.getPotValue() == 0) {
            System.out.println("You are out of chips!");
            System.out.println("Would you like to play again? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            while (!response.equalsIgnoreCase("Y") || (!response.equalsIgnoreCase("N"))) {
                System.out.println("Invalid repose please enter Y or N.");
                response = scanner.next();
                if (response.equalsIgnoreCase("n")) {
                    return "N";
                }
                if (response.equalsIgnoreCase("Y")) {
                    player.getHand().removeCards();
                    computer.getHand().removeCards();
                    player.setDeclineNextCard(false);
                    computer.setDeclineNextCard(false);
                    deck = new Deck();
                    player.setPotValue(100);
                    computer.setPotValue(100);
                    return "Y";
                }
            }
            return "N";
        }
        System.out.println("Would you like to play again? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        while (!response.equalsIgnoreCase("Y") || (!response.equalsIgnoreCase("N"))) {
            System.out.println("Invalid repose please enter Y or N.");
            response = scanner.next();
            if (response.equalsIgnoreCase("n")) {
                return "N";
            }
            if (response.equalsIgnoreCase("Y")) {
                player.getHand().removeCards();
                computer.getHand().removeCards();
                player.setDeclineNextCard(false);
                computer.setDeclineNextCard(false);
                deck = new Deck();
                return "Y";
            }
        }
        return "N";
    }
}



