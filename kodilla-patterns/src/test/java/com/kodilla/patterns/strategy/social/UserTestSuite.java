package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User user1 = new ZGeneration("Adrian");
        User user2 = new YGeneration("Sylwia");
        User user3 = new Millenials("Piotr");
        //When
        String user1Social = user1.sharePost();
        String user2Social = user2.sharePost();
        String user3Social = user3.sharePost();
        //Then
        assertEquals("Twitter", user1Social);
        assertEquals("Snapchat", user2Social);
        assertEquals("Facebook", user3Social);
    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User user = new Millenials("Tom Hanks");

        //When
        System.out.println(user.sharePost());
        user.setSocialPublisher(new SnapchatPublisher());
        String shared = user.sharePost();

        //Then
        assertEquals("Snapchat", shared);

    }
}
