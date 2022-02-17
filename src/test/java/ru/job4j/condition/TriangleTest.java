package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

    @Test
    public void exist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 1;
        double ac = 2;
        double bc = 0.1;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}