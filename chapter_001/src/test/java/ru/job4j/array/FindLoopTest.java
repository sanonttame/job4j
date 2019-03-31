package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *Тест класса FindLoop.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class FindLoopTest {
    @Test
    public void WhenArrayHas5Than(){
        FindLoop find = new FindLoop();
        int[] arr = new int[]{3, 5, 10};
        int elm = 5;
        int rsl = find.indexOf(arr, elm);
        int expect = 1;
        assertThat(expect, is(rsl));

    }
}
