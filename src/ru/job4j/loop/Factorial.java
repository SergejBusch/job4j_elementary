package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = result; i < n + 1; i++) {
           result = result * i;
        }
        return result;
    }
}