package com.github.scottswolfe.killerbunnies;

import com.github.scottswolfe.killerbunnies.model.*;
import com.github.scottswolfe.killerbunnies.model.card.Card;
import com.github.scottswolfe.killerbunnies.model.card.NumberedCard;
import com.github.scottswolfe.killerbunnies.model.card.PlayableCard;

public class Main {

    public static void main(String[] args){
        System.out.println("hello world" + args[0] + " " + args[2]);
        
        NumberedCard card;
        card = new NumberedCard(42);
        System.out.println(card.getIDNumber());
        
        NumberedCard card1 = new NumberedCard(43);
        
        
        Card yellow = new PlayableCard();
    }
}
