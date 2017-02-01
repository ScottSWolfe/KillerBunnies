package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class WeaponCard extends RunCard {

	public WeaponCard(String name, int cardNumber, String description, DeckColor deckColor) {
		super(name, cardNumber, description, deckColor);
	}

	@Override
	public boolean isAggressive() {
	    return true;
	}
}
