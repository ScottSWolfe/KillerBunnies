package com.github.scottswolfe.killerbunnies.item.card.play_immediately;

import com.github.scottswolfe.killerbunnies.item.card.PlayImmediatelyCard;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class TerribleMisfortune084 extends PlayImmediatelyCard {

    static final String NAME = "Terrible Misforune";
    static final String DESCRIPTION = "One of your bunnies dies at"
    		+ "the hands of an overzealous human with a power "
    		+ "hedge clipper!";
            
    public TerribleMisfortune084() {
        super(NAME, 84, DESCRIPTION, DeckColor.BLUE);
    }
    
    @Override
    public void cardAction() {
        // TODO Auto-generated method stub
        
    }

    
}
