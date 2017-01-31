package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class CarrotSupplyCard extends NumberedCard {

    String name;
    int carrotNumber;
    
    
    public CarrotSupplyCard(int cardNumber, String description,
            String name, int carrotNumber) {
        super(cardNumber, description);
        this.name = name;
        this.carrotNumber = carrotNumber;
    }

}
