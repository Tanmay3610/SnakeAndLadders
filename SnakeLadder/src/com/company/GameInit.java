package com.company;

import java.util.Scanner;

public class GameInit {
    static Scanner scn = new Scanner(System.in);
    public static Snake[] inputSnake(){
        //Input for number of players
        int numberOfSnakes;
        numberOfSnakes = scn.nextInt();
        Snake[] snakes = new Snake[numberOfSnakes];
        for(int i = 0; i < numberOfSnakes; i++){
            int snakeInitialPosition = scn.nextInt();
            int snakeFinalPosition = scn.nextInt();
            snakes[i] = new Snake(snakeInitialPosition, snakeFinalPosition);
        }
        return snakes;
    }


    public static Ladder[] inputLadder(){
        //Input for number of players
        int numberOfLadder;
        numberOfLadder = scn.nextInt();
        Ladder[] ladders = new Ladder[numberOfLadder];
        for(int i = 0; i < numberOfLadder; i++){
            int ladderInitialPosition = scn.nextInt();
            int ladderFinalPosition = scn.nextInt();
            ladders[i] = new Ladder(ladderInitialPosition, ladderFinalPosition);
        }
        return ladders;
    }

    public static Player[] inputPlayer(){
        //Input for number of players
        int numberOfPlayers;
        numberOfPlayers = scn.nextInt();
        Player[] players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; i++){
            String playerName = scn.next();
            players[i] = new Player(playerName, i);
        }
        return players;
    }
}
