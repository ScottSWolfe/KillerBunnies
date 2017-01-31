package com.github.scottswolfe.killerbunnies.item.card.bunny;

import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyColor;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class SinisterBunny004 extends BunnyCard {
	
	static final String DESCRIPTION = "Players that have three bunnies down of the same kind or the same color may play two cards per turn.";
	 
    
    public SinisterBunny004() {
        super(004, DESCRIPTION, DeckColor.BLUE, BunnyType.SINISTER, BunnyColor.BLUE);
    }
    
}

