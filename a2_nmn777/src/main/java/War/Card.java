package War;

public class Card {

    public enum Rank
    {
        TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    public enum Suit
    {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return rank + "of " + suit;
    }

}
