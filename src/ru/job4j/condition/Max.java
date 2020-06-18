package ru.job4j.condition;

public class Max {
    public static int max(int x, int y) {
        return x >= y ? x : y;
    }

    public static int max(int x, int y, int a) {
        return max(x, max(y, a));
    }

    public static int max(int x, int y, int a, int b) {
        return max(x, max(y, a, b));
    }
}
