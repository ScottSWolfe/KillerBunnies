package com.github.scottswolfe.killerbunnies;

import java.util.ArrayList;


import com.github.scottswolfe.killerbunnies.item.*;
import com.github.scottswolfe.killerbunnies.item.card.Card;
import com.github.scottswolfe.killerbunnies.item.card.NumberedCard;
import com.github.scottswolfe.killerbunnies.item.card.PlayableCard;
import com.github.scottswolfe.killerbunnies.item.card.bunny.*;
import com.github.scottswolfe.killerbunnies.item.deck.CardPile;
import com.github.scottswolfe.killerbunnies.item.dice.ClearDice;
import com.github.scottswolfe.killerbunnies.item.dice.Dice;
import com.github.scottswolfe.killerbunnies.item.enums.BunnyType;
import com.github.scottswolfe.killerbunnies.item.card.BunnyCard;

public class Main {

    public static void main(String[] args){
        
    NumberedCard card1 = new BunnyCard(1, "blue", BunnyType.CONGENIAL, "pink");
    NumberedCard card2 = new BunnyCard(2, "blue", BunnyType.CONGENIAL, "pasdink");
    NumberedCard card3 = new BunnyCard(3, "blue", BunnyType.CONGENIAL, "pinadsk");
    NumberedCard card4 = new BunnyCard(4, "blue", BunnyType.CONGENIAL, "pinasdfdfdfdk");
    
    ArrayList<NumberedCard> list = new ArrayList<NumberedCard>();
    list.add(card1);
    list.add(card2);
    list.add(card3);
    list.add(card4);
    
    CardPile<NumberedCard> test = new CardPile();
    test.setDrawPile(list);
    test.shuffle();
    for (int i = 0; i != 4; i ++){
    	System.out.println(test.drawPile.get(i).getIDNumber());
    }
    }
}
