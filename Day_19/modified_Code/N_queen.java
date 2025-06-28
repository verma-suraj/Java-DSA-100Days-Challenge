public class N_queen {
    static int count = 1;

    public static void sol(int row, boolean[] cols, boolean[][] board, boolean[] diag, boolean[] backdiag, String ans) {
        if (row == board.length) {
            System.out.println("Arrangement " + count);
            count++;

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

        for (int col = 0; col < board.length; col++) {
            if (!cols[col] && !diag[row + col] && !backdiag[row - col + board.length - 1]) {
                board[row][col] = true;
                cols[col] = true;
                diag[row + col] = true;
                backdiag[row - col + board.length - 1] = true;

                sol(row + 1, cols, board, diag, backdiag, ans + row + "-" + col + ",");

                board[row][col] = false;
                cols[col] = false;
                diag[row + col] = false;
                backdiag[row - col + board.length - 1] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // ✅ Hard-coded for PythonTutor
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[(2 * n) - 1];
        boolean[] backdiag = new boolean[(2 * n) - 1];

        sol(0, cols, board, diag, backdiag, "");
    }
}
