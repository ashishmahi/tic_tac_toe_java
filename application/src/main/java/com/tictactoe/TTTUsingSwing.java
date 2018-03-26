package com.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTUsingSwing {
    private final Game game  = new Game();
    private final String p1Name;
    private final String p2Name;

    public TTTUsingSwing(String p1Name, String p2Name) {
        this.p1Name = p1Name;
        this.p2Name = p2Name;
    }
    public void startGame(){
        game.addPlayer(p1Name,"X");
        game.addPlayer(p2Name,"O");
        createFrame();
    }
    private void createFrame() {
        JFrame f=new JFrame("TicTacToe");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        createBoard(f);
        f.setLayout(null);
        f.setVisible(true);
    }

    private void createBoard(Frame f) {
        int id = 0;
        ActionListener[] l =new ActionListener[9];
        createButton(f,id, l);
    }

    private void createButton(Frame f,int id, ActionListener[] l) {
        int yPos = 50;
        JLabel lable=new JLabel();
        lable.setBounds(30,20, 200,30);
        f.add(lable);
        for (int i = 0; i < 3; i++) {
            int xPos = 50;
            for (int j = 0; j < 3; j++) {
                JButton b=new JButton();
                b.setBounds(xPos,yPos,50,50);
                f.add(b);
                xPos+=50;
                final int cId = id;
                addListenerOnButton(l, b, cId,lable);
                id++;
            }
            yPos+=50;
        }
    }

    private void addListenerOnButton(ActionListener[] l, JButton b, int cId,JLabel lable) {
        l[cId] = (ActionEvent e) -> {
            b.setText(game.getSymbol());
            game.updateMove(cId+1);
            if(!game.inPlay()){
                lable.setText(game.getWinner() + " won the game!");
            }
            b.removeActionListener(l[cId]);
        };
        b.addActionListener(l[cId]);
    }
}
