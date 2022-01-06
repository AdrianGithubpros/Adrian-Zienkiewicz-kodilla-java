package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChallengesTestSuite {

    @Test
    public void testReadFileWithName() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then

        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.6,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9,1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,1.7)));
    }
}
