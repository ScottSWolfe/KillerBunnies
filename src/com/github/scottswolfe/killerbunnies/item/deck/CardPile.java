package com.github.scottswolfe.killerbunnies.item.deck;

import java.util.ArrayList;
import java.util.Random;

import com.github.scottswolfe.killerbunnies.item.card.Card;

public class CardPile<T extends Card> {

    // Instance Variables
	protected ArrayList<T> drawPile;     
    
    // Constructor
	public CardPile () {
	    
	}
    
    
    // Methods
    
    /**
     * Removes and returns the top card of the CardPile
     */
    public T draw() {
        return drawPile.remove(drawPile.size()-1);      
    }
    
    /**
     * Randomly shuffles the cards and returns shuffled DrawPile
     */
    public void shuffle() {
    	Random rand = new Random();
    	for (int indexNumber = 0; indexNumber < drawPile.size() ; indexNumber ++) {
    		int randNumber = rand.nextInt(drawPile.size());
    		T cardAtIndex = drawPile.get(indexNumber);
    		drawPile.set(indexNumber, drawPile.get(randNumber));
    		drawPile.set(randNumber, cardAtIndex);
    		
    	}
    }
    
    public void setDrawPile(ArrayList<T> drawPile) {
    	this.drawPile = drawPile;	
    }
    
}
