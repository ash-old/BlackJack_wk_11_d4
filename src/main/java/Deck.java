
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int deckSize() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

//    public void populateDeck() {
//        for(int i =0; i < RankType.values().length; i++){
//            for(int j =0; j < SuitType.values().length; j++) {
//                Card card = new Card(SuitType.values()[j], RankType.values()[i]);
//                cards.add(card);
//            }
//        }
//    }

    public void populateDeck(){
        for(RankType rank : RankType.values()){
            for(SuitType suit : SuitType.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card removeCard() {
        this.cards.remove(0);
        return null;
    }

}
