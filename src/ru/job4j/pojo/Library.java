package ru.job4j.pojo;

import ru.job4j.array.SwitchArray;

public class Library {
    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book();
        Book third = new Book();
        Book fourth = new Book();
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        second.setName("Dirt code");
        first.setName("Clean code");
        third.setName("Dirt code");
        fourth.setName("Dirt code");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Books name : " + books[i].getName());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Swap book 0 with book 3");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Books name : " + books[i].getName());
        }
        System.out.println("Shown only Clean code books");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Books name : " + books[i].getName());
            }

        }
    }
}
