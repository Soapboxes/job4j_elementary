package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, right), max(first, second));
    }

    public static int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public static void main(String[] args) {
        Max max = new Max();
        Max max1 = new Max();
        System.out.println(max.max(1, 2));
        System.out.println(max1.max(1, 2, 3, 4));
        System.out.println(max(1, 2, 3));
    }
}
