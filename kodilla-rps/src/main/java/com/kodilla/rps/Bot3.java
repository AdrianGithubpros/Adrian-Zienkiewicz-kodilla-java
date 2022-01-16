package com.kodilla.rps;

public class Bot3 {
    public String play(String playerAnswer){
        int floor = 0;
        int top = 0;
        if(playerAnswer.equals("stone")){
            top = 40;
            floor = 20;
        }
        if(playerAnswer.equals("scissors")){
            top = 80;
            floor = 60;
        }
        if(playerAnswer.equals("paper")){
            top = 80;
            floor = 20;
        }
        String result = "not working";
        int rand = (int)Math.floor(Math.random()*(100-1+1)+1);
        if(rand < floor){
            result = "stone";
        }
        if(floor < rand && rand < top){
            result = "scissors";
        }
        if(rand > top){
            result = "paper";
        }

        return result;
    }
}
