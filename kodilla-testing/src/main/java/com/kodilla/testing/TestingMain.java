package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");



        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator cal = new Calculator();
        int resultAdd;
        int resultSub;

        resultAdd = cal.add(5,5);

        if (resultAdd == (5+5)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        resultSub = cal.sub(99,11);

        if (resultSub == 99-11) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


    }
}