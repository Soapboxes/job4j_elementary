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

    public static float rubleToYuan(float value) {
        float rsl = value / 13.3f;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        int dollarBank = 60;
        int euroBank = 70;
        float rsl = 60f / 70f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float rubleToYuan = Converter.rubleToYuan(140);
        System.out.println("140 rubles are " + rubleToYuan + " yuan.");
        float dollarToEuro = Converter.dollarToEuro(1);
        System.out.println("1 dollar " + dollarToEuro + " euro.");
    }

}
