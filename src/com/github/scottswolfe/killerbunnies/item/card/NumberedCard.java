package com.github.scottswolfe.killerbunnies.item.card;

public abstract class NumberedCard extends Card {

    private int cardNumber;
    private String description;
    
    
    public NumberedCard(String name, int cardNumber, String description) {
        super(name);
        this.cardNumber = cardNumber; 
        this.description = description;
    }
    
    
    public int getCardNumber(){
        return cardNumber;
    }
    
    public void setCardNumber(int number){
        cardNumber = number;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescriptionr(String description){
        this.description = description;
    }
}
