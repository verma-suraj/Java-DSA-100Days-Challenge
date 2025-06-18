/*
📌 Problem:
Print all **unique subsequences** of a given string.
For example, for input `"aaa"`, many subsequences repeat,
so duplicates must be avoided.

🧠 Logic:
- Use recursion:
  - At each index, you have 2 choices:
    1️⃣ Include the current character.
    2️⃣ Exclude the current character.
- Use a `HashSet` to store and check for duplicates.
- Only print and add to set if the subsequence is not already present.

📊 Time Complexity:
O(2^n) — Generates all possible subsequences, but `HashSet` removes duplicates in constant time per insertion.

💾 Space Complexity:
O(2^n) — Maximum unique subsequences stored in the HashSet plus recursion stack.

⚠️ Edge Cases:
- Empty string → Outputs only the empty subsequence.
- All identical characters → Many duplicates, handled by the HashSet.
- Long string → May hit stack limit for large `n`.

*/
package Day_15.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class impUniqueSubsequence {

    public static void printSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentchar = str.charAt(idx);

        // Include current character
        printSubsequence(str, idx + 1, newString + currentchar, set);

        // Exclude current character
        printSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubsequence(str, 0, "", set);
    }
}
