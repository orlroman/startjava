package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int bookQuantity;
    private Book[] bookshelf = new Book[10];

    public int getBookQuantity() {
        return bookQuantity;
    }

    public int getFreeShelf() {
        return bookshelf.length - bookQuantity;
    }

    private int maxLengthBookInformation() {
        int maxLengthBookInformation = bookshelf[0].getLengthBookInformation();
        for (int i = 0; i < bookshelf.length - 1 && bookshelf[i + 1] != null; i++) {
            if (maxLengthBookInformation < bookshelf[i + 1].getLengthBookInformation()) {
                maxLengthBookInformation = bookshelf[i + 1].getLengthBookInformation();
            }
        }
        return maxLengthBookInformation;
    }

    public void getBookshelf() {
        int maxLengthBookInformation = maxLengthBookInformation();
        for (Book book : bookshelf) {
            if (book != null) {
                int whitespaceAmount = maxLengthBookInformation - book.getLengthBookInformation();
                System.out.println("|" + book.toString() + " ".repeat(whitespaceAmount) + "|");
                System.out.println("|" + "-".repeat(maxLengthBookInformation) + "|");
            }
        }
    }

    public void add(String author, String title, int yearPublication) {
            Book book = new Book(author, title, yearPublication);
            bookshelf[bookQuantity++] = book;
    }

    public String find(String title) {
        for (int i = 0; i < bookshelf.length && bookshelf[i] != null; i++) {
            if (bookshelf[i].getTitle().equals(title)) {
                return bookshelf[i] + " - на книжной полке";
            }
        }
        return "Книга не найдена!";
    }

    public boolean delete(String title) {
        for (int i = 0; i < bookshelf.length && bookshelf[i] != null; i++) {
            if (bookshelf[i].getTitle().equals(title)) {
                if (i < bookshelf.length - 1) {
                    System.arraycopy(bookshelf, i + 1, bookshelf, i, (bookshelf.length - 1) - i);
                    bookshelf[bookshelf.length - 1] = null;
                } else {
                    bookshelf[i] = null;
                }
                bookQuantity--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, bookshelf.length - 1, null);
        bookQuantity = 0;
    }




}
