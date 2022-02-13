package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distanse(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when42to85then5() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 8;
        int y2 = 5;
        double expected = 5;
        double out = Point.distanse(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when74to4532Then47dot20() {
        int x1 = 7;
        int y1 = 4;
        int x2 = 45;
        int y2 = 32;
        double expected = 47.20;
        double out = Point.distanse(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus13toMinus4Minus2Then5dot83() {
        int x1 = -1;
        int y1 = 3;
        int x2 = -4;
        int y2 = -2;
        double expected = 5.83;
        double out = Point.distanse(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}