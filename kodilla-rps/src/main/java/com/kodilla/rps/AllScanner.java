package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllScanner {

    public int pointsAnswer() throws InputMismatchException{
        Scanner s = new Scanner(System.in);
        int answer;
        answer =  s.nextInt();
        if(0 < answer && answer < Integer.MAX_VALUE){
            return answer;
        }else{
            throw new InputMismatchException("Your answer isn't a number");
        }
    }



    public int botAnswer() throws InputMismatchException {

        Scanner s = new Scanner(System.in);
        int answer;
        answer =  s.nextInt();
        if(answer == 1 || answer == 2 || answer == 3){
            return answer;
        }else{
            throw new InputMismatchException("Your answer isn't a number from 1-3");
        }

    }
    public String gameAnswer() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int answer = 0;
                if(ans.equals("1"))answer = 1;
                if(ans.equals("2"))answer = 2;
                if(ans.equals("3"))answer = 3;


        if(answer == 1 || answer == 2 || answer == 3 || ans.equals("x")||ans.equals("n")){
            if(answer == 1)return "stone";
            if(answer == 2)return "scissors";
            if(answer == 3)return "paper";
            if(ans.equals("x"))return "exit";
            if(ans.equals("n"))return "refresh";
        }else{
            throw new InputMismatchException("Your answer isn't a number from 1-3 or n or x");
        }
        return "";
    }
}
