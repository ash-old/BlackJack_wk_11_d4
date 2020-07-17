import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();

    }


    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }


}
