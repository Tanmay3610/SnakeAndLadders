package com.company;





class GameMetaData{
    static boolean isGameOn;
    static int currentPlayer;
    static int numberOfPlayers;
    public GameMetaData(int numberOfPlayers){
        isGameOn = true;
        currentPlayer = 0;
        this.numberOfPlayers = numberOfPlayers;
    }
}

public class GameBoard {
    public static GameMetaData startGame(int numberOfPlayers){
        GameMetaData newGame = new GameMetaData(numberOfPlayers);
        return newGame;
    }

    public static int rollDice(){
        int number = (int) Math.round(Math.random() * 5) + 1;
        return number;
    }

    public static void passTurn(){
        GameMetaData.currentPlayer = (GameMetaData.currentPlayer + 1)%GameMetaData.numberOfPlayers;
    }

}
