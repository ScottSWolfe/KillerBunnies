package com.github.scottswolfe.killerbunnies.item.dice;

import java.util.Random;

import com.github.scottswolfe.killerbunnies.item.enums.DiceColor;

public class Dice {
	
	// Instance Variables
	
	protected DiceColor diceColor;
	protected int diceSideNumber;
    
    // Constructor
    
    public Dice(int diceSideNumber, DiceColor diceColor){
    
    }
    

	public int roll() {
   
		Random rand = new Random();
        int RandomDiceRoll = rand.nextInt(diceSideNumber);
        return RandomDiceRoll + 1;

    }
   
    
}
