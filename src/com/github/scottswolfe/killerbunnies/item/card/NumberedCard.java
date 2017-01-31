package com.github.scottswolfe.killerbunnies.item.card;

public class NumberedCard extends Card {

    private int cardNumber;
    private String description;
    
    
    public NumberedCard(int cardNumber, String description){
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
