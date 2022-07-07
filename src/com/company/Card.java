package com.company;

import java.util.HashMap;
import java.util.Map;

public class Card {

    enum Rank{
        ACE ("Ace"),
        TWO ("Two"),
        THREE ("Three"),
        FOUR ("Four"),
        FIVE ("Five"),
        SIX("Six"),
        SEVEN ("Seven"),
        EIGHT ("Eight"),
        NINE ("Nine"),
        TEN ("Ten"),
        JACK ("Jack"),
        QUEEN ("Queen"),
        KING ("King"),
        JOKER ("Joker");
        private final String rankName;
        Rank(String name) {
            this.rankName = name;
        }

        @Override
        public String toString(){
            return rankName;
        }
    }

    enum Suit {
        JOKER (SuitColor.NONE),
        SPADES(SuitColor.BLACK),
        CLUBS(SuitColor.BLACK),
        DIAMONDS(SuitColor.RED),
        HEARTS(SuitColor.RED);

        private final SuitColor color;
        Suit(SuitColor color) {
            this.color = color;
        }

        public SuitColor getColor() {
            return color;
        }
    }

    enum SuitColor {
        BLACK,
        RED,
        NONE
    }

    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit ) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }

    public String suitName(Suit suit){
        Map<Suit, String> suitName= new HashMap<>();
        suitName.put(Suit.JOKER,  (""));
        suitName.put(Suit.CLUBS, (" of Clubs"));
        suitName.put(Suit.HEARTS,(" of Hearts"));
        suitName.put(Suit.DIAMONDS, (" of Diamonds"));
        suitName.put(Suit.SPADES, (" of Spades"));
        return suitName.get(suit);
    }

}












