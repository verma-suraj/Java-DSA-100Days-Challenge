/*
📌 Problem:
Extract the username from an email address entered by the user.
The username is defined as the substring before the '@' symbol.

🧠 Logic:
- Prompt the user to enter an email address.
- Use a loop to read characters one by one.
- Append each character to the username until '@' is found.
- Print the final username.

📊 Time Complexity:
O(n) — where n is the length of the email string (loop runs at most n times)

💾 Space Complexity:
O(n) — space for storing the email and the extracted username

⚠️ Edge Cases:
- If there is no '@' in the input, the whole string is returned as username.
- Leading/trailing whitespaces are included (no trimming done).
- Empty input → username will be empty.
*/

package Day_11.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class CreateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email : ");
        StringBuilder email = new StringBuilder(sc.nextLine()); // Read full email input
        StringBuilder username = new StringBuilder();           // To store extracted username

        // 🔽 Extract characters before '@'
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') break; // Stop at '@'
            username.append(email.charAt(i));  // Add character to username
        }

        System.out.println("Username: " + username); // Output the result
    }
}
