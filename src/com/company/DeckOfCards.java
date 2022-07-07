package com.company;

import java.util.*;

public class DeckOfCards {

    public static List<Card> generateDeckWithJokers() {
        List<Card> deck = generateDeckWithoutJokers();
        addJokerToDeck(deck);
        addJokerToDeck(deck);
        return deck;
    }

    private static void addJokerToDeck(List<Card> deck) {
        deck.add(new Card(Card.Rank.JOKER, Card.Suit.JOKER));
    }

    private static List<Card> generateDeckWithoutJokers() {
        List<Card> deck = new ArrayList<>();
        for (Card.Suit s : Card.Suit.values()) {
            if(s != Card.Suit.JOKER) {
                for (Card.Rank r : Card.Rank.values()) {
                    if (r != Card.Rank.JOKER)
                        deck.add(new Card(r, s));
                }
            }
        }
        return deck;
    }

    public static void shuffleDeck(List<Card> deck){
      Collections.shuffle(deck);
  }  



}
