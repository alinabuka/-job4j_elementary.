package ru.job4j.condition;

public class Point {

    public static double distanse(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        return six;

    }

    public static void main(String[] args) {
        double result = Point.distanse(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distanse(4, 2, 8, 5);
        System.out.println("result (4, 2) to (8, 5) " + result1);
        double result2 = Point.distanse(7, 4, 45, 32);
        System.out.println("result (7, 4) to (45, 32) " + result2);
        double result3 = Point.distanse(-1, 3, -4, -2);
        System.out.println("result (-1, 3) to (-4, -2) " + result3);
    }
}
