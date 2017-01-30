package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class PlayableCard extends NumberedCard  {



	/**
     * Color of the deck
     */
    private DeckColor deckColor;
    
    
    
    public PlayableCard(int cardNumber, DeckColor deckColor) {
        super(cardNumber);
        
    }
}
