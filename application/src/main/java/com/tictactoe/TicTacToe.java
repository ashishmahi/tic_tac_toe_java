package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    private static void updateMove(Game game) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println(game.getCurrentPlayerName() + " please enter your move:");
            int move = sc.nextInt();
            game.updateMove(move);
        }
    }

    private static void addPlayers(Game game) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("player "+ i +" enter your name:");
            String name = sc.nextLine();
            game.addPlayer(name);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        addPlayers(game);
        updateMove(game);
    }

}
