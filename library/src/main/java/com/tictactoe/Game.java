package com.tictactoe;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private Players players;
    private Player currentPlayer;
    private ArrayList<Integer> moves_made;
    private boolean inPlay = true;
    ArrayList<int[]> winsets;
    public Game() {
        this.players = new Players();
        this.moves_made = new ArrayList<>(9);
        this.addWinsets();
    }

    private void addWinsets() {
        this.winsets = new ArrayList<int[]>();
        this.winsets.add(new int[]{1,2,3});
        this.winsets.add(new int[]{1,4,7});
        this.winsets.add(new int[]{1,5,9});
        this.winsets.add(new int[]{4,5,6});
        this.winsets.add(new int[]{7,8,9});
        this.winsets.add(new int[]{3,6,9});
        this.winsets.add(new int[]{3,5,7});
        this.winsets.add(new int[]{2,5,8});

    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    public void updateMove(int move) {
        currentPlayer = this.players.getCurrentPlayer();
        if(!this.isValidMove(move)) return;
        currentPlayer.addMove(move);
        this.moves_made.add(move);
        if(this.hasCurrentPlayerWon()){
            System.out.println(this.getCurrentPlayerName() +" won the game!!");
            this.inPlay = false;
        }
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

    public boolean hasCurrentPlayerWon() {
        Player currentPlayer = this.getCurrentPlayer();
        return this.hasPlayerWon(currentPlayer.getMoves());
    }

    private boolean hasPlayerWon(ArrayList<Integer> moves) {
        boolean flag = false;
        for (int[] winset:this.winsets) {
            if(this.isSubset(moves,winset)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    private boolean isSubset(ArrayList<Integer> moves,int[] winset) {
        return moves.containsAll(Arrays.asList(winset[0],winset[1],winset[2]));
        }
    }
