package com.github.scottswolfe.killerbunnies.item.card;

public class NumberedCard extends Card {

    private int idnumber; 
    
    public NumberedCard(int cardNumber){
        idnumber = cardNumber; 
        
    }
    
    
    public int getIDNumber(){
        return idnumber;
    }
    
    public void setIDNumber(int number){
        idnumber = number;
    }
}