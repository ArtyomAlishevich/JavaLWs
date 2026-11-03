package org.example;

public class Engineer extends Employee{
    public String specialization;

    public Engineer(int id, String name, double salary, String specialization) {
        super(id, name, salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Инженер №" + id + ": " + name + ". Зарпалата: " + salary + ", специализация: " + specialization;
    }
}
