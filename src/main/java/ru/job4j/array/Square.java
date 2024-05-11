package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] results = new int[bound];
        if (bound < 0) {
            throw new IllegalArgumentException("bound должен быть неотрицательным");
        }
        for (int index = 0; index < bound; index++) {
            results[index] = index * index;
        }
        return results;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int arrayRes : array) {
            System.out.println(arrayRes);
        }
    }
}

