package org.example;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand, int year, double speed, int doors) {
        super(brand, year, speed);
        setDoors(doors);
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void move() {
        System.out.println("Едет по дороге");
    }
    public void openTrunk() {
        System.out.println("Машина открыла багажник");
    }
    public void displayInfo() {
        super.displayInfo();
    }
}
