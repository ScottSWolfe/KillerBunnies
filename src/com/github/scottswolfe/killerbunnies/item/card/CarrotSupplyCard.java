package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class CarrotSupplyCard extends NumberedCard {

    int carrotNumber;
    
    
    public CarrotSupplyCard(String name, int cardNumber, String description,
            int carrotNumber) {
        super(name, cardNumber, description);
        this.carrotNumber = carrotNumber;
    }

}
