package com.kodilla.exception.test;


public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try { if (b == 0) {
            throw new ArithmeticException("dividing by zero is impossible");
        }

        } catch (ArithmeticException ari) {
            System.out.println("Oh no! Something went wrong! Error:" + ari );
        } finally {
            System.out.println("If your result is infinity you divided something by zero");
        }
        return a / b;
    }
}


