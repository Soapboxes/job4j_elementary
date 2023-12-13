package ru.job4j.condition;

import java.text.DecimalFormat;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public void info3d() {
        System.out.println("Point[" + this.x + ", " + this.y + ", " + this.z + "]");
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        DecimalFormat dF = new DecimalFormat("##.###");
        double distance = a.distance(b);
        Point three3 = new Point(1, 2, 6);
        Point thr3 = new Point(2, 3, 4);
        three3.info3d();
        thr3.info3d();
        double dis = three3.distance3d(thr3);
        System.out.println(dF.format(dis));
        System.out.println(dF.format(distance));
    }
}
