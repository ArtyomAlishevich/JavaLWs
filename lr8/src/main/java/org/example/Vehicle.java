package org.example;

public class Vehicle {
    private String brand;
    private int year;
    private double speed;

    public Vehicle(String brand, int year, double speed) {
        setBrand(brand);
        setYear(year);
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move() { }
    public void displayInfo() {
        System.out.println("Vehicle: " + getBrand() + " " + getYear() + " " + getSpeed());
    }
}
