package ru.job4j.converter;

public class Converter {

    private static final float EURO_RATE = 70f;

    private static final float DOLLAR_RATE = 60f;

    private static final float YUAN_RATE = 13.3f;

    public static float convertCurrency(float amount, float rate) {
        return amount / rate;
    }

    public static void main(String[] args) {
        float euro = Converter.convertCurrency(140, EURO_RATE);
        //float euro = Converter.rubleToEuro(140);
        System.out.println(String.format("140 rubles are %.2f euro.", euro));
        float dollar = Converter.convertCurrency(140, DOLLAR_RATE);
        System.out.println(String.format("140 rubles are %.2f dollar.", dollar));
        float rubleToYuan = Converter.convertCurrency(140, YUAN_RATE);
        System.out.println(String.format("140 rubles are %.3f yuan.", rubleToYuan));
        float in = 140;
        float expected = 2;
        float out = Converter.convertCurrency(in, EURO_RATE);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float expectedDol = 2.3333333f;
        float outDol = Converter.convertCurrency(in, DOLLAR_RATE);
        boolean passedDol = expectedDol == outDol;
        System.out.println("140 rubles are 2,3333333. Test result : " + passedDol);
        float expectedYuan = 10.526316f;
        float outYuan = Converter.convertCurrency(in, YUAN_RATE);
        boolean passedYuan = expectedYuan == outYuan;
        System.out.println("140 rubles are 10,526316. Test result : " + passedYuan);
    }
}
