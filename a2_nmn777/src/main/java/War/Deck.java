package War;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck(){
    }

    public Deck(ArrayList<Card> cards) {
        this.deck = cards;
    }

    /**
     * stack the deck by iterating through Suits and ranks
     * @return a freshly stacked deck that has not been shuffled
     */
    public Deck stackDeck(){
        Deck freshDeck = new Deck();

        for (Card.Suit s: Card.Suit.values()){
            for (Card.Rank r : Card.Rank.values()){
                Card nextCard = new Card(s, r);
                freshDeck.append(nextCard);
            }

        }
        return freshDeck;
    }

    /**
     *
     * @param deck
     * @return shuffled deck
     */
//    public Deck shuffle(Deck deck){
//    }

    /**
     * Add a card to the end of the deck
     * @param c card to be appended
     * @return Same instance of deck with new card added
     */
    protected Deck append(Card c) {
        if (c != null) {
            this.append(c);
        }
        return this;
    }

//    public Card dealCard(){
//        if (deck.isEmpty()){
//            return null;
//        }
//        deck.get()
//        return
//    }


}
