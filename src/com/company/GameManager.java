package com.company;

import java.util.*;

public class GameManager {

    private final static Map<Card.Rank, Integer> gameValues= new HashMap<>();

    public static final int MIN_CARDS_FOR_WAR = 4;
    public static final int MIN_CARDS_FOR_ROUND = 1;

    static{
        gameValues.put(Card.Rank.ACE,  14);
        gameValues.put(Card.Rank.TWO, 2);
        gameValues.put(Card.Rank.THREE, 3);
        gameValues.put(Card.Rank.FOUR, 4);
        gameValues.put(Card.Rank.FIVE, 5);
        gameValues.put(Card.Rank.SIX, 6);
        gameValues.put(Card.Rank.SEVEN, 7);
        gameValues.put(Card.Rank.EIGHT, 8);
        gameValues.put(Card.Rank.NINE, 9);
        gameValues.put(Card.Rank.TEN, 10);
        gameValues.put(Card.Rank.JACK, 11);
        gameValues.put(Card.Rank.QUEEN, 12);
        gameValues.put(Card.Rank.KING, 13);
        gameValues.put(Card.Rank.JOKER, 15);
    }


    private Queue<Card> warStack = new LinkedList<>();
    private Queue<Card> playerPlayCards = new LinkedList<>();
    private Queue<Card> opponentPlayCards= new LinkedList<>();
    private List<Card> playDeck= DeckOfCards.generateDeckWithJokers();

    public void startNewGame(){
        DeckOfCards.shuffleDeck(playDeck);
        clearPlayersDecks();
        dealCards();
    }

    private void dealCards() {
        for (int card = 0; card < 27; card++) {
            playerPlayCards.add(playDeck.get(card));
        }
        for (int card = 27; card < playDeck.size(); card++) {
            opponentPlayCards.add(playDeck.get(card));
        }
    }

    private void clearPlayersDecks() {
        playerPlayCards.clear();
        opponentPlayCards.clear();
    }

    public int getPlayerTopCardValue(){
        return gameValues.get(getPlayerTopCard().rank);
    }
    public int getOpponentTopCardValue(){
        return gameValues.get(getOpponentTopCard().rank);
    }

    public void addToWarStack(){
        warStack.add(playerPlayCards.poll());
        warStack.add(opponentPlayCards.poll());
    }

    enum RoundWinner{PLAYER, OPPONENT, DRAW}
    public RoundWinner testForWinner(){
        if (getPlayerTopCardValue()>getOpponentTopCardValue()) {
            return RoundWinner.PLAYER;
        }
        if (getOpponentTopCardValue()>getPlayerTopCardValue()) {
            return RoundWinner.OPPONENT;
        }
        return RoundWinner.DRAW;
    }

    public RoundWinner stopGame(){
        if (getPlayerDeckSize()>getOpponentDeckSize()) {
            return RoundWinner.PLAYER;
        }
        if (getOpponentDeckSize()>getPlayerDeckSize()) {
            return RoundWinner.OPPONENT;
        }
         return RoundWinner.DRAW;
    }

    public void playerWinRound (){
        warStack.add(playerPlayCards.poll());
        warStack.add(opponentPlayCards.poll());
        finishRound(playerPlayCards);
    }

    public void opponentWinRound (){
        warStack.add(playerPlayCards.poll());
        warStack.add(opponentPlayCards.poll());
        finishRound(opponentPlayCards);
    }

    public void finishRound (Queue<Card> winnerStack){
        while (!warStack.isEmpty()) {
            winnerStack.add(warStack.poll());
        }

    }
    public boolean areConditionsForWarMet(){
        if (getPlayerDeckSize()< MIN_CARDS_FOR_WAR){
            return false;
        }
        if (getOpponentDeckSize()< MIN_CARDS_FOR_WAR){
            return false;
        }
        return true;
    }

    public boolean areConditionsForPlayMet(){
        if (getPlayerDeckSize()< MIN_CARDS_FOR_ROUND){
            return false;
        }
        if (getOpponentDeckSize()<MIN_CARDS_FOR_ROUND){
            return false;
        }
        return true;
    }


    public String cardName( Card card){
        return (card.getRank().toString()+card.suitName(card.getSuit()));
    }

    public int getPlayerDeckSize(){
        return playerPlayCards.size();
    }

    public int getOpponentDeckSize(){
        return opponentPlayCards.size();
    }


    public Queue<Card> getPlayerPlayCards() {
        return playerPlayCards;
    }

    public void setPlayerPlayCards(Queue<Card> playerPlayCards) {
        this.playerPlayCards = playerPlayCards;
    }

    public Card getPlayerTopCard(){
        return playerPlayCards.peek();
    }

    public Card getOpponentTopCard(){
        return opponentPlayCards.peek();
    }

    public Queue<Card> getOpponentPlayCards() {
        return opponentPlayCards;
    }

    public void setOpponentPlayCards(Queue<Card> opponentPlayCards) {
        this.opponentPlayCards = opponentPlayCards;
    }

    public List<Card> getPlayDeck() {
        return playDeck;
    }

    public void setPlayDeck(List<Card> playDeck) {
        this.playDeck = playDeck;
    }

    public Queue<Card> getWarStack() {
        return warStack;
    }

    public void setWarStack(Queue<Card> warStack) {
        this.warStack = warStack;
    }


    //    public RoundWinner playHand () {
//        int playerTopCardValue = getPlayerTopCardValue();
//        int opponentTopCardValue = getOpponentTopCardValue();
//        if (playerTopCardValue == opponentTopCardValue) {
//            return RoundWinner.DRAW;
//        }
//        if(playerTopCardValue < opponentTopCardValue){
//            return RoundWinner.OPPONENT;
//        }
//
//        addToWarStack();
//        getPlayerPlayCards().addAll(getWarStack());
//        getWarStack().clear();
//        return RoundWinner.PLAYER;
//    }

//    public boolean testForWinner(){
//        if (playerPlayCards.size() == 0) {
//            return true;
//        }
//        if (opponentPlayCards.size() == 0) {
//            return true;
//        }
//        return false;
//    }

//    private void dealCards2() {
//        int halfADeckSize = playDeck.size() / 2;
//        playerPlayCards.addAll(playDeck.subList(0, halfADeckSize));
//        opponentPlayCards.addAll(playDeck.subList(halfADeckSize +1,playDeck.size()));
//    }


}
