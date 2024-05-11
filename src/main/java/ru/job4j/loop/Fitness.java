package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        if (ivan <= 0 || nik <= 0) {
            throw new IllegalArgumentException("Значения должны быть больше 0");
        }
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}