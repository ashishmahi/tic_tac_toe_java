package com.tictactoe;

import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private final String name;
    protected ArrayList<Integer> moves;
    private String symbol;

    public String getName() {
        return name;
    }

    public Player(String name,String symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new ArrayList<Integer>();

    }

    public void addMove(int move) {
        moves.add(move);
    }

    public ArrayList<Integer> getMoves() {
        return this.moves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(moves, player.moves);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, moves);
    }

    public String getSymbol() {
        return symbol;
    }
}
