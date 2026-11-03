package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
                            "1 - Задание 1. Сотрудники\n" +
                            "Базовый класс: “Employee”\n" +
                            "- Поля: “name”, “id”, “salary”\n" +
                            "Наследники:\n" +
                            "1. “Manager” – поле: “teamSize”\n" +
                            "2. “Engineer” – поле: “specialization”\n" +
                            "3. “Intern” – поле: “duration”\n" +
                            "Задание: Создайте “Map<String, Employee>“ с именем как ключом, добавьте 3 " +
                            "Manager, 3 Engineer, 2 Intern, выведите все ключи и значения.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    Map<String, Employee> map = Map.of(
                        "Artem", new Manager(1, "Artem", 5000, 10),
                        "Miroslav", new Manager(2, "Miroslav", 5100, 5),
                        "Ivan", new Manager(3, "Ivan", 2653, 8),
                        "Egor", new Engineer(4, "Egor", 3488, "Разработчик"),
                        "Ekaterina", new Engineer(5, "Ekaterina", 4952, "Тестировщик"),
                        "Olga", new Engineer(6, "Olga", 12042, "Программист"),
                        "Aleksandr", new Intern(7, "Aleksandr", 0, 3),
                        "Andrew", new Intern(8, "Andrew", 300, 6)
                    );
                    map.forEach((key, value) -> System.out.println(key + ": " + value));
                    break;
                }
                case 2: {
                    List<Student> li = new ArrayList<Student>(List.of(
                            new Student(1, "Артём", "Т-392", 4,
                                    List.of(10, 10, 10, 8)),
                            new Student(2, "Мирослав", "Т-492", 3,
                                    List.of(9, 9, 9, 9)),
                            new Student(3, "Алексей", "Т-592", 2,
                                    List.of(10, 7, 5, 10)),
                            new Student(4, "Егор", "Т-392", 4,
                                    List.of(10, 10, 10, 5)),
                            new Student(5, "Кирилл", "Т-692", 1,
                                    List.of(3, 3, 3, 1)),
                            new Student(6, "Иван", "Т-492", 3,
                                    List.of(9, 9, 1, 1, 1, 1)),
                            new Student(7, "Лёха", "Т-592", 2,
                                    List.of(2, 2, 1, 3, 2, 1)),
                            new Student(8, "Арсений", "Т-492", 3,
                                    List.of(1, 1, 1, 1, 2, 1)),
                            new Student(9, "Стасян", "Т-392", 4,
                                    List.of(5, 2, 1, 1, 1, 1, 1, 1))
                    ));

                    Student.printStudents(li, 4);
                    Student.printStudents(li, 3);
                    Student.printStudents(li, 2);
                    Student.printStudents(li, 1);

                    Student.deductStudents(li);
//                    Student.transferStudents(li);
//                    Student.sortStudents(li);
                    System.out.println();

                    Student.printStudents(li, 5);
                    Student.printStudents(li, 4);
                    Student.printStudents(li, 3);
                    Student.printStudents(li, 2);
                    Student.printStudents(li, 1);
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
