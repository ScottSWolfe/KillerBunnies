package com.github.scottswolfe.killerbunnies;

import com.github.scottswolfe.killerbunnies.item.*;
import com.github.scottswolfe.killerbunnies.item.card.Card;
import com.github.scottswolfe.killerbunnies.item.card.NumberedCard;
import com.github.scottswolfe.killerbunnies.item.card.PlayableCard;
import com.github.scottswolfe.killerbunnies.item.card.bunny.*;
import com.github.scottswolfe.killerbunnies.item.dice.ClearDice;
import com.github.scottswolfe.killerbunnies.item.dice.Dice;
import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;

public class Main {

    public static void main(String[] args){
        
        BunnyCard newBunny = new CongenialBunny001();
        System.out.println(newBunny.toString());
        
        System.out.println(newBunny.bunnyCount());
        
        Dice testDice = new ClearDice();
        System.out.println(testDice.roll());
    }
}
