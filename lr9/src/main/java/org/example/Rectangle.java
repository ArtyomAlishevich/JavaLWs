package org.example;

public class Rectangle extends Shape {
    private double width;
    private double height;

     public Rectangle(String color, int x, int y, double width, double height) {
         super(color, x, y);
         setHeight(height);
         setWidth(width);
     }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" width: " + getWidth() + " height: " + getHeight());
    }
}
