package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTest1() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 5;
        int y2 = 5;
        double expected = 4.24;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest2() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 9;
        int y2 = 9;
        double expected = 8.48;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}