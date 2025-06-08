/*
📌 Problem:
Print a **0-1 Triangle Pattern** where:
- Each row `i` contains `i` numbers.
- If (i + j) is even, print `1`; else print `0`.

Example for n = 5:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

🧠 Logic:
- Outer loop runs for rows from 1 to n.
- Inner loop prints elements from 1 to current row `i`.
- Use condition: (i + j) % 2 == 0 → "1", else "0".

⚠️ Edge Cases:
- n = 0 → No output
- n = 1 → Single row with "1"
*/

package Day_06.Pattern_Printing_Problems;        //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= i; j++) {
                // If sum of row and column is even, print 1 else 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // New line after each row
        }

        sc.close();
    }
}
