//package com.company;
//
//import javax.swing.*;
//import javax.swing.border.BevelBorder;
//import javax.swing.border.EtchedBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//    public class WarGameSetup extends JFrame implements ActionListener {
//        public static final String FONT_TYPE = "Brygada 1918";
//        GameManager gm = new GameManager();
//
//        private void setPlayerTextBoxesBlank (){
//            dealtCardPlayer.setText(" ");
//            warCardIPlayer.setText(" ");
//            warCardIIPlayer.setText(" ");
//            warCardIIIPlayer.setText(" ");
//        }
//
//        private void setOpponentTextBoxesBlank (){
//            dealtCardOpponent.setText(" ");
//            warCardIOpponent.setText(" ");
//            warCardIIOpponent.setText(" ");
//            warCardIIIOpponent.setText(" ");
//        }
//
//        @Override
//        public void actionPerformed (ActionEvent actionEvent){
//
//        }
//
//
//
//
//
//
//
//        public void startNewGame(){
//            restart.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            restart.setForeground(new Color(83, 71, 65));
//            deal.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            deal.setForeground(new Color(54, 47, 45));
//            restart.setText("Restart Game");
//
//            gm.startNewGame();
//
//            setPlayerTextBoxesBlank();
//            cardCounterPlayer.setText("Card Count: "+gm.getPlayerDeckSize());
//            setOpponentTextBoxesBlank();
//            cardCounterOpponent.setText("Card Count: "+gm.getOpponentDeckSize());
//
//        }
//        public void endGame(){
//            restart.setText("Start Game");
//            if(gm.getPlayerDeckSize()>gm.getOpponentDeckSize()) {
//                setPlayerTextBoxesBlank();
//                cardCounterPlayer.setText(" ");
//                dealtCardPlayer.setText("WINNER!!!");
//                setOpponentTextBoxesBlank();
//                cardCounterOpponent.setText(" ");
//                return;
//            }
//            if(gm.getPlayerDeckSize()<gm.getOpponentDeckSize()) {
//
//                setOpponentTextBoxesBlank();
//                cardCounterOpponent.setText(" ");
//                dealtCardOpponent.setText("WINNER!!!");
//                setPlayerTextBoxesBlank();
//                cardCounterPlayer.setText(" ");
//                return;
//            }
//
//            setPlayerTextBoxesBlank();
//            dealtCardPlayer.setText("It's a Tie");
//            cardCounterPlayer.setText(" ");
//            setOpponentTextBoxesBlank();
//            dealtCardOpponent.setText("It's a Tie");
//            cardCounterOpponent.setText(" ");
//            deal.setEnabled(false);
//            endGame.setEnabled(false);
//        }
//
//
//        public void playHand () {
//
//            if (gm.getPlayerTopCrdValue() == gm.getOpponentTopCrdValue()) {
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
//            if (gm.getPlayerTopCrdValue() > gm.getOpponentTopCrdValue()){
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
//            if (gm.getPlayerTopCrdValue() < gm.getOpponentTopCrdValue()) {
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
//
//
//
//
//
//        //GUI Setup
//        JFrame frame = new JFrame();
//
//        JPanel panelW = new JPanel();
//        JPanel panelC = new JPanel();
//        JPanel panelE = new JPanel();
//
//        JLabel labelTitle = new JLabel();
//        JLabel labelSubTitle = new JLabel();
//        JLabel labelPlayer = new JLabel();
//        JLabel labelOpponent = new JLabel();
//
//        JButton deal = new JButton();
//        JButton restart = new JButton();
//        JButton endGame = new JButton();
//
//        JTextField dealtCardPlayer = new JTextField();
//        JTextField warCardIPlayer = new JTextField();
//        JTextField warCardIIPlayer = new JTextField();
//        JTextField warCardIIIPlayer = new JTextField();
//        JTextField cardCounterPlayer = new JTextField();
//        JTextField dealtCardOpponent = new JTextField();
//        JTextField warCardIOpponent = new JTextField();
//        JTextField warCardIIOpponent = new JTextField();
//        JTextField warCardIIIOpponent = new JTextField();
//        JTextField cardCounterOpponent = new JTextField();
//
//
//        public void guiSetup() {
//
//            //FRAME
//            frame.setVisible(true);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setResizable(false);
//            frame.setSize(960, 480);
//            frame.setTitle("WAR Game");
//            frame.getContentPane().setBackground(new Color(235, 235, 235));
//            frame.setLayout(new GridLayout(1, 3, 20, 20));
//
//            frame.add(panelW);
//            frame.add(panelC);
//            frame.add(panelE);
//
//            //PANELS
//            panelW.setOpaque(false);
//            panelW.setLayout(new GridLayout(6, 1, 10, 10));
//            panelW.add(labelPlayer);
//            panelW.add(dealtCardPlayer);
//            panelW.add(warCardIPlayer);
//            panelW.add(warCardIIPlayer);
//            panelW.add(warCardIIIPlayer);
//            panelW.add(cardCounterPlayer);
//
//
//            panelC.setOpaque(false);
//            panelC.setLayout(new GridLayout(6, 1, 10, 10));
//            panelC.add(labelTitle);
//            panelC.add(labelSubTitle);
//            panelC.add(deal);
//            panelC.add(restart);
//            panelC.add(endGame);
//
//            panelE.setOpaque(false);
//            panelE.setLayout(new GridLayout(6, 1, 10, 10));
//            panelE.add(labelOpponent);
//            panelE.add(dealtCardOpponent);
//            panelE.add(warCardIOpponent);
//            panelE.add(warCardIIOpponent);
//            panelE.add(warCardIIIOpponent);
//            panelE.add(cardCounterOpponent);
//
//            //LABELS
//            labelTitle.setText("WAR Game");
//            labelTitle.setOpaque(false);
//            labelTitle.setForeground(new Color(54, 47, 45));
//            labelTitle.setFont(new Font(FONT_TYPE, Font.PLAIN, 40));
//            labelTitle.setVerticalAlignment(JLabel.CENTER);
//            labelTitle.setHorizontalAlignment(JLabel.CENTER);
//
//            labelSubTitle.setText("click Deal to fight");
//            labelSubTitle.setOpaque(false);
//            labelSubTitle.setForeground(new Color(54, 47, 45));
//            labelSubTitle.setFont(new Font(FONT_TYPE, Font.PLAIN, 20));
//            labelSubTitle.setVerticalAlignment(JLabel.CENTER);
//            labelSubTitle.setHorizontalAlignment(JLabel.CENTER);
//
//            labelPlayer.setText(" Worthy Payer");
//            labelPlayer.setOpaque(false);
//            labelPlayer.setForeground(new Color(24, 71, 89));
//            labelPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 30));
//            labelPlayer.setVerticalAlignment(JLabel.CENTER);
//            labelPlayer.setHorizontalAlignment(JLabel.CENTER);
//
//            labelOpponent.setText("Evil Opponent");
//            labelOpponent.setOpaque(false);
//            labelOpponent.setForeground(new Color(138, 48, 45));
//            labelOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 30));
//            labelOpponent.setVerticalAlignment(JLabel.CENTER);
//            labelOpponent.setHorizontalAlignment(JLabel.CENTER);
//
//
//            //BUTTONS
//            deal.addActionListener(e -> playHand());
//            deal.setBounds(10, 10, 200, 100);
//            deal.setText("Deal");
//            deal.setFocusable(false);
//            deal.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            deal.setBackground(new Color(190, 185, 181));
//            deal.setForeground(new Color(83, 71, 65));
//            deal.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//
//            restart.addActionListener(e -> startNewGame());
//            restart.setBounds(10, 10, 200, 100);
//            restart.setText("Start Game");
//            restart.setFocusable(false);
//            restart.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            restart.setBackground(new Color(190, 185, 181));
//            restart.setForeground(new Color(54, 47, 45));
//            restart.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//
//            endGame.addActionListener(e -> endGame());
//            endGame.setBounds(10, 10, 200, 100);
//            endGame.setText("End Game");
//            endGame.setFocusable(false);
//            endGame.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            endGame.setBackground(new Color(190, 185, 181));
//            endGame.setForeground(new Color(83, 71, 65));
//            endGame.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
//
//
//            //TEXT FIELD
//
//            dealtCardPlayer.setPreferredSize(new Dimension(200, 100));
//            dealtCardPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            dealtCardPlayer.setForeground(new Color(42, 71, 89));
//            dealtCardPlayer.setBackground(new Color(255, 255, 255));
//            dealtCardPlayer.setText("dealt card");
//            dealtCardPlayer.setEditable(false);
//            dealtCardPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIIIPlayer.setPreferredSize(new Dimension(200, 100));
//            warCardIIIPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            warCardIPlayer.setForeground(new Color(42, 71, 89));
//            warCardIIIPlayer.setBackground(new Color(255, 255, 255));
//            warCardIIIPlayer.setText("war 3");
//            warCardIIIPlayer.setEditable(false);
//            warCardIIIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIIPlayer.setPreferredSize(new Dimension(200, 100));
//            warCardIIPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            warCardIIPlayer.setForeground(new Color(48, 77, 94));
//            warCardIIPlayer.setBackground(new Color(255, 255, 255));
//            warCardIIPlayer.setText("war 2");
//            warCardIIPlayer.setEditable(false);
//            warCardIIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIPlayer.setPreferredSize(new Dimension(200, 100));
//            warCardIPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            warCardIPlayer.setForeground(new Color(48, 77, 94));
//            warCardIPlayer.setBackground(new Color(255, 255, 255));
//            warCardIPlayer.setText("war1");
//            warCardIPlayer.setEditable(false);
//            warCardIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            cardCounterPlayer.setPreferredSize(new Dimension(200, 100));
//            cardCounterPlayer.setFont(new Font(FONT_TYPE, Font.PLAIN, 20));
//            cardCounterPlayer.setForeground(new Color(42, 71, 89));
//            cardCounterPlayer.setBackground(new Color(235, 235, 235));
//            cardCounterPlayer.setText("Card Count:");
//            cardCounterPlayer.setEditable(false);
//            cardCounterPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            dealtCardOpponent.setPreferredSize(new Dimension(200, 100));
//            dealtCardOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            dealtCardOpponent.setForeground(new Color(138, 58, 74));
//            dealtCardOpponent.setBackground(new Color(255, 255, 255));
//            dealtCardOpponent.setText("dealt card");
//            dealtCardOpponent.setEditable(false);
//            dealtCardOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIIIOpponent.setPreferredSize(new Dimension(200, 100));
//            warCardIIIOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 24));
//            warCardIOpponent.setForeground(new Color(145, 53, 51));
//            warCardIIIOpponent.setBackground(new Color(255, 255, 255));
//            warCardIIIOpponent.setText("war 3");
//            warCardIIIOpponent.setEditable(false);
//            warCardIIIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIIOpponent.setPreferredSize(new Dimension(200, 100));
//            warCardIIOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            warCardIIOpponent.setForeground(new Color(145, 53, 71));
//            warCardIIOpponent.setBackground(new Color(255, 255, 255));
//            warCardIIOpponent.setText("war 2");
//            warCardIIOpponent.setEditable(false);
//            warCardIIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            warCardIOpponent.setPreferredSize(new Dimension(200, 100));
//            warCardIOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 18));
//            warCardIOpponent.setForeground(new Color(145, 53, 71));
//            warCardIOpponent.setBackground(new Color(255, 255, 255));
//            warCardIOpponent.setText("war1");
//            warCardIOpponent.setEditable(false);
//            warCardIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//            cardCounterOpponent.setPreferredSize(new Dimension(200, 100));
//            cardCounterOpponent.setFont(new Font(FONT_TYPE, Font.PLAIN, 20));
//            cardCounterOpponent.setForeground(new Color(138, 47, 45));
//            cardCounterOpponent.setBackground(new Color(235, 235, 235));
//            cardCounterOpponent.setText("Card Count:");
//            cardCounterOpponent.setEditable(false);
//            cardCounterOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
//
//        }
//
//
//
//    }
//
//
//
