package org.example;

public class Plane extends Vehicle {
    private double altitude;

    public Plane(String brand, int year, double speed, double altitude) {
        super(brand, year, speed);
        setAltitude(altitude);
    }

    public double getAltitude() {
        return altitude;
    }
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void move() {
        System.out.println("Летит в небе");
    }
    public void takeOff() {
        System.out.println("Самолёт взлетел");
    }
}
