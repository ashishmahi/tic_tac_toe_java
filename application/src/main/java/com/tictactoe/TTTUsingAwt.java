package com.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTUsingAwt {
    static Game game  = new Game();
    public static void main(String[] args) {
        game.addPlayer("ashish","X");
        game.addPlayer("debu","O");
        JFrame f=new JFrame("TicTacToe");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        createBoard(f);
        f.setLayout(null);
        f.setVisible(true);
    }

    private static void createBoard(Frame f) {

        int yPos = 50;
        int id = 0;
        ActionListener[] l =new ActionListener[9];
        for (int i = 0; i < 3; i++) {
            int xPos = 50;
            for (int j = 0; j < 3; j++) {
                JButton b=new JButton();
                b.setBounds(xPos,yPos,50,50);
                f.add(b);
                xPos+=50;
                final int cId = id;
                l[cId] = (ActionEvent e) -> {
                    b.setText(game.getSymbol());
                    game.updateMove(cId+1);
                    b.removeActionListener(l[cId]);
                };
                b.addActionListener(l[cId]);
                id++;
            }
            yPos+=50;
        }
    }

}
