package com.tictactoe;

import java.util.ArrayList;

public class Players {
    private ArrayList<Player> players;
    private int currentPlayerIndex;

    public Players() {
        this.currentPlayerIndex =0;
        this.players = new ArrayList<Player>(2);
    }

    public void add(String playerName) {
        this.players.add(new Player(playerName));
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public void changeCurrentPlayerIndex() {
        currentPlayerIndex  = 1 -  currentPlayerIndex;
    }
}
