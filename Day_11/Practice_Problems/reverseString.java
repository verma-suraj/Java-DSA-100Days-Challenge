/*
📌 Problem:
Reverse a given string entered by the user.

🧠 Logic:
- Prompt the user to enter a string.
- Use a for loop to iterate backward from the last character to the first.
- Append each character to a new StringBuilder to build the reversed string.
- Print the reversed string.

📊 Time Complexity:
O(n) — where n is the length of the input string (single pass)

💾 Space Complexity:
O(n) — additional StringBuilder used for the reversed string

⚠️ Edge Cases:
- Empty input → outputs empty string.
- String with spaces or special characters → all characters are reversed as-is.
*/

package Day_11.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string here : ");
        StringBuilder str = new StringBuilder(sc.nextLine()); // Read input string

        StringBuilder reversed = new StringBuilder(); // To store the reversed string

        // 🔽 Loop backward and build reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println("Reversed: " + reversed); // Output the reversed string
    }
}
