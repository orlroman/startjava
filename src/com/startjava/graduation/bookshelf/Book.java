package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int yearPublication;
    private final int lengthBook;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        lengthBook = toString().length();
    }

    public int getLength() {
        return lengthBook;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " +
                title + ", " +
                yearPublication;
    }
}
