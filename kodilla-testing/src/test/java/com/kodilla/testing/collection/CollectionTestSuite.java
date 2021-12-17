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
        List<Integer> checkList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();

        for (int n = 1; n < 11; n++) {
            bigList.add(n);
            }

        checkList.add(2);
        checkList.add(4);
        checkList.add(6);
        checkList.add(8);
        checkList.add(10);

        //When
        List<Integer> evenList = new ArrayList<>();
        evenList = ext.exterminate(bigList);

        System.out.println("Testing if odd number extermination was succesful");
        //Then


        Assertions.assertEquals(checkList,evenList);





    }


}
