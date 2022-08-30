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
        float value = 140;
        float expectedEuro = value / 70;
        float expectedDollar = value / 60;
        float euro = Converter.rubleToEuro(value);
        float dollar = Converter.rubleToDollar(value);
        boolean passedEuro = euro == expectedEuro;
        boolean passedDollar = dollar == expectedDollar;
        System.out.println("140 rubles are " + euro + " euro. " + "Test result: " + passedEuro + ".");
        System.out.println("140 rubles are " + dollar + " dollar. " + "Test result: " + passedDollar + ".");
    }
}
