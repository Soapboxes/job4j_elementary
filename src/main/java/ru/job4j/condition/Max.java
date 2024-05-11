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
        return Math.max(left, Math.max(right, up));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2));
        System.out.println(Max.max(1, 2, 3, 4));
        System.out.println(Max.max(1, 2, 3));
    }
}
