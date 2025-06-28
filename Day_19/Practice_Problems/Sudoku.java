/*
📌 Problem:
Solve a standard 9x9 Sudoku puzzle using backtracking.
Each row, column, and 3x3 subgrid must contain all digits from 1 to 9 exactly once.

🧠 Logic:
- Recursively move through the board cell by cell (row-major).
- If the cell already has a value, move to the next cell.
- If it's empty (value 0), try placing digits 1 through 9:
    - Use `isValid()` to check if the digit placement is legal.
    - If valid, place the digit and recurse to the next cell.
    - Backtrack by resetting the cell if it doesn't lead to a solution.
- Once `row == 9`, it means the entire board is filled correctly → print the board.

📊 Time Complexity:
Worst-case: O(9^(n^2)) → Exponential (due to 9 choices per empty cell),
but pruning through `isValid()` makes it practical for most real Sudoku boards.

💾 Space Complexity:
O(1) — The solution modifies the board in-place.
O(n^2) if you consider recursion stack space (max depth 81).

⚠️ Edge Cases:
- Already solved board → printed directly
- Invalid board → no output (since no valid placement)
- Multiple solutions → this prints **all** of them

*/

package Day_19.Practice_Problems;

import java.util.Scanner;

public class Sudoku {

    public static void solveSudoku(int[][] board, int row, int col) {
        if (row == board.length) {
            display(board);
            return;
        }

        int nrow = 0;
        int ncol = 0;

        // Move to next cell
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        // If already filled, move forward
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

    // Check if placing `po` at (row, col) is valid
    public static boolean isValid(int[][] board, int row, int col, int po) {
        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == po) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == po) {
                return false;
            }
        }

        // Check 3x3 grid
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

    // Display solved board
    public static void display(int[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];

        System.out.println("Enter the Sudoku board (use 0 for empty cells):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        solveSudoku(board, 0, 0);
    }
}
