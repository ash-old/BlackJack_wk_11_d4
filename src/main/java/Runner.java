import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        Dealer dealer = new Dealer("Jimmy");
        Game game = new Game(deck, dealer);

        System.out.println("Welcome to BlackJack!");
        System.out.println("What is your name?");

        String playerName = scanner.next();

        Player player = new Player(playerName);

        game.addPlayers(player);

        String output = String.format("Hi %s", player.getName());
        System.out.println(output);

        System.out.println("RULES OF THE GAME: ...");

        System.out.println("Are you ready to play? y/n");
        String answer = scanner.next().toLowerCase();

        if (answer.equals("n")) {
            System.out.println("Have a nice day!");
        } else {
            System.out.println("Lets play!");
            game.start();

        }



        boolean dealerStick = false;
        boolean playerStick = false;

        while(true){
            System.out.println("Do you want to Stick or Twist?");
            String playerResponse = scanner.next().toLowerCase();
            // player/dealer logic
            if(playerResponse.equals("twist")) {
                game.twist();
                int playerTotal = player.handTotal();
                String twistOutput = String.format("Your new card total is %s ", playerTotal);
                System.out.println(twistOutput);
            }
            // player bust
            if(player.handTotal() > 21){
                System.out.println("BUST!  Your hand value was " + player.handTotal() + " Dealer Wins with hand value of " + dealer.handTotal());
                break;
            }
            // player stick
            if(playerResponse.equals("stick")){
                playerStick = true;

            }
            // dealer takes card
            if(playerStick == true && dealer.handTotal() <= 16) {
                Card card1 = deck.dealOne();
                dealer.takeCard(card1);
                System.out.println("Dealer takes card");
            }

            //dealer sticks
            if(playerStick == true && dealer.handTotal() > 16) {
                System.out.println(dealer.handTotal());
                System.out.println("Dealer sticks");
                dealerStick = true;
                game.checkWinner();
            }

            // draw
            if(game.checkDraw()){
                System.out.println("Game is a draw!");
            }else{
///                   Object winner = game.checkWinner();
//                    String winnerName = winner
            }
           System.out.println("The Winner is " + game.checkWinner());
          System.out.println("Player card value " + player.handTotal() + " The Dealer card value is " + dealer.handTotal());


            // dealer bust
            if(dealer.handTotal() > 21){
                System.out.println("Player WINS! Dealer Bust with a hand value of " + dealer.handTotal());
                break;
            }
        }












    }

}
