package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Figure moving tests: ")
    class TestFigure {
        @Test
        void testAddFigure() {
            //Given
            List<Shape> tryList = new ArrayList<Shape>();
            Shape circle = new Circle();
            // tryList.add(circle);
            ShapeCollector collector = new ShapeCollector(tryList);

            //When
            collector.addFigure(circle);

            //Then
            Assertions.assertEquals(circle, collector.list.get(0));

        }

        @Test
        void testRemoveFigure() {
            //Given
            List<Shape> tryList = new ArrayList<Shape>();
            List<Shape> compareList = new ArrayList<Shape>();
            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();
            tryList.add(circle);
            tryList.add(triangle);
            tryList.add(square);

            compareList.add(circle);
            compareList.add(square);

            ShapeCollector collector = new ShapeCollector(tryList);
            //When
            collector.removeFigure(triangle);
            //Then
            Assertions.assertEquals(compareList, collector.list);
        }

        @Test
        void testGetFigure() {
            //Given
            List<Shape> tryList = new ArrayList<Shape>();
            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();
            tryList.add(circle);
            tryList.add(triangle);
            tryList.add(square);
            ShapeCollector collector = new ShapeCollector(tryList);
            //When

            Shape check = collector.getFigure(1);

            //Then
            Assertions.assertEquals(tryList.get(1), check);
        }
    }



    @Nested
    @DisplayName("Figure showing tests: ")
    class TestShowFigure {
        @Test
        void testRemovePost() {
            //Given
            List<Shape> tryList = new ArrayList<Shape>();
            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();
            tryList.add(circle);
            tryList.add(triangle);
            tryList.add(square);
            ShapeCollector collector = new ShapeCollector(tryList);
            //When

            String check = collector.showFigures();

            //Then
            Assertions.assertEquals("Circle Triangle Square ", check);
        }

    }


}
