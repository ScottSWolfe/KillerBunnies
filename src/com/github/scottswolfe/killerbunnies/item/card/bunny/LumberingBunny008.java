package com.github.scottswolfe.killerbunnies.item.card.bunny;

import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyColor;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class LumberingBunny008 extends BunnyCard {
	
	static final String DESCRIPTION = "Players that have three bunnies down of "
	        + "the same kind or the same color may play two cards per turn.";
	 
    
    public LumberingBunny008() {
        super(8, DESCRIPTION, DeckColor.BLUE, 
                BunnyType.LUMBERING, BunnyColor.GREEN);
    }
    
}

