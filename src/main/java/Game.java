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
                return player;
            }
        }
        return dealer;
    }
}
