/*
📌 Problem:
Print a number pyramid pattern based on the number of rows entered by the user.
Each row prints the row number multiple times, aligned in a pyramid shape.

🧠 Logic:
- For each row `i` from 1 to `n`:
    1. Print `n - i` spaces to align the numbers centrally.
    2. Print the row number `i`, exactly `i` times, each followed by a space for separation.
- This forms a left-aligned pyramid made of repeated row numbers.

⚠️ Edge Cases:
- n = 1 → Only one number printed
- n = 0 or negative → No pattern printed (no input validation added)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
