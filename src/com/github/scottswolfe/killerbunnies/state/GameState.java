package com.github.scottswolfe.killerbunnies.state;

import java.util.List;

import com.github.scottswolfe.killerbunnies.item.card.BigCarrotCard;
import com.github.scottswolfe.killerbunnies.item.deck.DiscardPile;
import com.github.scottswolfe.killerbunnies.item.deck.DrawPile;

public class GameState {

    DrawPile drawPile;
    DiscardPile discardPile;
    List<PlayerState> players;
    StoreState storeState;
    BunnyCircle bunnyCircle;
    DrawPile smallCarrotCards;
    List<BigCarrotCard> bigCarrotCards;
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the drawPile
     */
    public DrawPile getDrawPile() {
        return drawPile;
    }
    /**
     * @param drawPile the drawPile to set
     */
    public void setDrawPile(DrawPile drawPile) {
        this.drawPile = drawPile;
    }
    /**
     * @return the discardPile
     */
    public DiscardPile getDiscardPile() {
        return discardPile;
    }
    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(DiscardPile discardPile) {
        this.discardPile = discardPile;
    }
    /**
     * @return the players
     */
    public List<PlayerState> getPlayers() {
        return players;
    }
    /**
     * @param players the players to set
     */
    public void setPlayers(List<PlayerState> players) {
        this.players = players;
    }
    /**
     * @return the storeState
     */
    public StoreState getStoreState() {
        return storeState;
    }
    /**
     * @param storeState the storeState to set
     */
    public void setStoreState(StoreState storeState) {
        this.storeState = storeState;
    }
    /**
     * @return the bunnyCircle
     */
    public BunnyCircle getBunnyCircle() {
        return bunnyCircle;
    }
    /**
     * @param bunnyCircle the bunnyCircle to set
     */
    public void setBunnyCircle(BunnyCircle bunnyCircle) {
        this.bunnyCircle = bunnyCircle;
    }
    /**
     * @return the smallCarrotCards
     */
    public DrawPile getSmallCarrotCards() {
        return smallCarrotCards;
    }
    /**
     * @param smallCarrotCards the smallCarrotCards to set
     */
    public void setSmallCarrotCards(DrawPile smallCarrotCards) {
        this.smallCarrotCards = smallCarrotCards;
    }
    /**
     * @return the bigCarrotCards
     */
    public List<BigCarrotCard> getBigCarrotCards() {
        return bigCarrotCards;
    }
    /**
     * @param bigCarrotCards the bigCarrotCards to set
     */
    public void setBigCarrotCards(List<BigCarrotCard> bigCarrotCards) {
        this.bigCarrotCards = bigCarrotCards;
    }
    
    
}
