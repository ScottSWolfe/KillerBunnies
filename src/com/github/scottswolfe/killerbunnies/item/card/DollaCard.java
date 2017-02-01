package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class DollaCard extends PlacedCard{

    int value;
    
    
	public DollaCard(String name, int cardNumber, String description,
	        DeckColor deckColor, int value) {
	    
		super(name, cardNumber, description, deckColor);
		this.value = value;
	}

}
