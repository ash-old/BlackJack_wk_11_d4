import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }



}
