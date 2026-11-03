package org.example;

public interface PaymentSystem {
    boolean pay(double amount);
    boolean refund(double amount);
    double getBalance();
}
