package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRPS {
    Bot1 bot1 = new Bot1();
    Bot2 bot2 = new Bot2();
    Bot3 bot3 = new Bot3();
    int playerPoints;
    int botPoints;
    String playerName;
    int roundsNumber;
    public void checkWhoWin(String playerSign, String botSign){
        if(playerSign.equals("paper") && botSign.equals("stone") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Player win the round");
            playerPoints++;
        }
        if(playerSign.equals("paper") && botSign.equals("scissors") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Bot win the round");
            botPoints++;
        }
        if(playerSign.equals("scissors") && botSign.equals("stone") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Bot win the round");
            botPoints++;
        }
        if(playerSign.equals("scissors") && botSign.equals("paper") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Player win the round");
            playerPoints++;
        }
        if(playerSign.equals("stone") && botSign.equals("scissors") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Player win the round");
            playerPoints++;
        }
        if(playerSign.equals("stone") && botSign.equals("paper") ){
            System.out.println("Player sign: " + playerSign);
            System.out.println("Bot sign :" + botSign);
            System.out.println("Bot win the round");
            botPoints++;
        }

    }
    public void menu(){

        System.out.println("Welcome to rock-paper-scissors GAME");
        System.out.println("Please write your name:");
        Scanner sName = new Scanner(System.in);
        playerName = sName.next();
        System.out.println("Please write how many points do you need to win the game:");
        Scanner sRounds = new Scanner(System.in);
        roundsNumber = sRounds.nextInt();
        System.out.println("Please chose lvl of bot player from 1 to 3");
        System.out.println("1 - easy");
        System.out.println("2 - medium");
        System.out.println("3 - hard");

    }

    public void startGame(){
        boolean end = false;
        boolean beginning = false;
        playerPoints = 0;
        botPoints = 0;
        menu();
        AllScanner movementScanner = new AllScanner();
        int answer1 = 0;
        while(!beginning){
            try
            {
                answer1 = movementScanner.botAnswer();
                beginning = true;
            }
            catch(java.util.InputMismatchException e)
            {
                System.out.println("Your answer isn't a number from 1-3");
            }
        }

        String answer2 = "";
        while(!end){
            System.out.println("Player points: " + playerPoints);
            System.out.println("Bot points: " + botPoints);
            System.out.println("Choose your sign");
            System.out.println("1 - stone");
            System.out.println("2 - scissors");
            System.out.println("3 - paper");
            System.out.println("x - end the game");
            System.out.println("n - end the game and play new game");
            try
            {
                answer2 = movementScanner.gameAnswer();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Your answer isn't a number from 1-3 or x or n");
            }
            if(answer2.equals("stone")||answer2.equals("scissors")||answer2.equals("paper")){
                if(answer1 == 1){
                    checkWhoWin(answer2 , bot1.play(answer2));
                }
                if(answer1 == 2){
                    checkWhoWin(answer2 , bot2.play());
                }
                if(answer1 == 3){
                    checkWhoWin(answer2 , bot3.play(answer2));
                }
            }
            if(answer2.equals("exit")){

                System.out.println("Are you sure to end the game?");
                System.out.println("If you are press x");
                String answer3 = "";
                try
                {
                    answer3 = movementScanner.gameAnswer();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Your answer isn't a number from 1-3 or n or x");
                }
                if(answer3.equals("exit")){
                    end = true;
                }
            }

            if(answer2.equals("refresh")){
                String answer3 = "";
                System.out.println("Are you sure to refresh the game?");
                System.out.println("If you are press n");
                try
                {
                    answer3 = movementScanner.gameAnswer();
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Your answer isn't a number from 1-3 or n or x");
                }
                if(answer3.equals("refresh")){
                    playerPoints = 0;
                    botPoints = 0;
                }
            }
            if(roundsNumber == playerPoints){
                end = true;
                System.out.println(playerName + " wins");
            }
            if(roundsNumber == botPoints){
                end = true;
                System.out.println("Bot wins");
            }

        }


    }


}
