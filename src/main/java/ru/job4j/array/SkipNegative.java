package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int rsl = array[row][cell];
                if (rsl < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}