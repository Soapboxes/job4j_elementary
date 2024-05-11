package ru.job4j.calculator;

public class Fit {

    public static double calcManWeight(double heightMan) {
        double rsl = (heightMan - 100) * 1.15;
        return rsl;
    }

    public static double calcWomanWeight(double heightWoman) {
        double rsl = (heightWoman - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        int heightMan = 180;
        int heightWoman = 170;
        double man = Fit.calcManWeight(heightMan);
        double woman = Fit.calcWomanWeight(heightWoman);
        System.out.println(String.format("Man %d is %.2f", heightMan, +man));
        System.out.println(String.format("Woman %d is %.2f", heightWoman, +woman));
    }
}
