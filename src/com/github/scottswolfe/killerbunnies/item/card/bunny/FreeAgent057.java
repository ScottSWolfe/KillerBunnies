package com.github.scottswolfe.killerbunnies.item.card.bunny;

import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyColor;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class FreeAgent057 extends BunnyCard {
	
	static final String DESCRIPTION = "A Killer Bunny Wild Card! May be"
			+ " used by a player as any bunny of any color (except Red).";
	 
    static final String NAME = "Free Agent!";
    		
    public FreeAgent057() {
        super(NAME, 57, DESCRIPTION, DeckColor.BLUE,
                BunnyType.FREE_AGENT, BunnyColor.FREE_AGENT);
    }
    
}

