package org.example;

import java.util.Objects;

public class PayPal implements PaymentSystem, Secure{
    private String email;
    private double balance;
    private boolean authenticated;

    public PayPal(String email) {
        authenticate("password");
        setEmail(email);
        setBalance(0);
    }

    public String getEmail() {
        if (!isAuthenticated()) return null;
        return email;
    }
    private void setEmail(String email) {
        if (!isAuthenticated()) return;
        this.email = email;
    }

    @Override
    public double getBalance() {
        if (!isAuthenticated()) return -1;
        return balance;
    }
    private void setBalance(double value) {
        if (!isAuthenticated()) return;
        this.balance = value;
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
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String toString() {
        return "PayPal: " + getEmail();
    }
}
