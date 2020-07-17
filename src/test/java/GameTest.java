import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;
    Dealer dealer;
    Card highcard;
    Card lowcard;

    @Before
    public void before(){
        deck = new Deck();
        player1 = new Player("Keith");
        player2 = new Player("Ash");
        dealer = new Dealer("Jimmy");
        highcard = new Card(SuitType.CLUBS, RankType.KING);
        lowcard = new Card(SuitType.SPADES, RankType.TWO);
        game = new Game(deck, dealer);
        game.addPlayers(player1);
        game.addPlayers(player2);
    }

    @Test
    public void gameHasPlayers(){
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void gameCanCheckDraw(){
        player1.takeCard(highcard);
        dealer.takeCard(highcard);
        assertEquals(true, game.checkDraw());
    }

    @Test
    public void gameCanCheckWinner(){
        player1.takeCard(highcard);
        dealer.takeCard(lowcard);
        assertEquals(player1, game.checkWinner());
    }




}
