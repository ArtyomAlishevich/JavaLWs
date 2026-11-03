package org.example;

public class InvalidAmountException extends RuntimeException {
    private double amount;
    public InvalidAmountException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
