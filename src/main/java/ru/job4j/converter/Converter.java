package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(637);
        float dollar = Converter.rubleToDollar(243);
        System.out.println("637 rubles are " + euro + " euro.");
        System.out.println("243 rubles are " + dollar + " dollar.");
    }
}
