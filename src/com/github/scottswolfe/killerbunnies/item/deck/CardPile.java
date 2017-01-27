package com.github.scottswolfe.killerbunnies.item.deck;

import java.util.LinkedList;

import com.github.scottswolfe.killerbunnies.item.card.Card;

public class CardPile<Card> {

    // Instance Variables
	protected LinkedList<Card> drawPile;
    // should at least have some data structure containing PlayableCards
    // I'd recommend you look up the java.util.LinkedList class
     
    
    // Constructor
    // maybe don't worry about this yet...
    
    
    
    // Methods
    
    /**
     * Removes and returns the top card of the DrawPile
     */
    public Card draw() {
        return drawPile.removeFirst();
           
    }
    
    
    
    /**
     * Randomly shuffles the cards and returns shuffled DrawPile
     */
    public DrawPile shuffle() {
    	
        
    }
    
}
