package com.github.scottswolfe.killerbunnies;

import com.github.scottswolfe.killerbunnies.item.*;
import com.github.scottswolfe.killerbunnies.item.card.Card;
import com.github.scottswolfe.killerbunnies.item.card.NumberedCard;
import com.github.scottswolfe.killerbunnies.item.card.PlayableCard;
import com.github.scottswolfe.killerbunnies.item.card.bunny.*;

public class Main {

    public static void main(String[] args){
        
        Card newBunny = new CongenialBunny001();
        System.out.println(newBunny.toString());
    }
}
