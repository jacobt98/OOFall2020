package War;

import Deck;

public class Player {

    private Deck deck;

    public Player(Deck deck){

    }

    /**
     * Check if the player has any remaining cards in their deck
     * @return
     */
    public boolean hasCards(){
        return this.deck.isEmpty();
    }
}
