package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class MiltiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(3, 2, 1);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(2, 4, 1);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 5);
        Assert.assertThat(result, is(5));
    }
}
