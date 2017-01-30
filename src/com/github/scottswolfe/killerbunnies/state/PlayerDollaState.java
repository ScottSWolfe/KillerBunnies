package com.github.scottswolfe.killerbunnies.state;

import java.util.List;

import com.github.scottswolfe.killerbunnies.item.card.DollaCard;

public class PlayerDollaState {

    List<DollaCard> dollas;

    
    
    
    /**
     * @return the dollas
     */
    public List<DollaCard> getDollas() {
        return dollas;
    }

    /**
     * @param dollas the dollas to set
     */
    public void setDollas(List<DollaCard> dollas) {
        this.dollas = dollas;
    }
    
    
}
