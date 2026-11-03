package org.example;

public interface Secure {
    public static int kol = 0;
    public final String name = "Secured";
    boolean authenticate(String password);
    boolean logout();
    static void meth() {
        System.out.println(kol);
    }
    default void math() {
        System.out.println(name);
    }
}
