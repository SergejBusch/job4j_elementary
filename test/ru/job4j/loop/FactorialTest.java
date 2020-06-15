package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        Assert.assertThat(expected, is(rsl));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        Assert.assertThat(expected, is(rsl));
    }
}