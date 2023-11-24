package ru.job4j.condition;

import java.text.DecimalFormat;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("##.###");
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2, 0) " + result);
        double resultTwo = Point.distance(1, 2, 2, 1);
        System.out.println("result (1, 2) to (2, 1) " + dF.format(resultTwo));
        double resultThree = Point.distance(1, 0, 2, 2);
        System.out.println("result (1, 0) to (2, 2) " + dF.format(resultThree));
        double resultFour = Point.distance(10, 0, 2, 0);
        System.out.println("result (10, 0) to (2, 2) " + dF.format(resultFour));
    }
}
