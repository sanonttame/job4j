package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when10ElementsThen12() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when9ElementsThen12() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                4
        );
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 0, 0},
        };
        assertThat(result, is(expect));
    }
}