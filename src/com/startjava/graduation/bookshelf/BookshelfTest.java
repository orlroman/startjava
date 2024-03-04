package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final int EXIT = 5;
    private static final String MESSAGE_TITLE = "Введите название книги: ";
    public static Bookshelf bookshelf = new Bookshelf();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
                printBookshelf();
                printMenu();
        } while (selectMenuItem() != EXIT);
    }

    private static void printBookshelf() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + bookshelf.getCountBooks() +
                    ", свободно полок - " + bookshelf.getFreeShelves());

            Book[] books = bookshelf.getBooks();
            int maxLengthShelves = bookshelf.getLengthShelves();

            for (Book book : books) {
                System.out.println("|" + book.toString() + " ".repeat(maxLengthShelves - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(maxLengthShelves) + "|");
            }

            System.out.println("|" + " ".repeat(maxLengthShelves) + "|\n");
        }
    }
    private static void printMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Выйти
                """);
    }

    private static int selectMenuItem() {
        String item = scanner.nextLine();
        switch (item) {
            case "1" -> addBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> clearShelves();
            case "5" -> {
                return EXIT;
            }
            default -> throw new RuntimeException("Ошибка. Введите номер из списка.");
        }
        pressEnter();
        return 0;
    }

    private static void addBook() {
        String author = input("Введите автора: ");
        String title = input(MESSAGE_TITLE);
        System.out.print("Введите год издания: ");
        try {
            int yearPublication = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(author, title, yearPublication);
            String message = bookshelf.add(book) ? book + " - добавлена на полку" : "Нет места!";
            System.out.println(message);
        } catch (RuntimeException e) {
            System.out.println("Некорректный год издания");
            scanner.nextLine();
            addBook();
        }
    }

    private static void findBook() {
        Book book = bookshelf.find(input(MESSAGE_TITLE));
        System.out.println(book != null ? book : "Книга не найдена!");
    }

    private static void deleteBook() {
        String message =  bookshelf.delete(input(MESSAGE_TITLE)) ? "Книга удалена" : "Книга не найдена!";
        System.out.println(message);
    }

    private static void clearShelves() {
        bookshelf.clear();
        System.out.println("Шкаф очищен");
    }

    private static String input(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
    private static void pressEnter() {
        String key;
        do {
            key = input("Для продолжения нажмите <Enter>");
        } while (!key.isEmpty());
    }


}
