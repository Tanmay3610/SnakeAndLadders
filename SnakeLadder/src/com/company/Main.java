package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Input for Snakes
        Snake[] snakeArray = GameInit.inputSnake();

        //Input for Ladder
        Ladder[] ladderArray = GameInit.inputLadder();

        //Input for Players
        Player[] playerArray = GameInit.inputPlayer();

        //Start the Game
        GameMetaData game = GameBoard.startGame(playerArray.length);

        while(game.isGameOn == true){
            //Roll the Dice
            int numberOnDice = GameBoard.rollDice();

            //Piece Mover
            int tempInitialPosition = playerArray[GameMetaData.currentPlayer].currentPosition;
            playerArray[GameMetaData.currentPlayer].currentPosition = playerArray[GameMetaData.currentPlayer].currentPosition + numberOnDice;

            //Checking for snake
            for(int i = 0; i < snakeArray.length; i++){
                if(snakeArray[i].initialPosition == playerArray[GameMetaData.currentPlayer].currentPosition){
                    playerArray[GameMetaData.currentPlayer].currentPosition = snakeArray[i].finalPosition;
                    break;
                }
            }

            //Checking for ladder
            for(Ladder current : ladderArray){
                if(current.initialPosition == playerArray[GameMetaData.currentPlayer].currentPosition){
                    playerArray[GameMetaData.currentPlayer].currentPosition = current.finalPosition;
                    break;
                }
            }


            if(playerArray[GameMetaData.currentPlayer].currentPosition > 100){
                playerArray[GameMetaData.currentPlayer].currentPosition = tempInitialPosition;
            }

            StringBuilder print = new StringBuilder("");
            print.append(playerArray[GameMetaData.currentPlayer].name)
                    .append(" rolled a ").append(numberOnDice).append(" and moved from ").append(tempInitialPosition)
                    .append(" to ").append(playerArray[GameMetaData.currentPlayer].currentPosition);
            System.out.println(print.toString());

            //Winner Checker
            if(playerArray[GameMetaData.currentPlayer].currentPosition == 100){
                GameMetaData.isGameOn = false;
                StringBuilder winner =  new StringBuilder("");
                winner.append(playerArray[GameMetaData.currentPlayer].name).append(" is a winner");
                System.out.println(winner.toString());
                break;
            }

            //Pass Turn
            GameBoard.passTurn();
        }
    }
}
