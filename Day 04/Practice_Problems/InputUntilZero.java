/*
📌 Problem:
Keep taking integer inputs from the user until the user enters 0.

🧠 Logic:
- Continuously prompt the user for input inside a while loop.
- If the entered number is 0, break the loop.
- Otherwise, print the entered number.
- Loop continues until 0 is entered.

⚠️ Edge Cases:
- If the first input is 0, loop ends immediately.
- No validation for non-integer input (assumes integer input only).
*/

import java.util.*;

public class InputUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        System.out.println("Enter numbers (0 to stop):");

        int num = sc.nextInt();  // Initial input

        while (num != 0) {
            System.out.println("You entered: " + num);  // Print the input
            num = sc.nextInt();  // Take the next input
        }

        System.out.println("Program ended as 0 was entered.");

        sc.close(); // Close the scanner to avoid resource leak
    }
}
