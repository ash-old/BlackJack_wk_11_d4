import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;
    Card card2;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(SuitType.HEARTS, RankType.EIGHT);
        card2 = new Card(SuitType.SPADES, RankType.QUEEN);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.deckSize());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCard(card1);
        deck.addCard(card2);
        assertEquals(2, deck.deckSize());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void canRemoveCard(){
        deck.addCard(card1);
        deck.addCard(card2);
        deck.removeCard();
        assertEquals(1, deck.deckSize());
    }

}
