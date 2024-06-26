package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n < 0) {
            throw new IllegalArgumentException("not 0");
        }
        for (int index = 2; index <= n; index++) {
            result = result * index;
        }
        return result;
    }
}