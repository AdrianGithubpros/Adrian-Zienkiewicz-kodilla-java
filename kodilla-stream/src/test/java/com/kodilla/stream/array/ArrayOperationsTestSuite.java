package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        int[] array = new int[20];
        for(int i = 0;i < 20; i++){
            array[i] = i;
        }

        //When

        //Then
        double result = ArrayOperations.getAverage(array);


        assertEquals(9.5, result);
    }
}
