package ru.job4j.calculator;

public class Fit {

    private static final double BASE_MALE_HEIGHT = 100;
    private static final double BASE_FEMALE_HEIGHT = 110;
    private static final double WEIGHT_FACTOR = 1.15;

    public static double calculateIdealWeight(double height, double baseHeight) {
        return (height - baseHeight) * WEIGHT_FACTOR;
    }

    public static double calcManWeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return calculateIdealWeight(height, BASE_MALE_HEIGHT);
    }

    public static double calcWomanWeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return calculateIdealWeight(height, BASE_FEMALE_HEIGHT);
    }

    public static void main(String[] args) {
        int heightMan = 184;
        int heightWoman = 170;
        double idealWeightMan = Fit.calcManWeight(heightMan);
        double idealWeightWoman = Fit.calcWomanWeight(heightWoman);
        System.out.printf(String.format("Man %d is %.2f%n", heightMan, idealWeightMan));
        System.out.printf(String.format("Woman %d is %.2f%n", heightWoman, idealWeightWoman));
    }
}
