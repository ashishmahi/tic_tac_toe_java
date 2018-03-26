package com.tictactoe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTUsingAwt {
    static Game game  = new Game();
    public static void main(String[] args) {
        game.addPlayer("ashish","X");
        game.addPlayer("debu","O");
        TTTUsingAwt ttt = new TTTUsingAwt();
        Frame f=new Frame("TicTacToe");
        createBoard(f);
    }

//    private static void addEventListnerTo(Frame f) {
//        Component[] components = f.getComponents();
//        for (int i = 0; i < components.length; i++) {
//
//        }
//    }

    private static void createBoard(Frame f) {
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        int yPos = 50;
        for (int i = 0; i < 3; i++) {
            int xPos = 50;
            for (int j = 0; j < 3; j++) {
                Button b=new Button();
                b.setBounds(xPos,yPos,50,50);
                f.add(b);
                xPos+=50;
                b.addActionListener(e -> {
                    b.setLabel(game.getSymbol());
                    int move = Integer.parseInt(b.getName().substring(6))+1;
                    System.out.println(move);
                    System.out.println(b.getName());
                    game.updateMove(Integer.parseInt(b.getName().substring(6))+1);
                });
            }
            yPos+=50;
        }

    }

}
