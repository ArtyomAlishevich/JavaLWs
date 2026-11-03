package org.example;

public class Intern extends Employee {
    public int duration;

    public Intern(int id, String name, double salary, int duration) {
        super(id, name, salary);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Стажёр №" + id + ": " + name + ". Зарпалата: " + salary + ", продолжительность работы: " + duration + " мес.";
    }
}
