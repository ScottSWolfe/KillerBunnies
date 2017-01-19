package com.github.scottswolfe.killerbunnies.model.card;

public class BunnyCard extends RunCard{

    protected String bunnyType;
    protected String bunnyColor;
    
	public BunnyCard(int cardNumber, String deckColor,
	                 String bunnyType, String bunnyColor) {
	    
		super(cardNumber, deckColor);
		this.bunnyType = bunnyType;
		this.bunnyColor = bunnyColor;
	}

}
