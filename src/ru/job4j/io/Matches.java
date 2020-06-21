package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        int playerNumber = 0;
        while (true) {
            System.out.println("Игрок " + (playerNumber++ % 2 + 1) + " ходит");
            System.out.println("возьмите от 1 до 3 спичек");
            int number = input.nextInt();
            if (number == 1) {
                matches -= 1;
                System.out.println("Осталось " + matches + " спичек");
            } else if (number == 2) {
                matches -= 2;
                System.out.println("Осталось " + matches + " спичек");
            } else if (number == 3) {
                matches -= 3;
                System.out.println("Осталось " + matches + " спичек");
            } else {
                playerNumber++;
            }
            if (matches <= 0) {
                System.out.println("Игрок " + (--playerNumber % 2 + 1) + " победил");
                break;
            }
        }
    }
}
