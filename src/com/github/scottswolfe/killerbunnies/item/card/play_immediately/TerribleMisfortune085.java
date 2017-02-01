package com.github.scottswolfe.killerbunnies.item.card.play_immediately;

import com.github.scottswolfe.killerbunnies.item.card.PlayImmediatelyCard;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class TerribleMisfortune085 extends PlayImmediatelyCard {

    public static final String NAME = "Terrible Misforune";
    public static final String DESCRIPTION = "One of your bunnies is exposed"
    		+ "to illegally burried Plutonium, loses its fur, convulses"
    		+ "for a bit and dies!";
            
    public TerribleMisfortune085() {
        super(NAME, 85, DESCRIPTION, DeckColor.BLUE);
    }
    
    @Override
    public void cardAction() {
        // TODO Auto-generated method stub
        
    }

    
}
