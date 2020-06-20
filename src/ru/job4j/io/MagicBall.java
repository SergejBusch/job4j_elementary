package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        switch (new Random().nextInt(3)) {
            case 1 -> System.out.println("yes");
            case 2 -> System.out.println("no");
            default -> System.out.println("maybe");
        }
    }
}
