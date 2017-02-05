package com.github.scottswolfe.killerbunnies.flow;

import com.github.scottswolfe.killerbunnies.flow.interfaces.SettingsChooser;
import com.github.scottswolfe.killerbunnies.state.GameSettings;
import com.github.scottswolfe.killerbunnies.state.GameState;


public class GameInitializer {

    SettingsChooser settingsChooser;
    GameSettings settings;
    
    public GameState initializeGame() {
        
        settingsChooser = new TextUISettingsChooser();
        settings = settingsChooser.getSettings();
        
        GameState state = new GameState(settings.getNumberOfPlayers());
        return state;
    }
}
