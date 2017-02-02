package com.github.scottswolfe.killerbunnies.flow;

import com.github.scottswolfe.killerbunnies.state.GameState;


public class GameInitializer {

    private int numberOfPlayers;
    
    
    public GameState initializeGame() {
        
        // TODO SettingsChooser gets a settings object and sets instance methods
        GameState state = new GameState(numberOfPlayers);
        return state;
    }
}
