package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int ind = 2; ind < number; ind++) {
            if (number % ind == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

