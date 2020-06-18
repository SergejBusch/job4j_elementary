package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void areaTestWhenTriangleExist() {
        double result = new Triangle(new Point(5, 6), new Point(1, 1), new Point(9, 9)).area();
        double expected = 3.99;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void areaTestWhenTriangleNotExist() {
        double result = new Triangle(new Point(0, 0), new Point(0, 0), new Point(9, 9)).area();
        assertThat(result, is(-1.0));
    }
}