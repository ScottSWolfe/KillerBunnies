package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;

public class BunnyCard extends RunCard{

    protected BunnyType bunnyType;
    protected String bunnyColor;
    
	public BunnyCard(int cardNumber, String deckColor,
	                 BunnyType bunnyType, String bunnyColor) {
	    
		super(cardNumber, deckColor);
		this.bunnyType = BunnyType.CONGENIAL;
		this.bunnyColor = bunnyColor;
	}

	/**
	 * returns the number of bunnies this card is worth
	 */
	public int bunnyCount() {
	    return 1;
	}
}
