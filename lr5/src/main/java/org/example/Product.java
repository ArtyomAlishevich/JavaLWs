package org.example;

public class Product {
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString() {
        return name + " " + price + " " + quantity;
    }
}
