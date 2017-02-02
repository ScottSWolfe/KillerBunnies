package com.github.scottswolfe.killerbunnies.item.card.play_immediately;

import com.github.scottswolfe.killerbunnies.item.card.PlayImmediatelyCard;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class TerribleMisfortune086 extends PlayImmediatelyCard {

    static final String NAME = "Terrible Misforune";
    static final String DESCRIPTION = "One of your bunnies is turned"
    		+ "into road pizza by a reckless yogurt delivery truck!";
            
    public TerribleMisfortune086() {
        super(NAME, 86, DESCRIPTION, DeckColor.BLUE);
    }
    
    @Override
    public void cardAction() {
        // TODO Auto-generated method stub
        
    }

    
}
