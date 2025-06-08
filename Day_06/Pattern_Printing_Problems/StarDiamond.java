/*
📌 Problem:
Print a **Diamond Star Pattern** made up of asterisks (`*`). 
The pattern consists of an upper pyramid and a lower inverted pyramid.

Example for n = 5:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

🧠 Logic:
- The diamond has two parts:
  1. **Upper Half** (1 to n):
      - Print (n - i) spaces
      - Then print (2 * i - 1) stars
  2. **Lower Half** (n - 1 to 1):
      - Same logic in reverse to complete the diamond

⚠️ Edge Cases:
- n = 1 → Only a single `*` (valid)
- n = 0 or negative → No output (no input validation handled)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows (half height of diamond)
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
