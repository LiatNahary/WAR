package com.company;

public class WarGame {

    //
//        public void playHand () {
//
//            if (gm.getPlayerTopCardValue() == gm.getOpponentTopCardValue()) {
//                if (gm.getPlayerDeckSize()< 4 || gm.getOpponentDeckSize()<4) {
//                    endGame();
//                }
//                dealtCardPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                warCardIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                warCardIIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIIIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                warCardIIIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                if (gm.testForWinner()) {
//                    endGame();}
//                return;
//            }
//            if (gm.getPlayerTopCardValue() > gm.getOpponentTopCardValue()){
//                dealtCardPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText( gm.cardName(gm.opponentPlayCards.peek()));
//                gm.addToWarStack();
//                gm.getPlayerPlayCards().addAll( gm.warStack);
//                gm.warStack.clear();
//                cardCounterPlayer.setText("Card Count: "+(gm.getPlayerDeckSize()));
//                cardCounterOpponent.setText("Card Count: "+(gm.getOpponentDeckSize()));
//                warCardIOpponent.setText(" ");
//                warCardIIOpponent.setText(" ");
//                warCardIIIOpponent.setText(" ");
//                warCardIPlayer.setText(" ");
//                warCardIIPlayer.setText(" ");
//                warCardIIIPlayer.setText(" ");
//                if (gm.testForWinner()) {
//                    endGame();}
//                return;
//            }
//            if (gm.getPlayerTopCardValue() < gm.getOpponentTopCardValue()) {
//                dealtCardPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                gm.opponentPlayCards.addAll( gm.warStack);
//                gm.warStack.clear();
//                cardCounterPlayer.setText("Card Count: "+(gm.getPlayerDeckSize()));
//                cardCounterOpponent.setText("Card Count: "+(gm.getOpponentDeckSize()));
//                warCardIOpponent.setText(" ");
//                warCardIIOpponent.setText(" ");
//                warCardIIIOpponent.setText(" ");
//                warCardIPlayer.setText(" ");
//                warCardIIPlayer.setText(" ");
//                warCardIIIPlayer.setText(" ");
//                if (gm.testForWinner()) {
//                    endGame();}
//            }
//
//
//        }
//


//    private void handlePlayerWinningRound(Card peek, Queue<Card> playCards) {
//        dealtCardPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//        dealtCardOpponent.setText(gm.cardName(peek));
//        cardCounterPlayer.setText("Card Count: " + (gm.getPlayerDeckSize()));
//        cardCounterOpponent.setText("Card Count: " + (gm.getOpponentDeckSize()));
//        warCardIOpponent.setText(" ");
//        warCardIIOpponent.setText(" ");
//        warCardIIIOpponent.setText(" ");
//        warCardIPlayer.setText(" ");
//        warCardIIPlayer.setText(" ");
//        warCardIIIPlayer.setText(" ");
//        if (gm.testForWinner()) {
//            endGame();
//        }
//    }
//
//    private void handleRoundDraw() {
//        if (gm.getPlayerDeckSize()< 4 || gm.getOpponentDeckSize()<4) {
//            endGame();
//        }
//        dealtCardPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//        dealtCardOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//        gm.addToWarStack();
//        warCardIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//        warCardIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//        gm.addToWarStack();
//        warCardIIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//        warCardIIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//        gm.addToWarStack();
//        warCardIIIPlayer.setText( gm.cardName(gm.getPlayerTopCard()));
//        warCardIIIOpponent.setText( gm.cardName(gm.getOpponentTopCard()));
//        gm.addToWarStack();
//        if (gm.testForWinner()) {
//            endGame();}
//    }
    //        GameManager.RoundWinner roundWinner = gm.testForWinner();
//        switch (roundWinner) {
//            case DRAW:
//                dealtCardPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                warCardIOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIIPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                warCardIIOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                gm.addToWarStack();
//                warCardIIIPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                warCardIIIOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                GameManager.RoundWinner warWinner = gm.testForWinner();
//                switch (warWinner) {
//                    case DRAW:
//                        playHand();
//                    case PLAYER:
//                        gm.playerWinRound();
//                        cardCounterPlayer.setText("Card Count: " + (gm.getPlayerDeckSize()));
//                        cardCounterOpponent.setText("Card Count: " + (gm.getOpponentDeckSize()));
//                    case OPPONENT:
//                        gm.opponentWinRound();
//                        cardCounterPlayer.setText("Card Count: " + (gm.getPlayerDeckSize()));
//                        cardCounterOpponent.setText("Card Count: " + (gm.getOpponentDeckSize()));
//                }
//            case PLAYER:
//                dealtCardPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                gm.playerWinRound();
//                cardCounterPlayer.setText("Card Count: " + (gm.getPlayerDeckSize()));
//                cardCounterOpponent.setText("Card Count: " + (gm.getOpponentDeckSize()));
//            case OPPONENT:
//                dealtCardPlayer.setText(gm.cardName(gm.getPlayerTopCard()));
//                dealtCardOpponent.setText(gm.cardName(gm.getOpponentTopCard()));
//                gm.opponentWinRound();
//                cardCounterPlayer.setText("Card Count: " + (gm.getPlayerDeckSize()));
//                cardCounterOpponent.setText("Card Count: " + (gm.getOpponentDeckSize()));
//        }
//
//    }
//

}