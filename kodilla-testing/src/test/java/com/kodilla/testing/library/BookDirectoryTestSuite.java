package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Nested
    @DisplayName("Condition return list tests: ")
    class TestCondition{
        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
            List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
            List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
            List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                    .thenReturn(resultListOf15Books);                                             // [6]
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                    .thenReturn(resultListOf0Books);                                              // [8]
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                    .thenReturn(resultListOf40Books);                                             // [10]

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
            // Then

            assertEquals(0, theListOfBooks0.size());                                         // [14]
            assertEquals(15, theListOfBooks15.size());                                       // [15]
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

            // Then
            assertEquals(0, theListOfBooks10.size());                                     // [5]
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
        }
    }


    @DisplayName("Test of ListBooksInHandsOf: ")
    @Test
    void testListBooksInHandsOf() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser lUser1 = new LibraryUser("Secrets of Alamo", "John Smith", "2008");
        LibraryUser lUser2 = new LibraryUser("Secretaries and Directors", "Dilbert Michigan", "2012");
        LibraryUser lUser3 = new LibraryUser("Secret life of programmers", "Steve Wolkowitz", "2016");


        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(lUser1))
                .thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(lUser2))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(lUser3))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(lUser2);
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(lUser1);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(lUser3);
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }



}