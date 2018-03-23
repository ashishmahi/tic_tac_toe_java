package com.tictactoe;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private Players players;
    private Player currentPlayer;
    private ArrayList<Integer> moves_made;
    private boolean inPlay = true;

    public Game() {
        this.players = new Players();
        this.moves_made = new ArrayList<>(9);
    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    public void updateMove(int move) {
        currentPlayer = this.players.getCurrentPlayer();
        if(!this.isValidMove(move)) return;
        currentPlayer.addMove(move);
        this.moves_made.add(move);
        this.players.changeCurrentPlayerIndex();
        System.out.println("your moves are " + currentPlayer.getMoves());
    }

    private boolean isValidMove(int move) {
        return  !moves_made.contains(move);
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public ArrayList<Integer> getMoves() {
        return moves_made;
    }

    public String getCurrentPlayerName() {
        return this.players.getCurrentPlayer().getName();
    }

    public boolean inPlay() {
        return this.inPlay;
    }
}
