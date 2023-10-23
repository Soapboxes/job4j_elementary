package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int ind = 0; ind < board.length; ind++) {
                if (board[row][ind] == ' ') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int ind = 0; ind < board.length; ind++) {
            if (board[ind][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }
}