package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();                                // [6]
        Executor codeToExecute = () -> {
            System.out.println("This is an example text.");
            int a = 4;
            int b = 2;
            int c = a+b;
            System.out.println(c); // sprawdzam dla zabawy

        };
        processor.execute(() -> {
            System.out.println("second option");
            int a = 9;
            int b = 7;
            int c = a+b;
            System.out.println(c); // sprawdzam dla zabawy

        });
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("first",(text)-> text.toUpperCase());
        poemBeautifier.beautify("SeCoNd",(text)-> text.toLowerCase());
        poemBeautifier.beautify("third",(text)-> "ABC" + text + "ABC");
        poemBeautifier.beautify("fourth",(text)-> text.replace('u','U'));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
