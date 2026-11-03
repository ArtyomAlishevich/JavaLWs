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
                            "1. Абстрактный класс с:\n" +
                            "- 3 полями (приватные)\n" +
                            "- конструктором с параметрами\n" +
                            "- геттерами/сеттерами\n" +
                            "- абстрактными методами (2-3 метода)\n" +
                            "- конкретными методами с реализацией\n" +
                            "- методом “displayInfo()” (может быть конкретным или абстрактным)\n" +
                            "2. Два конкретных класса-наследника, которые:\n" +
                            "- расширяют абстрактный класс\n" +
                            "- реализуют все абстрактные методы\n" +
                            "- добавляют 1-2 уникальных поля\n" +
                            "- имеют собственные конструкторы с “super()”\n" +
                            "- переопределяют метод “displayInfo()”\n" +
                            "3. класс:\n" +
                            "- массив/список абстрактного типа\n" +
                            "- объекты разных конкретных классов\n" +
                            "- полиморфный вызов методов\n" +
                            "- демонстрация, что абстрактный класс нельзя инстанцировать\n" +
                            "1. Геометрические фигуры.\n" +
                            "Абстрактный класс: “Shape”\n" +
                            "Поля: “color” (цвет), “x” (координата X), “y” (координата Y)\n" +
                            "Абстрактные методы: “calculateArea()” (вычислить площадь), “draw()” " +
                            "(нарисовать)\n" +
                            "- Конкретный метод: “displayInfo()” (выводит цвет и координаты)\n" +
                            "Конкретные классы:\n" +
                            "1. “Circle” – добавляет поле “radius” (радиус)\n" +
                            "- “calculateArea()” → π * r2\n" +
                            "- “draw()” → \"Рисую круг\"\n" +
                            "2. “Rectangle” – добавляет поля “width”, “height”\n" +
                            "- “calculateArea()” → width * height\n" +
                            "- “draw()” → \"Рисую прямоугольник\"\n" +
                            "Задание: Создайте 3 круга и 2 прямоугольника, выведите площади.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Shape[] arr = new Shape[] {
                            new Circle("red", 0, 0, 5),
                            new Circle("blue", 10, 15, 3.5),
                            new Circle("green", -5, 8, 7.0),
                            new Rectangle("yellow", 2, 3, 10.0, 4.0),
                            new Rectangle("black", -8, -2,  6.0, 6.0),
//                            new Shape("red", 0, 0),
                    };
                    for (int i = 0; i < arr.length; i++) {
                        arr[i].displayInfo();
                        System.out.println(arr[i].calculateArea());
                        arr[i].draw();
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
