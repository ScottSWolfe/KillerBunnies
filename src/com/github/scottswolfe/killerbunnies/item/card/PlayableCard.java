package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;
import com.github.scottswolfe.killerbunnies.item.interfaces.BunnyIcon;

public class PlayableCard extends NumberedCard implements BunnyIcon {


    private DeckColor deckColor;
    
    public PlayableCard(String name, int cardNumber, String description, 
            DeckColor deckColor) {
        super(name, cardNumber, description);
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

    @Override
    public boolean isAggressive() {
        return false;
    }
     
}
