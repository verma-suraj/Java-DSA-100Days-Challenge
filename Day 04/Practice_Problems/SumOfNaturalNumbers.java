/*
📌 Problem:
Print the sum of the first N natural numbers using a for loop.

🧠 Logic:
- Take an integer input N from the user.
- Initialize a variable `sum` to 0.
- Use a for loop from 1 to N, and add each number to `sum`.
- After the loop ends, print the final sum.

⚠️ Edge Cases:
- If N <= 0, sum will be 0 (no natural numbers).
- Assumes integer input only (no validation added).
*/

import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        System.out.print("Enter a positive integer N: ");
        int N = sc.nextInt();  // Read the value of N

        int sum = 0;  // Initialize sum

        for (int i = 1; i <= N; i++) {
            sum += i;  // Add each number from 1 to N to sum
        }

        System.out.println("The sum of first " + N + " natural numbers is: " + sum);

        sc.close(); // Close the scanner
    }
}
