package com.github.scottswolfe.killerbunnies.item.card;

public class PlayableCard extends NumberedCard  {

    public PlayableCard(int cardNumber, String deckColor) {
		super(cardNumber);
		
	}

	/**
     * Color of the deck
     */
    private String deckColor;
}
