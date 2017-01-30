package com.github.scottswolfe.killerbunnies.state;

import java.util.ArrayList;

public class PlayerState {

    PlayerHandState hand;
    PlayerDollaState dollas;
    PlayerSpecialState specials;
    PlayerVerySpecialState verySpecials;
    PlayerResourcesState resources;
    PlayerBunnyState bunnies;
    
        
    
    
    /**
     * @return the hand
     */
    public PlayerHandState getHand() {
        return hand;
    }
    /**
     * @param hand the hand to set
     */
    public void setHand(PlayerHandState hand) {
        this.hand = hand;
    }
    /**
     * @return the dollas
     */
    public PlayerDollaState getDollas() {
        return dollas;
    }
    /**
     * @param dollas the dollas to set
     */
    public void setDollas(PlayerDollaState dollas) {
        this.dollas = dollas;
    }
    /**
     * @return the specials
     */
    public PlayerSpecialState getSpecials() {
        return specials;
    }
    /**
     * @param specials the specials to set
     */
    public void setSpecials(PlayerSpecialState specials) {
        this.specials = specials;
    }
    /**
     * @return the verySpecials
     */
    public PlayerVerySpecialState getVerySpecials() {
        return verySpecials;
    }
    /**
     * @param verySpecials the verySpecials to set
     */
    public void setVerySpecials(PlayerVerySpecialState verySpecials) {
        this.verySpecials = verySpecials;
    }
    /**
     * @return the resources
     */
    public PlayerResourcesState getResources() {
        return resources;
    }
    /**
     * @param resources the resources to set
     */
    public void setResources(PlayerResourcesState resources) {
        this.resources = resources;
    }
    /**
     * @return the bunnies
     */
    public PlayerBunnyState getBunnies() {
        return bunnies;
    }
    /**
     * @param bunnies the bunnies to set
     */
    public void setBunnies(PlayerBunnyState bunnies) {
        this.bunnies = bunnies;
    }
    
    
    

    
}
