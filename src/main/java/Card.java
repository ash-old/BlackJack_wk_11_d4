import java.util.ArrayList;

public class Card {

    private SuitType suit;
    private RankType rank;
    private ArrayList<Card> cards;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
        this.cards = new ArrayList<Card>();
    }

    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    public int getValue(){
        return this.rank.getValue();
    }

    public ArrayList<Card> getCards(){
        return cards;
    }
}
