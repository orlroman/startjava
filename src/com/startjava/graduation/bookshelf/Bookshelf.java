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
    private void maxLengthShelves(int length) {
        if (countBooks > 0) {
            lengthShelves = Math.max(lengthShelves, length);
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
            maxLengthShelves(book.getLength());
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
                if (countBooks > 1 && i < countBooks - 1) {
                    System.arraycopy(books, i + 1, books, i, (countBooks - 1) - i);
                }
                countBooks--;
                books[countBooks] = null;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, books.length - 1, null);
        countBooks = 0;
    }




}
