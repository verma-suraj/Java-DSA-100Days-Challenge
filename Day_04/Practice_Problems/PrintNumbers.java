/*
📌 Problem:
Print numbers from 1 to N using all three loop types: while loop, for loop, and do-while loop.

🧠 Logic:
- Take an integer input N from the user.
- Use a while loop to print numbers from 1 to N.
- Use a for loop to do the same.
- Use a do-while loop to repeat the same task.

⚠️ Edge Cases:
- If N <= 0, no numbers will be printed.
- No input validation added (assumes correct integer input).
*/

import java.util.*;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for user input

        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();  // Take user input

        // While loop
        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            i++;
        }

        // For loop
        System.out.println("\n\nUsing for loop:");
        for (int j = 1; j <= N; j++) {
            System.out.print(j + " ");
        }

        // Do-while loop
        System.out.println("\n\nUsing do-while loop:");
        int k = 1;
        if (N > 0) {  // Ensure at least one iteration if N > 0
            do {
                System.out.print(k + " ");
                k++;
            } while (k <= N);
        }

        sc.close(); // Close scanner to prevent memory leak
    }
}
