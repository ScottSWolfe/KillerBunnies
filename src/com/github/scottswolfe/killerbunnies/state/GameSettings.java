package com.github.scottswolfe.killerbunnies.state;

import java.util.ArrayList;

import com.github.scottswolfe.killerbunnies.item.enums.DeckColor;

public class GameSettings {

    int numberOfPlayers;
    ArrayList<DeckColor> decks;

    
    /**
     * @return the numberOfPlayers
     */
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    /**
     * @param numberOfPlayers the numberOfPlayers to set
     */
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    /**
     * @return the decks
     */
    public ArrayList<DeckColor> getDecks() {
        return decks;
    }
    /**
     * @param decks the decks to set
     */
    public void setDecks(ArrayList<DeckColor> decks) {
        this.decks = decks;
    }

}
