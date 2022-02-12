package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int out = X2.calc(10, 0, 0, 2);
        int rsl = X2.calc(10, 0, 0, 2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a2 = 1;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int expected = 3;
        int out = X2.calc(a2, b2, c2, x2);
        int rsl2 = X2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected, rsl2);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a3 = 0;
        int b3 = 1;
        int c3 = 1;
        int x3 = 1;
        int expected = 2;
        int out = X2.calc(a3, b3, c3, x3);
        int rsl3 = X2.calc(a3, b3, c3, x3);
        Assert.assertEquals(expected, rsl3);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a4 = 1;
        int b4 = 1;
        int c4 = 0;
        int x4 = 1;
        int expected = 2;
        int out = X2.calc(a4, b4, c4, x4);
        int rsl4 = X2.calc(a4, b4, c4, x4);
        Assert.assertEquals(expected, rsl4);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a5 = 1;
        int b5 = 1;
        int c5 = 1;
        int x5 = 0;
        int expected = 1;
        int out = X2.calc(a5, b5, c5, x5);
        int rsl5 = X2.calc(a5, b5, c5, x5);
        Assert.assertEquals(expected, rsl5);
    }

}