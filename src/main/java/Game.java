import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Dealer dealer;


    public Game(Deck deck, Dealer dealer) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
        this.dealer = dealer;
    }


    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }


    public boolean checkDraw() {
       for(Player player : this.players){
           if(player.handTotal() == this.dealer.handTotal()){
               return true;
           }
       }
       return false;
    }


    public Object checkWinner() {
        for(Player player : this.players){
            if(player.handTotal() > this.dealer.handTotal()){
                 String playerName = player.getName();
                 return playerName;
            }
        }
        String dealerName = dealer.getName();
        return dealerName;
    }

    public void start() {
        deck.populateDeck();
        for(Player player : this.players){
            Card card1 = deck.dealOne();
            player.takeCard(card1);
            Card card2 = deck.dealOne();
            player.takeCard(card2);
            Card card3 = deck.dealOne();
            dealer.takeCard(card3);
            Card card4 = deck.dealOne();
            dealer.takeCard(card4);
            int playerTotal = player.handTotal();
            String outputTotal = String.format("You are dealt 2 cards. Your total is %s ", playerTotal);
            System.out.println(outputTotal);
        }
    }

    public void twist() {
        for(Player player : this.players) {
            Card card1 = deck.dealOne();
            player.takeCard(card1);

        }
    }

}
