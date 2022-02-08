package ru.job4j.calculator;

public class Fit {

    public static double menWeight(short height) {

        double rsl = (height * 1.15 - 100 * 1.15);
        return rsl;
    }

    public static double womanWeight(short height) {

        double rsl = (height * 1.15 - 110 * 1.15);
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.menWeight(height);
        System.out.println("Man is 187 " + man);
        height = 160;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman is 160 " + woman);
    }
}
