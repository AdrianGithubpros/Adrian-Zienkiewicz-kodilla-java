package com.kodilla.stream.array;

import java.util.stream.IntStream;


public interface ArrayOperations {
    static double getAverage(int[] numbers){


         IntStream.range(0, numbers.length)
                .forEach(System.out::println);

         double result = IntStream.range(0, numbers.length)
                 .average().getAsDouble();

         return result;
    }



}
