package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        if (start < 0 || finish >= array.length || start > finish) {
            throw new IllegalArgumentException("Invalid range");
        }
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
       }
        return min;
    }
}