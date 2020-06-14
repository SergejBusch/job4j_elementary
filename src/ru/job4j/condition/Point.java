package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 3, 5, 6);
        System.out.println("result (2, 3) to (5, 6) " + result);
        result = Point.distance(1, 1, 7, 8);
        System.out.println("result (1, 1) to (7, 8) " + result);
    }
}