/*
📌 Problem:
Read 'n' lines of text from the user, combine them, and count the total number of characters excluding spaces.

🧠 Logic:
- Take an integer input 'n' for the number of lines.
- Use a loop to read 'n' lines and append them to a single StringBuilder.
- Iterate through the combined text:
    - For each character, if it is not a space, increment a counter.
- Output the total count.

📊 Time Complexity:
O(N) — where N is the total length of all lines combined (one pass for reading + one pass for counting)

💾 Space Complexity:
O(N) — space used to store the combined string

⚠️ Edge Cases:
- n = 0 → no lines read, output will be 0.
- Lines with only spaces → spaces are ignored in the count.
- Empty lines are handled automatically.
*/

package Day_11.Practice_Problems;           // Ignore this if you are copying this code to run locally!!

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt(); 
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter your data here : ");
        StringBuilder allText = new StringBuilder(); // To store combined lines

        // 🔽 Read n lines and append to allText
        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder(sc.nextLine());
            allText.append(temp);
        }

        int count = 0; // To count non-space characters

        // 🔽 Count characters excluding spaces
        for (int i = 0; i < allText.length(); i++) {
            if (allText.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total characters (excluding spaces): " + count);
    }
}
