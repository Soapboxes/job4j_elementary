package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int ind = 2; ind <= number; ind++) {
            if ((number > 2) && (number % number == 0) && (number % 2 == 1)) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}

