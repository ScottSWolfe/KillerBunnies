package com.github.scottswolfe.killerbunnies.item.deck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import com.github.scottswolfe.killerbunnies.item.card.Card;

public class CardPile<Card> {

    // Instance Variables
	protected ArrayList<Card> drawPile;
    // should at least have some data structure containing PlayableCards
    // I'd recommend you look up the java.util.LinkedList class
     
    
    // Constructor
    // maybe don't worry about this yet...
    
    
    
    // Methods
    
    /**
     * Removes and returns the top card of the DrawPile
     */
    public Card draw() {
        return drawPile.remove(drawPile.size()-1);
           
    }
    
    
    
    /**
     * Randomly shuffles the cards and returns shuffled DrawPile
     */
    public void shuffle() {
    	Random randomNumber = new Random();
    	for ( int indexNumber = 0; indexNumber < drawPile.size() ; indexNumber ++){
    		int randNumber = randomNumber.nextInt(drawPile.size());
    		Card shuffle1 = drawPile.get(indexNumber);
    		drawPile.set(indexNumber, drawPile.get(randNumber));
    		drawPile.set(randNumber, shuffle1);
    		
    	}
    }
    
    
    
    public void setDrawPile(ArrayList<Card> drawPile) {
    	this.drawPile = drawPile;
    	
    }
    
}
