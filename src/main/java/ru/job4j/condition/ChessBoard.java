package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
             if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(way(6, 7, 1, 2));
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(2, 4, 5, 7));
        System.out.println(way(1, 0, 4, 3));
        System.out.println(way(2, 6, 4, 1));
        System.out.println(way(-1, 6, 4, 1));
        System.out.println(way(10, 6, 4, 1));
    }
}
