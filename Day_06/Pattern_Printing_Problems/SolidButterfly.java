/*
📌 Problem:
Print a **Solid Butterfly** pattern for a given number of rows. 
It has two symmetrical triangular wings (left and right) separated by spaces.

Example for n = 5:
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
🧠 Logic:
- The butterfly has two halves:
  1. **Upper Half**: Increasing number of stars on both wings
  2. **Lower Half**: Decreasing number of stars on both wings
- For each row:
    - Print stars for the left wing
    - Print middle spaces: 2 * (n - i)
    - Print stars for the right wing
- Symmetry is achieved by repeating the same logic in reverse in the lower half.

⚠️ Edge Cases:
- n = 1 → Minimal butterfly pattern: single line with 2 stars and no spaces
- Large n → Will print larger pattern; no input limit enforced

*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class SolidButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
