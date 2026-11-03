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
                            "1 - Задание 1. Класс “Автомобиль” (Car): Поля: “brand”, “model”, “year”, “mileage” " +
                            "int). Конструктор. Геттеры и сеттеры. Метод “drive(int km)” (увеличивает " +
                            "пробег). Метод “displayInfo()”. В “main” создать машину, “проехать” 100 км и " +
                            "вывести обновленный пробег.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Car car = new Car("Nissan", "Juke", 2011, 513);
                    car.displayInfo();
                    car.drive(100);
                    car.displayInfo();
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

