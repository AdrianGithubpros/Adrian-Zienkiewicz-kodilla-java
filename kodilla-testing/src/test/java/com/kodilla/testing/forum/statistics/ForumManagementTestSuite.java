package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumManagementTestSuite {
    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNames(int number) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= number; n++) {
            resultList.add("name " + n);
        }
        return resultList;
    }
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Nested
    @DisplayName("Post tests: ")
    class PostTests {
        @Test
        void calculateAdvStatisticsTestPosts0() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();
            ListOfNames.add("Adrian");
            ListOfNames.add("Ola");
            ListOfNames.add("Krzysiek");
            ListOfNames.add("Jotaro");
            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(4);
            when(statisticsMock.postsCount()).thenReturn(0);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(4, forumManagement.numberOfUsers);
            assertEquals(0, forumManagement.numberOfPosts);
            assertEquals(4, forumManagement.numberOfComments);
            assertEquals(0.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(1.0, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(0.0, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }

        @Test
        void calculateAdvStatisticsTestPosts1000() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();
            ListOfNames.add("Adrian");
            ListOfNames.add("Ola");
            ListOfNames.add("Krzysiek");
            ListOfNames.add("Jotaro");
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(4);

            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(4, forumManagement.numberOfUsers);
            assertEquals(1000, forumManagement.numberOfPosts);
            assertEquals(4, forumManagement.numberOfComments);
            assertEquals(250.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(1, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(0.004, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }
    }

    @Nested
    @DisplayName("Comments tests: ")
    class CommentsTests {
        @Test
        void calculateAdvStatisticsTestComments0() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();
            ListOfNames.add("Adrian");
            ListOfNames.add("Ola");
            ListOfNames.add("Krzysiek");
            ListOfNames.add("Jotaro");
            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.postsCount()).thenReturn(4);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(4, forumManagement.numberOfUsers);
            assertEquals(4, forumManagement.numberOfPosts);
            assertEquals(0, forumManagement.numberOfComments);
            assertEquals(1.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(0.0, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(0.0, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }

        @Test
        void calculateAdvStatisticsTestPostsMoreThanComments() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();
            ListOfNames.add("Adrian");
            ListOfNames.add("Ola");
            ListOfNames.add("Krzysiek");
            ListOfNames.add("Jotaro");
            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(4);
            when(statisticsMock.postsCount()).thenReturn(20);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(4, forumManagement.numberOfUsers);
            assertEquals(20, forumManagement.numberOfPosts);
            assertEquals(4, forumManagement.numberOfComments);
            assertEquals(5.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(1.0, forumManagement.averageNumberOfCommentsPerUser);
            //assertEquals(0.2, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }

        @Test
        void calculateAdvStatisticsTestPostsLessThanComments() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();
            ListOfNames.add("Adrian");
            ListOfNames.add("Ola");
            ListOfNames.add("Krzysiek");
            ListOfNames.add("Jotaro");
            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(20);
            when(statisticsMock.postsCount()).thenReturn(4);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(4, forumManagement.numberOfUsers);
            assertEquals(4, forumManagement.numberOfPosts);
            assertEquals(20, forumManagement.numberOfComments);
            assertEquals(1.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(5.0, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(5.0, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }
    }
    @Nested
    @DisplayName("Users tests: ")
    class UsersTests {
        @Test
        void calculateAdvStatisticsTestUsers0() {
            // Given
            ForumManagement forumManagement = new ForumManagement();
            List<String> ListOfNames = new ArrayList<>();

            when(statisticsMock.usersNames()).thenReturn(ListOfNames);
            when(statisticsMock.commentsCount()).thenReturn(5);
            when(statisticsMock.postsCount()).thenReturn(5);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(0, forumManagement.numberOfUsers);
            assertEquals(5, forumManagement.numberOfPosts);
            assertEquals(5, forumManagement.numberOfComments);
            assertEquals(0.0, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(0.0, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(1.0, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }

        @Test
        void calculateAdvStatisticsTestUsers100() {
            // Given
            ForumManagement forumManagement = new ForumManagement();

            when(statisticsMock.usersNames()).thenReturn(generateListOfNames(100));
            when(statisticsMock.commentsCount()).thenReturn(50);
            when(statisticsMock.postsCount()).thenReturn(50);
            // When
            forumManagement.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(100, forumManagement.numberOfUsers);
            assertEquals(50, forumManagement.numberOfPosts);
            assertEquals(50, forumManagement.numberOfComments);
            assertEquals(0.5, forumManagement.averageNumberOfPostsPerUser);
            assertEquals(0.5, forumManagement.averageNumberOfCommentsPerUser);
            assertEquals(1.0, forumManagement.averageNumberOfCommentsPerPost);
            forumManagement.showStatistics();
        }
    }


}
