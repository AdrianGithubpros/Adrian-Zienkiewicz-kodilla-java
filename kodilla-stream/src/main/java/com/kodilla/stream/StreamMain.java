package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

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
    }
}
