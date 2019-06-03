package com.romanstetsiuk.spring_beginner_to_guru.model;

import java.util.HashSet;
import java.util.Set;

public class Author {

    private String firsName;
    private String lastName;

    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public Author(String firsName, String lastName, Set<Book> books) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
