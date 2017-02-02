package com.github.scottswolfe.killerbunnies.flow;

import com.github.scottswolfe.killerbunnies.state.GameState;

public class GameFlow {

    private GameState state;
    
    
    public void initializeGame() {
        
        state = getUserSettings();
    }
    
    public void runGame() {
        
    }

    private GameState getUserSettings() {
        // number of players
        // 
    }
}
