package com.github.scottswolfe.killerbunnies.model;

public class PlayableCard extends NumberedCard  {

    public PlayableCard(int cardNumber, String deckColor) {
		super(cardNumber);
		
	}

	/**
     * Color of the deck 
     */
    private String deckColor;
}
