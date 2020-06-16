package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortOneToFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortEightToTwelve() {
        int[] input = new int[] {11, 12, 10, 8, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {8, 9, 10, 11, 12};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortTwoToFour() {
        int[] input = new int[] {4, 3, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 4};
        assertThat(result, is(expect));
    }
}