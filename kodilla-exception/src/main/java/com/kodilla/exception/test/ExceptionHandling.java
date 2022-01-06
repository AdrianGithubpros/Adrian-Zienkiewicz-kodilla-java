package com.kodilla.exception.test;

public class ExceptionHandling{
    public static void secondChallengeExceptionHandler(double x, double y) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished");
        }
    }

    public static void main(String[] args) {
        secondChallengeExceptionHandler(1.2, 7.5);
    }

}