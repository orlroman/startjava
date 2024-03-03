package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearPublication;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public int getLengthBookInformation() {
        int lengthBookInformation = 0;
        String[] bookInformation = {author, title, Integer.toString(yearPublication)};
        for (String str : bookInformation) {
            lengthBookInformation += str.length();
        }
        return lengthBookInformation + 4;
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
