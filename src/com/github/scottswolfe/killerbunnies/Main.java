package com.github.scottswolfe.killerbunnies;

import com.github.scottswolfe.killerbunnies.model.*;
import com.github.scottswolfe.killerbunnies.model.card.Card;
import com.github.scottswolfe.killerbunnies.model.card.NumberedCard;
import com.github.scottswolfe.killerbunnies.model.card.PlayableCard;

import com.github.scottswolfe.killerbunnies.model.card.bunny.*;

public class Main {

    public static void main(String[] args){
        
        Card newBunny = new CongenialBunny001();
        System.out.println(newBunny.toString());
    }
}
