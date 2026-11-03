package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    Car(String brand, String model, int year, int mileage) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
    }

    String getBrand() {
        return brand;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }
    void setModel(String model) {
        this.model = model;
    }

    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }

    int getMileage() {
        return mileage;
    }
    void setMileage(int mileage) {
        this.mileage = mileage;
    }

    void drive(int km) {
        setMileage(mileage + km);
    }
    void displayInfo() {
        System.out.printf("%30s %30s %8s %10s%n", "Бренд", "Модель", "Год", "Пробег");
        System.out.printf("%30s %30s %8s %10s%n", getBrand(), getModel(), getYear(), getMileage());
    }
}
