package com.github.scottswolfe.killerbunnies.model.card.bunny;

import com.github.scottswolfe.killerbunnies.model.card.BunnyCard;

public class CongenialBunny001 extends BunnyCard {
    
    public CongenialBunny001() {
        super(001, "blue", "congenial", "blue");
    }
    
    
    public String toString() {
        String string = new String(this.getClass() + ": " + "cardNumber: " + this.getIDNumber() + 
                "deckColor: ");
        return string;
    }

}
