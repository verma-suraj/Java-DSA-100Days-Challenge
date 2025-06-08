/*
📌 Problem:
Print a hollow rhombus pattern based on the number of rows input by the user.
Each row has leading spaces and a hollow rectangle of stars aligned to the right.

🧠 Logic:
- The rhombus is a square of stars, but shifted to the right by printing leading spaces.
- For each row:
    - Print (n - i) spaces to shift the row rightward.
    - Print `*` at the borders (first/last row or first/last column).
    - Print space otherwise (to make the rhombus hollow inside).

⚠️ Edge Cases:
- n = 1 → Single star printed
- n = 0 or negative → No pattern printed (no validation added)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to shift the rhombus
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and hollow space in row
            for (int j = 1; j <= n; j++) {
                // Border: first row, last row, first column, last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
