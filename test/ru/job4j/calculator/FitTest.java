package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeightTest() {
        short in = 155;
        double expected = 63.24;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeightTest() {
        short in = 190;
        double expected = 103.49;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
