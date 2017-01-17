package com.github.scottswolfe.killerbunnies.model;

public class NumberedCard {

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
