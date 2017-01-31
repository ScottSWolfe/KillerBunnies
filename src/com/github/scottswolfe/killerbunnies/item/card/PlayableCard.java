package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class PlayableCard extends NumberedCard  {


    private DeckColor deckColor;
    
    public PlayableCard(int cardNumber, String description, 
            DeckColor deckColor) {
        super(cardNumber, description);
        this.deckColor = deckColor;
    }

    /**
     * @return the deckColor
     */
    public DeckColor getDeckColor() {
        return deckColor;
    }

    /**
     * @param deckColor the deckColor to set
     */
    public void setDeckColor(DeckColor deckColor) {
        this.deckColor = deckColor;
    }
    
    
}
