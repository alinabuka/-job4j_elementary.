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
        float in = 637;
        float expected = 9.1f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("637 rubles are 9.1 Test result : " + passed);
        float in2 = 243;
        float expected2 = 4.05f;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("243 rubles are 4.05 Test result : " + passed2);
    }
}
