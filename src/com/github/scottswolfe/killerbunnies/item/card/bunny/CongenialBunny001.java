package com.github.scottswolfe.killerbunnies.item.card.bunny;

import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;

public class CongenialBunny001 extends BunnyCard {
    
    public CongenialBunny001() {
        super(001, "blue", BunnyType.CONGENIAL, "blue");
    }
    
    
    public String toString() {
        String string = new String(this.getClass() + ": " + "cardNumber: " + this.getIDNumber() + 
                "deckColor: ");
        return string;
    }


}
