package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.BunnyColor;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class BunnyCard extends RunCard{

    protected BunnyType bunnyType;
    protected BunnyColor bunnyColor;
    
    
	public BunnyCard(String name, int cardNumber, String description,
	        DeckColor deckColor, BunnyType bunnyType, BunnyColor bunnyColor) {
	    
		super(name, cardNumber, description, deckColor);
		this.bunnyType = bunnyType;
		this.bunnyColor = bunnyColor;
	}

	/**
	 * returns the number of bunnies this card is worth
	 */
	public int bunnyCount() {
	    return 1;
	}
}
