package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        /*
        return (p / (2 * (k + 1))) * k * (p / (2 * (k + 1)));
        */
        double heightH = p / (2 * (k + 1));
        double lengthL = heightH * k;
        double rls = lengthL * heightH;
        return rls;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = SqArea.square(8, 1);
        System.out.println(" p = 8, k = 1, s = 4, real = " + result3);
    }
}
