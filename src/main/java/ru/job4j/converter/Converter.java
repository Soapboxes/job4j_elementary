package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float rubleToYuan(float value) {
        return value / 13.3f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float rubleToYuan = Converter.rubleToYuan(140);
        System.out.println("140 rubles are " + rubleToYuan + " yuan.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float expectedDol = 2.3333333f;
        float outDol = Converter.rubleToDollar(in);
        boolean passedDol = expectedDol == outDol;
        System.out.println("140 rubles are 2,3333333. Test result : " + passedDol);
        float expectedYuan = 10.526316f;
        float outYuan = Converter.rubleToYuan(in);
        boolean passedYuan = expectedYuan == outYuan;
        System.out.println("140 rubles are 10,526316. Test result : " + passedYuan);

    }
}
