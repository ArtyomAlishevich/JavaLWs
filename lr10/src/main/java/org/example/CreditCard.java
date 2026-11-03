package org.example;

import java.util.Objects;

public class CreditCard implements PaymentSystem, Secure{
    private String cardNumber;
    private double balance;
    private double limit;
    private boolean authenticated;

    public CreditCard(String cardNumber, double limit) {
        authenticate("password");
        setCardNumber(cardNumber);
        setLimit(limit);
    }

    public String getCardNumber() {
        if (!isAuthenticated()) return null;
        return cardNumber;
    }
    private void setCardNumber(String cardNumber) {
        if (!isAuthenticated()) return;
        this.cardNumber = cardNumber;
    }

    @Override
    public double getBalance() {
        if (!isAuthenticated()) return -1;
        return balance;
    }
    private void setBalance(double amount) {
        if (!isAuthenticated()) return;
        this.balance = amount;
    }

    public double getLimit() {
        if (!isAuthenticated()) return -1;
        return limit;
    }
    private void setLimit(double limit) {
        if (!isAuthenticated()) return;
        this.limit = limit;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
    @Override
    public boolean authenticate(String password) {
        if (Objects.equals(password, "password")) {
            authenticated = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean logout() {
        if (!isAuthenticated()) return false;
        authenticated = false;
        return true;
    }

    @Override
    public boolean pay(double amount) {
        if (!isAuthenticated()) return false;
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean refund(double amount) {
        if (!isAuthenticated()) return false;
        if (getBalance() + amount <= getLimit()) {
            setBalance(getBalance() + amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Карточка: " + getCardNumber();
    }
}
