package com.github.scottswolfe.killerbunnies.state;

import java.util.List;

import com.github.scottswolfe.killerbunnies.item.card.CabbageCard;
import com.github.scottswolfe.killerbunnies.item.card.CarrotSupplyCard;
import com.github.scottswolfe.killerbunnies.item.card.DefenseCard;
import com.github.scottswolfe.killerbunnies.item.card.WaterCard;
import com.github.scottswolfe.killerbunnies.item.deck.CardPile;
import com.github.scottswolfe.killerbunnies.item.deck.DiscardPile;

public class GameState {

    private CardPile drawPile;
    private DiscardPile discardPile;
    private List<PlayerState> players;
    private StoreState storeState;
    private BunnyCircle bunnyCircle;
    private CardPile smallCarrotCards;
    private List<CarrotSupplyCard> carrotSupplyCards;
    private CardPile<CabbageCard> cabbageCards;
    private CardPile<DefenseCard> defenseCards;
    private CardPile<WaterCard> waterCards;

    
    
    
    
    
    
    
    
    
    /**
     * @return the drawPile
     */
    public CardPile getCardPile() {
        return drawPile;
    }
    /**
     * @param drawPile the drawPile to set
     */
    public void setCardPile(CardPile drawPile) {
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
    public CardPile getSmallCarrotCards() {
        return smallCarrotCards;
    }
    /**
     * @param smallCarrotCards the smallCarrotCards to set
     */
    public void setSmallCarrotCards(CardPile smallCarrotCards) {
        this.smallCarrotCards = smallCarrotCards;
    }
    /**
     * @return the bigCarrotCards
     */
    public List<CarrotSupplyCard> getBigCarrotCards() {
        return carrotSupplyCards;
    }
    /**
     * @param bigCarrotCards the bigCarrotCards to set
     */
    public void setCarrotSupplyCards(List<CarrotSupplyCard> carrotSupplyCards) {
        this.carrotSupplyCards = carrotSupplyCards;
    }
    
    
}
