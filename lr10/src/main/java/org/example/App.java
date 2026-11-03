package org.example;

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
                            "1 - Задание 1. Структура каждого задания:\n" +
                            "1. Интерфейсы (2-3 интерфейса) с:\n" +
                            "- 2-3 абстрактными методами\n" +
                            "- 1 статическим методом (опционально)\n" +
                            "2. Классы-реализации (2-3 класса), которые:\n" +
                            "- реализуют все интерфейсы\n" +
                            "- имеют собственные поля\n" +
                            "- реализуют все абстрактные методы\n" +
                            "3. класс:\n" +
                            "- массив/список интерфейсного типа\n" +
                            "- объекты разных классов\n" +
                            "1. Платежные системы\n" +
                            "Интерфейсы:\n" +
                            "1. “PaymentSystem” — методы: “pay(double amount)”, “refund(double amount)”,\n" +
                            "“getBalance()”\n" +
                            "2. “Secure” — методы: “authenticate(String password)”, “logout()”\n" +
                            "Классы:\n" +
                            "1. “PayPal” — поля: “email”, “balance”, “authenticated”\n" +
                            "2. “CreditCard” — поля: “cardNumber”, “balance”, “limit”, “authenticated”\n" +
                            "Задание: Создайте 2 PayPal и 3 CreditCard, выполните оплату и возврат.\n");
                    break;
                }
                case 0: {
                    s.close();
                    return;
                }
                case 1: {
                    PaymentSystem[] arr = new PaymentSystem[] {
                            new PayPal("ArtjomAlishevich@gmail.com"),
                            new PayPal("ArtyomAlishevich@gmail.com"),
                            new CreditCard("1234567890", 1000),
                            new CreditCard("0987654321", 255),
                            new CreditCard("1000000000", 52),
                    };
                    for(int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i].refund(100) ?
                                arr[i] + " Возврат средств прошёл успешно." :
                                arr[i] + " Возврат средств не прошёл.");
                        System.out.println(arr[i].pay(79) ?
                                arr[i] + " Оплата прошла успешно." :
                                arr[i] + " Оплата не прошла. Проверьте баланс.");
                        System.out.println();
                    }
                    break;
                }
                case 2:
                {
                    Secure el = new CreditCard("12", 12);
                    Secure.meth();
                    el.math();
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
