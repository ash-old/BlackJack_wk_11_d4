import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Bobby");
    }

    @Test
    public void playerHasName(){
        assertEquals("Bobby", player.getName());
    }

    @Test
    public void playerHandSize(){
        assertEquals(0, player.handSize());
    }

    @Test
    public void playerDealtCard(){
        player.addDealtCard(card);
        assertEquals(1, player.handSize());
    }


}
