package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double heightM) {
        double rsl = (heightM - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double heightW) {
        double rsl = (heightW - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightM = 180;
        short heightW = 170;
        double man = Fit.manWeight(heightM);
        double woman = Fit.womanWeight(heightW);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
