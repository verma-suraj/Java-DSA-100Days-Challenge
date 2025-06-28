public class Sudoku {

    public static void solveSudoku(int[][] board, int row, int col) {
        if (row == board.length) {
            display(board);
            return;
        }

        int nrow;
        int ncol;

        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != 0) {
            solveSudoku(board, nrow, ncol);
        } else {
            for (int po = 1; po <= 9; po++) {
                if (isValid(board, row, col, po)) {
                    board[row][col] = po;
                    solveSudoku(board, nrow, ncol);
                    board[row][col] = 0; // backtrack
                }
            }
        }
    }

    public static boolean isValid(int[][] board, int row, int col, int po) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == po) {
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == po) {
                return false;
            }
        }

        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[srow + i][scol + j] == po) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display(int[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveSudoku(board, 0, 0);
    }
}
