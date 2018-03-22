package com.tictactoe;

import java.util.ArrayList;

public class Players {
    private ArrayList<Player> players;
    private int currenPlayerIndex;

    public Players() {
        this.currenPlayerIndex =0;
        this.players = new ArrayList<Player>(2);
    }

    public void add(Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getCurrentPlayer() {
        return players.get(currenPlayerIndex);
    }
}
