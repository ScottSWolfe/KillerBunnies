package com.github.scottswolfe.killerbunnies.item.card.play_immediately;

import com.github.scottswolfe.killerbunnies.item.card.PlayImmediatelyCard;
import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class TerribleMisfortune083 extends PlayImmediatelyCard {

    public static final String NAME = "Terrible Misforune";
    public static final String DESCRIPTION = "One of your bunnies is trapped in"
            + " an old Fiat just before it is sent to a local junkyard "
            + "compactor!";
            
    public TerribleMisfortune083() {
        super(NAME, 83, DESCRIPTION, DeckColor.BLUE);
    }
    
    @Override
    public void cardAction() {
        // TODO Auto-generated method stub
        
    }

    
}
