package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Стороны не образуют треугольник.");
        }
        double sumP = (a + b + c) / 2;
        return Math.sqrt(sumP * (sumP - a) * (sumP - b) * (sumP - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + String.format("%.2f", rsl));
    }
}
