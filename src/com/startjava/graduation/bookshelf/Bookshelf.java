package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final Book[] books = new Book[10];
    private int countBooks;
    private int lengthShelves;


    public int getCountBooks() {
        return countBooks;
    }

    public int getFreeShelves() {
        return books.length - countBooks;
    }

    public int getLengthShelves() {
        return lengthShelves;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }
    private void updateLengthShelves(int length) {
        if (countBooks > 0) {
            if (lengthShelves == length) {
                lengthShelves = books[0].getLength();
                for (int i = 1; i < countBooks; i++) {
                    lengthShelves = Math.max(lengthShelves, books[i].getLength());
                }
            }
        } else {
            lengthShelves = 0;
        }
    }

    public boolean add(Book book) {
        if (countBooks < books.length) {
            books[countBooks++] = book;
            lengthShelves = Math.max(lengthShelves, book.getLength());
            return true;
        }
        return false;
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].getLength();
                if (countBooks > 1 && i < countBooks - 1) {
                    System.arraycopy(books, i + 1, books, i, (countBooks - 1) - i);
                }
                countBooks--;
                books[countBooks] = null;
                updateLengthShelves(length);
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }




}
