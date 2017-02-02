package com.github.scottswolfe.killerbunnies.flow;

public class Application {

    public static void main(String[] args) {
    
        GameFlow flow = new GameFlow();
        flow.initializeGame();
        flow.runGame();
    }
    
}
