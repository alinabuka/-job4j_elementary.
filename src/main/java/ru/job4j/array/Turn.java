package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int[] newArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            newArray[array.length - 1 - index] = array[index];
        }
        return newArray;
    }
}