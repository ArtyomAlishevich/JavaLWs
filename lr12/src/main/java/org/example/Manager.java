package org.example;

public class Manager extends Employee {
    public int teamSize;

    public Manager(int id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Менеджер №" + id + ": " + name + ". Зарпалата: " + salary + ", размер комнады: " + teamSize;
    }
}
