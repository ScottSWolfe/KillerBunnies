package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public abstract class PlayImmediatelyCard extends PlacedCard {

    public PlayImmediatelyCard(String name, int cardNumber,
            String description, DeckColor deckColor) {
        super(name, cardNumber, description, deckColor);
    }

    public abstract void cardAction();
}
