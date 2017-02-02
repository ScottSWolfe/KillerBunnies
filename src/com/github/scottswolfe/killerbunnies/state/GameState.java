package com.github.scottswolfe.killerbunnies.state;

import java.util.ArrayList;
import java.util.List;

import com.github.scottswolfe.killerbunnies.item.card.CabbageCard;
import com.github.scottswolfe.killerbunnies.item.card.CarrotSupplyCard;
import com.github.scottswolfe.killerbunnies.item.card.DefenseCard;
import com.github.scottswolfe.killerbunnies.item.card.PlayableCard;
import com.github.scottswolfe.killerbunnies.item.card.SmallCarrotCard;
import com.github.scottswolfe.killerbunnies.item.card.WaterCard;
import com.github.scottswolfe.killerbunnies.item.deck.CardPile;
import com.github.scottswolfe.killerbunnies.item.deck.DiscardPile;
import com.github.scottswolfe.killerbunnies.item.deck.DrawPile;
import com.github.scottswolfe.killerbunnies.item.deck.SmallCarrotCardPile;

public class GameState {

    private CardPile<PlayableCard> drawPile;
    private DiscardPile<PlayableCard> discardPile;
    private List<PlayerState> players;
    private StoreState storeState;
    private BunnyCircle bunnyCircle;
    private CardPile<SmallCarrotCard> smallCarrotCards;
    private List<CarrotSupplyCard> carrotSupplyCards;
    private CardPile<CabbageCard> cabbageCards;
    private CardPile<DefenseCard> defenseCards;
    private CardPile<WaterCard> waterCards;

    public GameState(int numberOfPlayers) {
        drawPile = CardPile.createPlayableCardPile();
        discardPile = new DiscardPile<>();
        players = createPlayers(numberOfPlayers);
        storeState = new StoreState();
        bunnyCircle = new BunnyCircle();
        smallCarrotCards = CardPile.createSmallCarrotCardPile();
        carrotSupplyCards = CardPile.createCarrotSupplyCardPile();
        cabbageCards = CardPile.createCabbageCardPile();
        defenseCards = CardPile.createDefenseCardPile();
        waterCards = CardPile.createWaterCardPile();
    }
    
    public GameState(CardPile<PlayableCard> drawPile,
                     DiscardPile<PlayableCard> discardPile,
                     List<PlayerState> players,
                     StoreState storeState,
                     BunnyCircle bunnyCircle,
                     CardPile<SmallCarrotCard> smallCarrotCards,
                     List<CarrotSupplyCard> carrotSupplyCards,
                     CardPile<CabbageCard> cabbageCards,
                     CardPile<DefenseCard> defenseCards,
                     CardPile<WaterCard> waterCards) {
        
        this.drawPile = drawPile;
        this.discardPile = discardPile;
        this.players = players;
        this.storeState = storeState;
        this.bunnyCircle = bunnyCircle;
        this.smallCarrotCards = smallCarrotCards;
        this.carrotSupplyCards = carrotSupplyCards;
        this.cabbageCards = cabbageCards;
        this.defenseCards = defenseCards;
        this.waterCards = waterCards;
    }
    
    private List<PlayerState> createPlayers(int numberOfPlayers) {
        List<PlayerState> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            PlayerState player = new PlayerState();
            players.add(player);
        }
        return players;
    }
    
    /**
     * @return the drawPile
     */
    public CardPile<PlayableCard> getCardPile() {
        return drawPile;
    }
    /**
     * @param drawPile the drawPile to set
     */
    public void setCardPile(CardPile<PlayableCard> drawPile) {
        this.drawPile = drawPile;
    }
    /**
     * @return the discardPile
     */
    public DiscardPile<PlayableCard> getDiscardPile() {
        return discardPile;
    }
    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(DiscardPile<PlayableCard> discardPile) {
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
    public CardPile<SmallCarrotCard> getSmallCarrotCards() {
        return smallCarrotCards;
    }
    /**
     * @param smallCarrotCards the smallCarrotCards to set
     */
    public void setSmallCarrotCards(CardPile<SmallCarrotCard> smallCarrotCards) {
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
