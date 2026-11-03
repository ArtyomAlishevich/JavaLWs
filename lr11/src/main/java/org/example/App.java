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
                            "1 - Задание 1. Структура каждого задания:\n" +
                            "1. Базовый класс с:\n" +
                            "- 2-3 полями\n" +
                            "- Конструктором\n" +
                            "- Перегруженными методами (2-3 версии с разными параметрами)\n" +
                            "- Методами, которые будут переопределены в наследниках\n" +
                            "2. 2-3 производных класса с:\n" +
                            "- Дополнительными полями\n" +
                            "- Переопределением методов родителя\n" +
                            "- Собственными перегруженными методами\n" +
                            "3. Тестовый класс с:\n" +
                            "- Демонстрацией перегрузки (вызов разных версий методов)\n" +
                            "- Демонстрацией переопределения (полиморфные вызовы)\n" +
                            "- Сравнением статического и динамического полиморфизма\n" +
                            "1. Калькулятор\n" +
                            "Базовый класс: “Calculator”\n" +
                            "- Поля: “model”, “version”\n" +
                            "- Перегруженные методы:\n" +
                            "- “calculate(int a, int b)” → a + b\n" +
                            "- “calculate(int a, int b, int c)” → a + b + c\n" +
                            "- “calculate(double a, double b)” → a + b\n" +
                            "- “calculate(int a, double b)” → a * b\n" +
                            "- Метод для переопределения: “getDescription()” → \"Обычный калькулятор\"\n" +
                            "Производные классы:\n" +
                            "1. “ScientificCalculator” – переопределяет “getDescription()” → \"Научный " +
                            "калькулятор\", добавляет перегруженный метод “calculate(String operation, " +
                            "double a, double b)”\n" +
                            "2. “EngineeringCalculator” – переопределяет “getDescription()” → " +
                            "\"Инженерный калькулятор\", добавляет перегруженный метод “calculate(int a, " +
                            "int b, String operation)”\n" +
                            "Задание: Создайте объекты всех классов, продемонстрируйте перегрузку и " +
                            "переопределение.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Calculator[] arr = new Calculator[] {
                            new Calculator("C", "1.0"),
                            new EngineeringCalculator("EC", "3.1"),
                            new ScientificCalculator("SC", "2.4"),
                    };
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i].getDescription());
                        System.out.println("1 + 2 = " + arr[i].calculate(1, 2));
                        System.out.println("1 + 2 + 3 = " + arr[i].calculate(1, 2, 3));
                        System.out.println("0.1 + 0.2 = " + arr[i].calculate(0.1, 0.2));
                        System.out.println("52 * 67.67 = " + arr[i].calculate(52, 67.67));
                        if (arr[i] instanceof EngineeringCalculator ec) {
                            System.out.println("7 % 3 = " + ec.calculate(7, 3, "%"));
                        }
                        if (arr[i] instanceof ScientificCalculator sc) {
                            System.out.println("15.15 / 3.15 = " + sc.calculate("/", 15.15, 3.15));
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