package com.kodilla.rps;

public class Bot2{

    public String play(){
        String result = "not working";
        int rand = (int)Math.floor(Math.random()*(3-1+1)+1);
        if(rand == 1){
            result = "stone";
        }
        if(rand == 2){
            result = "scissors";
        }
        if(rand == 3){
            result = "paper";
        }

        return result;
    }





}
