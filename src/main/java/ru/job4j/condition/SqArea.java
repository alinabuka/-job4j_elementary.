package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double height = p / (2 * k + 2 * 1);
        double lenght = k * height;
        double s = height * lenght;
        return s;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(9, 3);
        System.out.println(" p = 9, k = 3, s = 3, real = " + result2);
    }

}
