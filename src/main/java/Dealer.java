import java.util.ArrayList;

public class Dealer {

    private String name;
    private ArrayList<Card> hand;

    public Dealer(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public int handTotal() {
        int total = 0;
                for(Card card : this.hand ){
                    total += card.getValue();
                }
                return total;
    }
}
