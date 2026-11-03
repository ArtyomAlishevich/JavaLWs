package org.example;

public class Book {
    String title;
    String author;
    int pages;
    static int totalBooks = 0;
    static int totalPages = 0;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        totalBooks++;
        totalPages += pages;
    }

    static double getAveragePages() {
        return (double)totalPages / (double)totalBooks;
    }

    void test1() {
        System.out.println(title + author + pages + Book.totalBooks + Book.totalPages);
    }

    static void test2() {
        System.out.println(Book.totalBooks + Book.totalPages);
    }
    /*
    Book b1 = new Book1("title", "author", 1);
    b1.test1();
    Book.test2();
     */
}
