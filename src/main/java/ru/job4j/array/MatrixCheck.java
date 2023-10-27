package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int ind = 0; ind < board.length; ind++) {
            if (board[row][ind] != 'X') {

                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int ind = 0; ind < board.length; ind++) {
            if (board[ind][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int ind = 0; ind < board.length; ind++) {
            rsl[ind] = board[ind][ind];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int ind = 0; ind < board.length; ind++) {
            if (board[ind][ind] == 'X' && monoHorizontal(board, ind) || monoVertical(board, ind)) {
                result = true;
                break;
            }
        }
        return result;
    }
}