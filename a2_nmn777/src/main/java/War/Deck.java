package War;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck(ArrayList<Card> cards) {
        this.deck = cards;
    }

    /**
     * stack the deck
     * @return
     */
    public Deck stackDeck(){
        Deck freshDeck = new Deck();
        return Deck;
    }

    public Deck shuffle(Deck deck){


    }


    public Card dealCard(){
        if (deck.isEmpty()){
            return null;
        }
    }
}
