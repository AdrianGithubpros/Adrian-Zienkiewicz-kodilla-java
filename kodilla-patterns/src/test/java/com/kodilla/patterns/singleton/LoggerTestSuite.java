package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLogTest(){
        //Given
        Logger logger = Logger.LOGGER;
        //When
        logger.log("log nr 1");
        String testLog = logger.getLastLog();
        //Then
        assertEquals("log nr 1", testLog);

    }
}
