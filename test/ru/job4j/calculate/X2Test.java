package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int resl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, resl);
    }

    @Test
    public void whenAllIsOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int resl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, resl);
    }

    @Test
    public void whenAZero() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int resl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, resl);
    }

    @Test
    public void whenCZero() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int resl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, resl);
    }

    @Test
    public void whenXZero() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int resl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, resl);
    }
}
