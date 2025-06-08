/*
📌 Problem:
Print a palindromic number pyramid where each row forms a symmetric pattern of descending and ascending digits.
Example for n = 5:
        1
       212
      32123
     4321234
    543212345

🧠 Logic:
- For each row `i` from 1 to `n`:
    1. Print `n - i` spaces to center the pyramid.
    2. Print numbers from `i` to `1` in descending order.
    3. Then print numbers from `2` to `i` in ascending order.
- This creates a palindromic numeric pattern with symmetry around the center.

⚠️ Edge Cases:
- n = 1 → Only single digit `1` is printed
- n = 0 or negative → No pattern is printed (no validation implemented)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
