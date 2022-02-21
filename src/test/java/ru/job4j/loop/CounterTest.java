package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom5To15Then50() {
        int start = 5;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom0To5Then6() {
        int start = 0;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}