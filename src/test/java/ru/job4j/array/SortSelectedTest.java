package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5Elments() {
        int[] data = new int[] {7, 5, 4, 8, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[] {5, 6, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }
}