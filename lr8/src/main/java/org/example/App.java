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
                            "1 - Задание 1. Структура:\n" +
                            "1. Базовый класс с:\n" +
                            "- 3 приватными полями\n" +
                            "- конструктором с параметрами\n" +
                            "- геттерами/сеттерами\n" +
                            "2. Два производных класса:\n" +
                            "- наследуют базовый\n" +
                            "- добавляют 1-2 уникальных поля\n" +
                            "- вызывают “super()” в конструкторе\n" +
                            "3. Тестовый класс:\n" +
                            "- массив базового типа на 5 элементов\n" +
                            "- объекты распределены: 3 первого типа, 2 второго\n" +
                            "- демонстрация уникальных методов\n" +
                            "\n" +
                            "1. Транспортные средства\n" +
                            "Базовый класс: “Vehicle”\n" +
                            "Поля: “brand” (марка), “year” (год выпуска), “speed” (максимальная скорость)\n" +
                            "Методы: “move()” (способ передвижения), “displayInfo()”\n" +
                            "Производные классы:\n" +
                            "“Car” – добавляет поле “doors” (количество дверей)\n" +
                            "- “move()” → \"Едет по дороге\"\n" +
                            "“Plane” – добавляет поле “altitude” (высота полета)\n" +
                            "- “move()” → \"Летит в небе\"\n" +
                            "Уникальные методы: “openTrunk()” для Car, “takeOff()” для Plane\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Vehicle[] arr = new Vehicle[] {
                            new Car("Toyota Camry", 2020, 210, 4),
                            new Car("BMW X5", 2022, 250, 5),
                            new Car("Kia Rio", 2019, 190, 4),
                            new Plane("Boeing 737", 2018, 850, 11000),
                            new Plane("Airbus A320", 2021, 850, 12000),
                    };
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].displayInfo();
                        arr[i].move();
                        if (arr[i] instanceof Car c) {
                            c.openTrunk();
                        }
                        else if (arr[i] instanceof Plane pl) {
                            pl.takeOff();
                        }
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
