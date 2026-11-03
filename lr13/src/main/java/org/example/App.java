package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = -1;
        while (true) {
            switch (p) {
                case -1: {
                    System.out.println("-1 - Вывод меню\n" +
                            "0 - Выйти из программы\n" +
                            "1 - Задание 1. Банковский счет\n" +
                            "Сущность: “BankAccount”\n" +
                            "- Поля: “accountNumber”, “owner”, “balance”\n" +
                            "- Конструктор с проверкой: номер не null, баланс >= 0\n" +
                            "Исключения:\n" +
                            "- “InsufficientFundsException” – недостаточно средств (с полями " +
                            "requested, balance)\n" +
                            "- “InvalidAmountException” – неверная сумма\n" +
                            "- “AccountNotFoundException” – счет не найден\n" +
                            "Методы:\n" +
                            "- “deposit(double amount)” – пополнение (throws InvalidAmountException)\n" +
                            "- “withdraw(double amount)” – снятие (throws InsufficientFundsException, " +
                            "InvalidAmountException)\n" +
                            "- “transfer(String target, double amount)” – перевод\n" +
                            "Задание: Создайте 3 счета, выполните операции с обработкой всех " +
                            "исключений.");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    BankAccount b1 = new BankAccount("1", "Артём", 0);
                    BankAccount b2 = new BankAccount("2", "Мирослав", 10);
                    BankAccount b3 = new BankAccount("3", "Екатерина", 50);
                    try {
                        BankAccount b4 = new BankAccount(null, null, -100);
                    }
                    catch (IllegalArgumentException e) {
                        System.err.println(e);
                    }
                    try {
                        b1.withdraw(100);
                        b2.deposit(-10);
                        b3.withdraw(-100);
                    }
                    catch (InvalidAmountException e) {
                        System.out.println(e + "Вы ввели (нужно >0):" + e.getAmount());
                    }
                    catch (InsufficientFundsException e) {
                        System.out.println(e +
                                "\nВаш баланс: " + e.getBalance() +
                                "\nТребуемая сумма: "+ e.getRequested());
                    }
                    try {
                        b2.transfer("2", 90);
                        b3.transfer("1", 50);
                    }
                    catch (AccountNotFoundException e) {
                        System.out.println(e +
                                "\nВаш номер аккаунта: " + e.getReceived() +
                                "\nНомер аккаунтаа получателя: " + e.getRequired());
                    }
                    break;
                }
                default: {
                    System.out.println("Неизвестный пункт меню. Повторите попытку.");
                    break;
                }
            }
            System.out.print("Введите пункт меню: ");
            p = s.nextInt();
        }
    }
}
