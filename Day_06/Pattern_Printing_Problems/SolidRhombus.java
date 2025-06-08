/*
📌 Problem:
Print a **Solid Rhombus** pattern where each row contains a fixed number of stars (`n`), 
but each row is right-aligned by using leading spaces.

Example for n = 5:
    *****
   *****
  *****
 *****
*****

🧠 Logic:
- For each row `i` from 1 to `n`:
    1. Print `n - i` spaces to push the row right
    2. Print `n` stars in the row

⚠️ Edge Cases:
- n = 1 → Only a single star
- n = 0 → No output (no validation included)
*/

package Day_06.Pattern_Printing_Problems;        //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}
