import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;

    @Before
    public void before(){
        game = new Game(deck);
        deck = new Deck();
        player1 = new Player("Keith");
        player2 = new Player("Ash");
    }

    @Test
    public void gameHasPlayers(){
        game.addPlayers(player1);
        game.addPlayers(player2);
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void


}
