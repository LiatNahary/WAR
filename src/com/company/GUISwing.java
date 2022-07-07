//package com.company;
//import javax.swing.*;
//import javax.swing.border.BevelBorder;
//import javax.swing.border.EtchedBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class GUISwing extends JFrame  {
//
//
//
//    public static void main(String[] args) {
//        WarGame game= new WarGame();
//
////        JFrame frame = new JFrame();
////
////        JPanel panelW = new JPanel();
////        JPanel panelC = new JPanel();
////        JPanel panelE = new JPanel();
////
////        JLabel labelTitle= new JLabel();
////        JLabel labelSubTitle= new JLabel();
////        JLabel labelPlayer= new JLabel();
////        JLabel labelOpponent= new JLabel();
////
////        JButton deal= new JButton();
////        JButton restart= new JButton();
////        JButton endGame= new JButton();
////
////        JTextField dealtCardPlayer = new JTextField();
////        JTextField warCardIPlayer = new JTextField();
////        JTextField warCardIIPlayer = new JTextField();
////        JTextField warCardIIIPlayer = new JTextField();
////        JTextField cardCounterPlayer = new JTextField();
////        JTextField dealtCardOpponent = new JTextField();
////        JTextField warCardIOpponent = new JTextField();
////        JTextField warCardIIOpponent = new JTextField();
////        JTextField warCardIIIOpponent = new JTextField();
////        JTextField cardCounterOpponent = new JTextField();
////
////
////
////
////        //FRAME
////        frame.setVisible(true);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setResizable(false);
////        frame.setSize(960,480);
////        frame.setTitle("WAR Game");
////        frame.getContentPane().setBackground(new Color(199,178,153));
////        frame.setLayout(new GridLayout(1,3,20,20));
////
////        frame.add(panelW);
////        frame.add(panelC);
////        frame.add(panelE);
////
//////        ImageIcon image =new ImageIcon("war.png");
//////        frame.setIconImage(image.getImage());
////
////
////
////        //PANELS
////       panelW.setOpaque(false);
////       panelW.setLayout(new GridLayout(6, 1,10,10));
////       panelW.add(labelPlayer);
////       panelW.add(dealtCardPlayer);
////       panelW.add(warCardIPlayer);
////       panelW.add(warCardIIPlayer);
////       panelW.add(warCardIIIPlayer);
////       panelW.add(cardCounterPlayer);
////
////
////       panelC.setOpaque(false);
////       panelC.setLayout(new GridLayout(6, 1,10,10));
////       panelC.add( labelTitle);
////       panelC.add(labelSubTitle);
////       panelC.add(deal);
////       panelC.add(restart);
////       panelC.add(endGame);
////
////       panelE.setOpaque(false);
////       panelE.setLayout(new GridLayout(6, 1,10,10));
////       panelE.add(labelOpponent);
////       panelE.add(dealtCardOpponent);
////       panelE.add(warCardIOpponent);
////       panelE.add(warCardIIOpponent);
////       panelE.add(warCardIIIOpponent);
////       panelE.add(cardCounterOpponent);
////
////        //LABELS
////        labelTitle.setText("WAR Game");
////        labelTitle.setOpaque(false);
////        labelTitle.setForeground(new Color(54,47,45));
////        labelTitle.setFont(new Font("GothicE",Font.PLAIN,40));
////        labelTitle.setVerticalAlignment(JLabel.CENTER);
////        labelTitle.setHorizontalAlignment(JLabel.CENTER);
////
////        labelSubTitle.setText("click Deal to fight");
////        labelSubTitle.setOpaque(false);
////        labelSubTitle.setForeground(new Color(54,47,45));
////        labelSubTitle.setFont(new Font("GothicE",Font.PLAIN,20));
////        labelSubTitle.setVerticalAlignment(JLabel.CENTER);
////        labelSubTitle.setHorizontalAlignment(JLabel.CENTER);
////
////        labelPlayer.setText(" Worthy Payer");
////        labelPlayer.setOpaque(false);
////        labelPlayer.setForeground(new Color(54,47,45));
////        labelPlayer.setFont(new Font("GothicE",Font.PLAIN,30));
////        labelPlayer.setVerticalAlignment(JLabel.CENTER);
////        labelPlayer.setHorizontalAlignment(JLabel.CENTER);
////
////        labelOpponent.setText("Evil Opponent");
////        labelOpponent.setOpaque(false);
////        labelOpponent.setForeground(new Color(54,47,45));
////        labelOpponent.setFont(new Font("GothicE",Font.PLAIN,30));
////        labelOpponent.setVerticalAlignment(JLabel.CENTER);
////        labelOpponent.setHorizontalAlignment(JLabel.CENTER);
////
////
////
////
////       //BUTTONS
////        deal.addActionListener(e -> game.playHand());
////        deal.setBounds(10,10,200,100);
////        deal.setText("Deal");
////        deal.setFocusable(false);
////        deal.setFont (new Font("GothicE",Font.PLAIN,24));
////        deal.setBackground(new Color(153,134,117));
////        deal.setForeground(new Color(54,47,45));
////        deal.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
////
////        restart.addActionListener(e -> game.startNewGame());
////        restart.setBounds(10,10,200,100);
////        restart.setText("Restart Game");
////        restart.setFocusable(false);
////        restart.setFont (new Font("GothicE",Font.PLAIN,18));
////        restart.setBackground(new Color(153,134,117));
////        restart.setForeground(new Color(83,71,65));
////        restart.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
////
////        endGame.addActionListener(e -> game.endCurrentGame());
////        endGame.setBounds(10,10,200,100);
////        endGame.setText("End Game");
////        endGame.setFocusable(false);
////        endGame.setFont (new Font("GothicE",Font.PLAIN,18));
////        endGame.setBackground(new Color(153,134,117));
////        endGame.setForeground(new Color(83,71,65));
////        endGame.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
////
////        //TEXT FIELD
////
////        dealtCardPlayer.setPreferredSize(new Dimension(200,100));
////        dealtCardPlayer.setFont(new Font("GothicE",Font.PLAIN,24));
////        dealtCardPlayer.setForeground(new Color(54,47,45));
////        dealtCardPlayer.setBackground(new Color(226,208,188));
////        dealtCardPlayer.setText("dealt card");
////        dealtCardPlayer.setEditable(false);
////        dealtCardPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIIIPlayer.setPreferredSize(new Dimension(200,100));
////        warCardIIIPlayer.setFont(new Font("GothicE",Font.PLAIN,24));
////        warCardIPlayer.setForeground(new Color(54,47,45));
////        warCardIIIPlayer.setBackground(new Color(226,208,188));
////        warCardIIIPlayer.setText("war 3");
////        warCardIIIPlayer.setEditable(false);
////        warCardIIIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIIPlayer.setPreferredSize(new Dimension(200,100));
////        warCardIIPlayer.setFont(new Font("GothicE",Font.PLAIN,18));
////        warCardIIPlayer.setForeground(new Color(83,71,65));
////        warCardIIPlayer.setBackground(new Color(226,208,188));
////        warCardIIPlayer.setText("war 2");
////        warCardIIPlayer.setEditable(false);
////        warCardIIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIPlayer.setPreferredSize(new Dimension(200,100));
////        warCardIPlayer.setFont(new Font("GothicE",Font.PLAIN,18));
////        warCardIPlayer.setForeground(new Color(83,71,65));
////        warCardIPlayer.setBackground(new Color(226,208,188));
////        warCardIPlayer.setText("war1");
////        warCardIPlayer.setEditable(false);
////        warCardIPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        cardCounterPlayer.setPreferredSize(new Dimension(200,100));
////        cardCounterPlayer.setFont(new Font("GothicE",Font.PLAIN,20));
////        cardCounterPlayer.setForeground(new Color(54,47,45));
////        cardCounterPlayer.setBackground(new Color(199,178,153));
////        cardCounterPlayer.setText("Card Count:");
////        cardCounterPlayer.setEditable(false);
////        cardCounterPlayer.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        dealtCardOpponent.setPreferredSize(new Dimension(200,100));
////        dealtCardOpponent.setFont(new Font("GothicE",Font.PLAIN,24));
////        dealtCardOpponent.setForeground(new Color(54,47,45));
////        dealtCardOpponent.setBackground(new Color(226,208,188));
////        dealtCardOpponent.setText("dealt card");
////        dealtCardOpponent.setEditable(false);
////        dealtCardOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIIIOpponent.setPreferredSize(new Dimension(200,100));
////        warCardIIIOpponent.setFont(new Font("GothicE",Font.PLAIN,24));
////        warCardIOpponent.setForeground(new Color(54,47,45));
////        warCardIIIOpponent.setBackground(new Color(226,208,188));
////        warCardIIIOpponent.setText("war 3");
////        warCardIIIOpponent.setEditable(false);
////        warCardIIIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIIOpponent.setPreferredSize(new Dimension(200,100));
////        warCardIIOpponent.setFont(new Font("GothicE",Font.PLAIN,18));
////        warCardIIOpponent.setForeground(new Color(83,71,65));
////        warCardIIOpponent.setBackground(new Color(226,208,188));
////        warCardIIOpponent.setText("war 2");
////        warCardIIOpponent.setEditable(false);
////        warCardIIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        warCardIOpponent.setPreferredSize(new Dimension(200,100));
////        warCardIOpponent.setFont(new Font("GothicE",Font.PLAIN,18));
////        warCardIOpponent.setForeground(new Color(83,71,65));
////        warCardIOpponent.setBackground(new Color(226,208,188));
////        warCardIOpponent.setText("war1");
////        warCardIOpponent.setEditable(false);
////        warCardIOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////        cardCounterOpponent.setPreferredSize(new Dimension(200,100));
////        cardCounterOpponent.setFont(new Font("GothicE",Font.PLAIN,20));
////        cardCounterOpponent.setForeground(new Color(54,47,45));
////        cardCounterOpponent.setBackground(new Color(199,178,153));
////        cardCounterOpponent.setText("Card Count:");
////        cardCounterOpponent.setEditable(false);
////        cardCounterOpponent.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
////
////
////
////
////    }
//
//
//
//    }
//
