package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Lena";
        names[1] = "Vlad";
        names[2] = "Misha";
        names[3] = "Masha";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
