package ru.job4j.calculator;

public class Fit {

    private static final double BASE_MALE_HEIGHT = 100;
    private static final double BASE_FEMALE_HEIGHT = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    public static double calculateIdealWeight(double height, double baseHeight) {
        return (height - baseHeight) * WEIGHT_FACTOR;
    }

    public static double calcManWeight(double height) {
        return calculateIdealWeight(height, BASE_MALE_HEIGHT);
    }

    public static double calcWomanWeight(double height) {
        return calculateIdealWeight(height, BASE_FEMALE_HEIGHT);
    }

    public static void main(String[] args) {
        int heightMan = 184;
        int heightWoman = 170;
        double man = Fit.calcManWeight(heightMan);
        double woman = Fit.calcWomanWeight(heightWoman);
        System.out.println(String.format("Man %d is %.2f", heightMan, +man));
        System.out.println(String.format("Woman %d is %.2f", heightWoman, +woman));
    }
}
