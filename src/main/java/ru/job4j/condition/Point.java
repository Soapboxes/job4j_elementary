package ru.job4j.condition;

import java.text.DecimalFormat;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        DecimalFormat dF = new DecimalFormat("##.###");
        double distance = a.distance(b);
        Point c = new Point(1, 0);
        Point d = new Point(2, 2);
        double distance2 = c.distance(d);
        System.out.println(dF.format(distance));
        System.out.println(dF.format(distance2));
    }
}
