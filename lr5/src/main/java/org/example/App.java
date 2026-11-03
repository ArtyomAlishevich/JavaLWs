package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = -1;
        while (true) {
            switch (p) {
                case -1: {
                    System.out.println("-1 - Вывод меню\n" +
                            "0 - Выйти из программы\n" +
                            "1 - Задание 1. Класс “Студент” (Student): Поля: “name” (String), “age” (int), “group” " +
                            "(String). Конструктор (все поля). Метод “displayInfo()”. В “main” создать 2 " +
                            "объекта и вывести их данные.\n" +
                            "2 - Задание 2. Класс \"Товар\" (name: String, price: double, quantity: int). В “main” " +
                            "создать массив из 5 товаров. Найти товар с максимальной ценой и общую " +
                            "стоимость всех товаров (price * quantity).\n" +
                            "3 - Задание 3. Enum (Season): Enum “Season” (WINTER, SPRING, SUMMER, " +
                            "AUTUMN). Класс “Месяц” (name, season). В “main” создать список месяцев и " +
                            "вывести летние.\n");
                break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Student s1 = new Student("Алишевич Артём Александрович", 18, "Т-392");
                    s1.displayInfo();
                    Student s2 = new Student("Вайтехович Мирослав Викторович", 18, "Т-392");
                    s2.displayInfo();
                    break;
                }
                case 2: {
                    Product arr[] = new Product[] {
                            new Product("Мороженное", 0.2, 125),
                            new Product("Помидор", 3.69, 54),
                            new Product("Банан", 2.45, 73),
                            new Product("Молоко", 2.99, 37),
                            new Product("Кефир", 2.52, 17),
                    };
                    Product max = arr[0];
                    double sum = arr[0].price * arr[0].quantity;
                    for (int i = 1; i < arr.length; i++)
                    {
                        if (max.price < arr[i].price) max = arr[i];
                        sum += arr[i].price * arr[i].quantity;
                    }
                    System.out.println("Товар с максимальной ценой: " + max);
                    System.out.println("Общая стоимость всех товаров: " + sum);
                    break;
                }
                case 3: {
                    Month arr[] = new Month[] {
                            new Month("Январь", Season.valueOf("WINTER")),
                            new Month("Февраль", Season.valueOf("WINTER")),
                            new Month("Март", Season.valueOf("SPRING")),
                            new Month("Апрель", Season.valueOf("SPRING")),
                            new Month("Май", Season.valueOf("SPRING")),
                            new Month("Июнь", Season.valueOf("SUMMER")),
                            new Month("Июль", Season.valueOf("SUMMER")),
                            new Month("Август", Season.valueOf("SUMMER")),
                            new Month("Сентябрь", Season.valueOf("AUTUMN")),
                            new Month("Октябрь", Season.valueOf("AUTUMN")),
                            new Month("Ноябрь", Season.valueOf("AUTUMN")),
                            new Month("Декабрь", Season.valueOf("WINTER")),
                    };
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].season == Season.valueOf("SUMMER"))
                            System.out.println(arr[i]);
                    }
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
