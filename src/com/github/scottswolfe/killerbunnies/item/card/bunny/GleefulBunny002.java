package com.github.scottswolfe.killerbunnies.item.card.bunny;

import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyColor;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class GleefulBunny002 extends BunnyCard {
    
	static final String DESCRIPTION = "Players that have three bunnies down of "
	        + "the same kind or the same color may play two cards per turn.";
	 
    static final String NAME = "Gleeful Bunny";
	
    public GleefulBunny002() {
        super(NAME, 2, DESCRIPTION, DeckColor.BLUE,
                BunnyType.GLEEFUL, BunnyColor.BLUE);
    }
    
}

