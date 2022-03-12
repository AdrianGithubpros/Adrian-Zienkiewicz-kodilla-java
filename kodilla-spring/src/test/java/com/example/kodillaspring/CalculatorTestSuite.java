package com.example.kodillaspring;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        calculator.add(3,4);
        calculator.sub(3,4);
        calculator.mul(3,4);
        calculator.div(3,4);
        //Then
        //do nothing
    }

}

