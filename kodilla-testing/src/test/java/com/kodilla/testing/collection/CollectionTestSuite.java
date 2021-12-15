package com.kodilla.testing.collection;


import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@DisplayName("Collections Tests")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("When list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> bigList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        List<Integer> nextList = new ArrayList<>();
        nextList = ext.exterminate(bigList);
        boolean result = nextList.isEmpty();
        System.out.println("Testing if list is empty");
        //Then
        Assertions.assertTrue(result);
    }

    @DisplayName("When list is not empty")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> bigList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        Random theGenerator = new Random();
        for (int n = 0; n < 50; n++) {
            int rand = theGenerator.nextInt(200);
            bigList.add(rand);
        }
        //When
        List<Integer> nextList = new ArrayList<>();
        nextList = ext.exterminate(bigList);
        int result = 0;
        for (Integer x: nextList) {
            if(x%2 != 0){
                result++;
            }
        }
        System.out.println("Testing if odd number extermination was succesful");
        //Then
        boolean answer = false;
        if(result == 0){

           answer = true;
        }
        Assertions.assertTrue(answer);



    }


}
