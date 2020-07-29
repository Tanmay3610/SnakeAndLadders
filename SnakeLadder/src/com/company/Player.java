package com.company;

public class Player {
    boolean winner;
    int playerID;
    String name;
    int currentPosition;

    public Player(String name, int playerID){
        this.name = name;
        this.playerID = playerID;
        this.winner = false;
        this.currentPosition = 0;
    }
}
