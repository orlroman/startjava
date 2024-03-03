package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static Bookshelf bookshelf = new Bookshelf();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isStop = false;

    public static void main(String[] args) {
        do {
            try {
                menu();
                System.out.println("Для продолжения нажмите Enter");
                scanner.nextLine();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (!isStop);

    }

    public static void menu() {
        if (bookshelf.getBookQuantity() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.println("В шкафу книг - " + bookshelf.getBookQuantity() +
                    ", cвободно полок - " + bookshelf.getFreeShelf() + "\n");
            bookshelf.getBookshelf();
        }

        System.out.print("""
                
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Выйти
                
                """);
        System.out.print("Введите номер операции: ");
        String choose = scanner.nextLine();

        event(choose);
    }

    public static void event(String choose) {
        switch (choose) {
            case "1":
                if (bookshelf.getBookQuantity() == 10) {
                    System.out.println("Нет места!");
                } else {
                    System.out.print("Введите автора: ");
                    String addAuthor = scanner.nextLine();

                    System.out.print("Введите название книги: ");
                    String addTitle = scanner.nextLine();

                    System.out.print("Введите год публикации: ");
                    String yearToString = scanner.nextLine();
                    try {
                        int addYearPublication = Integer.parseInt(yearToString);
                        bookshelf.add(addAuthor, addTitle, addYearPublication);
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Некорректный ввод даты публикации!\n");
                    }
                }
                break;

            case "2":
                System.out.print("Введите название книги, чтобы найти: ");
                String findTitle = scanner.nextLine();
                System.out.println(bookshelf.find(findTitle));
                break;

            case "3":
                System.out.print("Введите название книги, чтобы удалить: ");
                String deleteTitle = scanner.nextLine();
                if (!bookshelf.delete(deleteTitle)) {
                    System.out.println("Такой книги нет!");
                }
                break;

            case "4":
                bookshelf.clear();
                break;

            case "5":
                isStop = true;
                break;

            default:
                throw new RuntimeException("Такой операции нет\n");
        }
    }
}
