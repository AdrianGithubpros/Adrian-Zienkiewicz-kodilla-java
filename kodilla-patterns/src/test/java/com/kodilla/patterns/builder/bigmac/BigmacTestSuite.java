package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac big = new Bigmac.BigmacBuilder()
                .bun("Bun with sesame")
                .burgers(2)
                .ingredients("salad")
                .ingredients("chilli pepper")
                .ingredients("cheese")
                .build();
        System.out.println(big);

        //Then
        assertEquals(3, big.getIngredients().size());
    }
}
