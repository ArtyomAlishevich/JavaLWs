package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" radius: " + getRadius());
    }
}
