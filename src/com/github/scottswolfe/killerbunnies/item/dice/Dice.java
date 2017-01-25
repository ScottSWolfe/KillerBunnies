package com.github.scottswolfe.killerbunnies.item.dice;

import java.util.Random;

import com.github.scottswolfe.killerbunnies.item.enums.DiceColor;

public class Dice {
	
	// Instance Variables
	
	protected DiceColor diceColor;
	protected int diceSideNumber;
    
    // Constructor
    
    public Dice(int diceSideNumber, DiceColor diceColor){
    	this.diceColor = diceColor;
    	this.diceSideNumber = diceSideNumber;
    
    }
    

	public int roll() {
		System.out.println(diceSideNumber);
		Random rand = new Random();
        int RandomDiceRoll = rand.nextInt(diceSideNumber);
        return RandomDiceRoll + 1;

    }
   
    
}
