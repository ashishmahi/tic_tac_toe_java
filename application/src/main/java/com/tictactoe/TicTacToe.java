package com.tictactoe;

import java.util.Scanner;
public class TicTacToe {
    private static void updateMove(Game game) {
        Scanner sc = new Scanner(System.in);
        while (game.inPlay()){
            System.out.println(game.getCurrentPlayerName() + " please enter your move:");
            String move = sc.next();
            if(!validMove(move))continue;
            game.updateMove(Integer.parseInt(move));
        }
        System.out.println(game.getWinner() + "won the game");
    }

    private static boolean validMove(String move) {
        return move.matches("[1-9]");
    }

    private static void addPlayers(Game game) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("player "+ i +" enter your name:");
            String name = sc.nextLine();
            game.addPlayer(name, "O");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        addPlayers(game);
        updateMove(game);
    }
}
