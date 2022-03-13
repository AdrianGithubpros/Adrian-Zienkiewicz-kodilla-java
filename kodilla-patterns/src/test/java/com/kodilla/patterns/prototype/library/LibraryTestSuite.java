package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //given
        Book book1 = new Book("name1","author1",LocalDate.parse("2019-05-05"));
        Book book2 = new Book("name2","author2",LocalDate.parse("2018-04-02"));
        Book book3 = new Book("name3","author3",LocalDate.parse("2017-03-01"));
        Set<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        Library libraryMain = new Library("Library1",set);

        //making a shallow copy
        Library clonedLibraryShallow = null;
        try {
            clonedLibraryShallow  = libraryMain.shallowCopy();
            clonedLibraryShallow .setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library clonedLibraryDeep = null;
        try {
            clonedLibraryDeep  = libraryMain.deepCopy();
            clonedLibraryDeep .setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }



        //When
        System.out.println(libraryMain);
        System.out.println(clonedLibraryShallow);
        System.out.println(clonedLibraryDeep);
        libraryMain.getBooks().remove(book2);

        //Then
        assertEquals(2, libraryMain.getBooks().size());
        assertEquals(2, clonedLibraryShallow.getBooks().size());
        assertEquals(3, clonedLibraryDeep.getBooks().size());

    }
}
