package com.github.scottswolfe.killerbunnies.flow;

import com.github.scottswolfe.killerbunnies.state.GameState;

public class GameFlow {

    private GameState state;
    
    
    public void initializeGame() {
        GameInitializer initializer = new GameInitializer();
        state = initializer.initializeGame();
    }
    
    public void runGame() {
        
    }


}
