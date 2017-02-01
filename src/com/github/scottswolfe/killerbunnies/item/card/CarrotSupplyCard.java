package com.github.scottswolfe.killerbunnies.item.card;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class CarrotSupplyCard extends NumberedCard {

    String carrotName;
    int carrotNumber;
    
    
    public CarrotSupplyCard(String name, int cardNumber, String description,
            String carrotName, int carrotNumber) {
        super(name, cardNumber, description);
        this.carrotName = carrotName;
        this.carrotNumber = carrotNumber;
    }

}
