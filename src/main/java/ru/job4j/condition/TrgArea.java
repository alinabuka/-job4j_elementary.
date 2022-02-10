package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
        double result2 = TrgArea.area(4, 6, 8);
        System.out.println("area (4, 6, 8) = " + result2);
        double result3 = TrgArea.area(3, 5, 7);
        System.out.println("area (3, 5, 7) = " + result3);
    }
}
