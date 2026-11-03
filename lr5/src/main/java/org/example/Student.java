package org.example;

public class Student {
    String name;
    int age;
    String group;
    Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
    void displayInfo() {
        System.out.printf("%50s %10s %10s%n", "Имя студента", "Возраст", "Группа");
        System.out.printf("%50s %10s %10s%n", name, age, group);
    }
}
