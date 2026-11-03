package org.example;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        setAccountNumber(accountNumber);
        setOwner(owner);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null) throw new IllegalArgumentException("Неверный номер аккаунта");
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }
    private void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Баланс не может быть отрицательным");
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException{
        if (amount < 0) throw new InvalidAmountException("Неверная сумма. ", amount);
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount < 0) throw new InvalidAmountException("Неверная сумма. ", amount);
        if (getBalance() < amount)
            throw new InsufficientFundsException("Недостаточно средств. ", amount, getBalance());
        setBalance(getBalance() - amount);
    }
    public void transfer(String target, double amount) throws InvalidAmountException, AccountNotFoundException {
        if (amount < 0) throw new InvalidAmountException("Неверная сумма. ", amount);
        if (!Objects.equals(target, getAccountNumber()))
            throw new AccountNotFoundException("Счет не найден", target, getAccountNumber());
        setBalance(getBalance() + amount);
    }
}
