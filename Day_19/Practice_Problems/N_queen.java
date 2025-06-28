/*
📌 Problem:
Solve the N-Queens problem — place `n` queens on an `n x n` chessboard such that
no two queens attack each other (no same row, column, or diagonal).
Print all possible valid board arrangements.

🧠 Logic:
- Use backtracking to explore valid queen placements row by row.
- Track:
  - `cols[]` to mark occupied columns
  - `diag[]` to mark `row + col` diagonals
  - `backdiag[]` to mark `row - col + n - 1` diagonals
- If a queen can be safely placed at `(row, col)`, place it and recurse to next row.
- If all rows are filled (`row == n`), print the board and backtrack.

📊 Time Complexity:
O(n!) — Each queen has ≤ n options initially, but fewer as recursion deepens due to constraints.

💾 Space Complexity:
O(n^2) — For the board, and O(n) extra for the 3 boolean arrays.

⚠️ Edge Cases:
- n < 1 → no solution
- n = 1 → only one solution
- n = 2 or 3 → no valid arrangement (handled implicitly)

*/

package Day_19.Practice_Problems;
import java.util.*;

public class N_queen {
    static int count = 1;

    public static void sol(int row, boolean[] cols, boolean[][] board, boolean[] diag, boolean[] backdiag, String ans) {
        // ✅ Base case — valid arrangement found
        if (row == board.length) {
            System.out.println("Arrangement " + count);
            count++;

            // 🔽 Print the board with Q and .
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) {
                        System.out.print("Q");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // 🔄 Try placing queen in each column of current row
        for (int col = 0; col < board.length; col++) {
            if (!cols[col] && !diag[row + col] && !backdiag[row - col + board.length - 1]) {
                // ✅ Place the queen
                board[row][col] = true;
                cols[col] = true;
                diag[row + col] = true;
                backdiag[row - col + board.length - 1] = true;

                // 🔽 Recurse for next row
                sol(row + 1, cols, board, diag, backdiag, ans + row + "-" + col + ",");

                // 🔁 Backtrack
                board[row][col] = false;
                cols[col] = false;
                diag[row + col] = false;
                backdiag[row - col + board.length - 1] = false;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[(2 * n) - 1];
        boolean[] backdiag = new boolean[(2 * n) - 1];

        sol(0, cols, board, diag, backdiag, "");
    }
}
