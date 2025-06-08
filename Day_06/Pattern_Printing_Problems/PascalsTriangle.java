/*
📌 Problem:
Print Pascal's Triangle for a given number of rows. Each number is a binomial coefficient C(i, j), 
where `i` is the row number and `j` is the column index in that row.

🧠 Logic:
- For each row `i` (starting from 0):
    1. Print `n - i` spaces to center-align the triangle.
    2. Initialize `val = 1` (which represents C(i, 0))
    3. For each column `j` from 0 to i:
        - Print the current value `val`
        - Update `val` using the binomial coefficient formula:
            C(i, j+1) = C(i, j) * (i - j) / (j + 1)
- This avoids computing factorials and is more efficient.

⚠️ Edge Cases:
- n = 0 → No output
- Large `n` → May cause integer overflow in binomial coefficients (no handling here)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                // Compute next value in row using binomial coefficient
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
