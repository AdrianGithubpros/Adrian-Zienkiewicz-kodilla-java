package com.kodilla.patterns.prototype.library;


import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;


import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book: books) {
            clonedLibrary.getBooks().add(book);
        }

        return clonedLibrary;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}