package com.tictactoe;

import java.util.ArrayList;

public class Player {
    private final String name;
    protected ArrayList<Integer> moves;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        this.moves = new ArrayList<Integer>();

    }

    public void addMove(int move) {
        moves.add(move);
    }

    public ArrayList<Integer> getMoves() {
        return this.moves;
    }
}
