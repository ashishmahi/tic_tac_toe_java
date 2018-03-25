package com.tictactoe;

import java.awt.*;

public class TTTUsingAwt {
    private Game game;

    public TTTUsingAwt() {
        this.game = new Game();
    }

    public static void main(String[] args) {
        createBoard();
    }

    private static void createBoard() {
        Frame f=new Frame("TicTacToe");
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
            }
            yPos+=50;
        }

    }

}
