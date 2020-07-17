import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Card card1;
    Card card2;

    @Before
    public void before(){
        dealer = new Dealer("Jimmy");
        card1 = new Card(SuitType.CLUBS, RankType.EIGHT);
        card2 = new Card(SuitType.HEARTS, RankType.SEVEN);
    }

    @Test
    public void dealerHasName(){
        assertEquals("Jimmy", dealer.getName());
    }

    @Test
    public void dealerHandStartsEmpty(){
        assertEquals(0, dealer.cardCount());
    }

    @Test
    public void dealerTakeCard(){
        dealer.takeCard(card1);
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void dealerTotalHand(){
        dealer.takeCard(card1);
        assertEquals(8, dealer.handTotal());
    }


}
