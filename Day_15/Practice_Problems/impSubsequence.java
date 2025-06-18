/*
📌 Problem:
Print all subsequences of a given string.
A subsequence is any combination where each character may be included or excluded,
maintaining the original order.

🧠 Logic:
- Use recursion:
  - At each index, you have 2 choices:
    1️⃣ Include the current character
    2️⃣ Exclude the current character
- Base case: if index equals string length, print the current formed subsequence.

📊 Time Complexity:
O(2^n) — For a string of length n, there are 2^n possible subsequences.

💾 Space Complexity:
O(n) — Due to recursive call stack.

⚠️ Edge Cases:
- Empty string → Prints only an empty line (the empty subsequence)
- Works for any string length up to limits of stack.

*/
package Day_15.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class impSubsequence {

    // Recursive function to print all subsequences
    public static void printSubsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentchar = str.charAt(idx);

        // Include current character
        printSubsequence(str, idx + 1, newString + currentchar);

        // Exclude current character
        printSubsequence(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        printSubsequence(str, 0, "");
    }
}
