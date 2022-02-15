package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To4Then12() {
        int left = 12;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10Then10() {
        int left = 5;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = left;
        Assert.assertEquals(result, expected);
    }
}
