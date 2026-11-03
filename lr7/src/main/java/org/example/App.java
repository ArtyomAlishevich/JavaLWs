package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = -1;
        while (true) {
            switch (p) {
                case -1: {
                    System.out.println("-1 - Вывод меню\n" +
                            "0 - Выйти из программы\n" +
                            "1 - Задание 1. \n1. Создать класс с указанными полями (часть из них – статические).\n" +
                            "2. Реализовать конструктор.\n" +
                            "3. Реализовать статический метод для получения общей статистики.\n" +
                            "4. В методе «main» создать несколько объектов и продемонстрировать\n" +
                            "работу.\n" +
                            "1. Библиотека\n" +
                            "Создайте класс “Book”:\n" +
                            "Нестатические: “title”, “author”, “pages”\n" +
                            "Статические: “totalBooks” (счетчик), “totalPages” (сумма всех страниц)\n" +
                            "Конструктор увеличивает оба счетчика\n" +
                            "Статический метод “getAveragePages()” возвращает среднее количество страниц\n" +
                            "В “main” создайте 4 книги и выведите среднее\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Book library[] = new Book[] {
                            new Book("451 градус по Фаренгейту", "Рэй Брэдбери", 220),
                            new Book("Мастер и Маргарита", "Михаил Булгаков", 480),
                            new Book("1984", "Джордж Оруэлл", 320),
                            new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 399),
                };
                    System.out.println("Среднее количество страниц: " + Book.getAveragePages());
                    break;
                }
                default: {
                    System.out.println("Неизвестный пункт меню. Повторите попытку.");
                    break;
                }
            }
            System.out.print("Введите пункт меню: ");
            p = s.nextInt();
        }
    }
}
