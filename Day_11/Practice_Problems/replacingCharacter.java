/*
📌 Problem:
Replace every occurrence of the character 'e' with 'i' in a given string.

🧠 Logic:
- Prompt the user to enter a string.
- Convert it to a StringBuilder for easy character modification.
- Loop through each character:
    - If the character is 'e', replace it with 'i'.
- Print the modified string.

📊 Time Complexity:
O(n) — where n is the length of the input string (single pass)

💾 Space Complexity:
O(n) — space used by the StringBuilder

⚠️ Edge Cases:
- Empty input → outputs empty string.
- No 'e' in the input → string remains unchanged.
- Uppercase 'E' is not replaced (case-sensitive).
*/

package Day_11.Practice_Problems;           // Ignore this if you are copying this code to run locally!!

import java.util.*;

public class replacingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string here : ");
        StringBuilder input = new StringBuilder(sc.nextLine()); // Read input as StringBuilder

        // 🔽 Replace all 'e' with 'i'
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                input.setCharAt(i, 'i');
            }
        }

        System.out.println("Modified string: " + input); // Output the modified string
    }
}
