package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Narayan Anton 
 * @version 0.1
 * @since 0.1
 */
public class CalculateTest {
 /**
 * Test echo.
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Anton Narayan";
    String expect = "Echo, echo, echo : Anton Narayan"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }

}