package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        if (money < price) {
            throw new IllegalArgumentException("Money must be greater than or equal to price");
        }
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int remaining = money - price;
        if (money == price) {
            return new int[0];
        }
        for (int coin : coins) {
            while (remaining >= coin) {
                remaining -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}