package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int row1 = 0; row1 < board.length; row1++) {
            for (int cell = 0; cell < board[row1].length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row1 = 0; row1 < board.length; row1++) {
            for (int cell = 0; cell < board[row1].length; cell++) {
                if (board[row1][column] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
