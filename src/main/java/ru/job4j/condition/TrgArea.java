package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double sumP = (a + b + c) / 2;
        return Math.sqrt(sumP * (sumP - a) * (sumP - b) * (sumP - c));
        /* пример в одну строку
        //return Math.sqrt((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c);
         */
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
