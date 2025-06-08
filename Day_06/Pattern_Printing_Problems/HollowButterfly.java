/*
📌 Problem:
Print a hollow butterfly pattern based on the number of rows input by the user.
Each half of the butterfly (upper and lower) contains a mirrored hollow triangle, separated by spaces.

🧠 Logic:
- The butterfly pattern has two parts: upper half and lower half.
- Each row of the upper and lower half has:
    1. A left wing: print `*` at the borders (first and last columns of the wing), else print space.
    2. A middle section: print spaces to separate the left and right wings.
    3. A right wing: same logic as the left wing.
- The upper half increments rows from 1 to `n`, while the lower half decrements from `n` to 1.
- Middle space between the wings in each row is `2 * (n - i)`.

⚠️ Edge Cases:
- n = 1 → Smallest butterfly, just two stars
- n = 0 or negative → Not handled explicitly; will print nothing (could add input validation)
*/

package Day_06.Pattern_Printing_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows (height of half the butterfly)
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Middle spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Middle spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
