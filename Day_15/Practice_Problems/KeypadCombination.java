/*
📌 Problem:
Print all possible letter combinations for a given digit string
based on a mobile phone keypad mapping.
Example: input "23" → possible output: "ad", "ae", "af", "bd", etc.

🧠 Logic:
- Use recursion:
  - At each digit, look up its possible letters in a predefined array.
  - For each letter:
    - Append it to the current combination.
    - Recurse for the next digit.
- Base case: when index equals input length → print combination.

📊 Time Complexity:
O(4^n) — In the worst case (digits like 7 or 9, with 4 letters each),
there are up to 4^n combinations for an input of length n.

💾 Space Complexity:
O(n) — Due to recursion stack and current combination string.

⚠️ Edge Cases:
- Empty input → Prints only an empty line.
- Non-numeric characters → Not handled in this version, input should be digits only.
- Digits with no mapping (like 0, 1) → Handled as per the mapping array.

*/
package Day_15.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class KeypadCombination {
    public static String[] keypad = {
        ".",    // 0
        "abc",  // 1
        "def",  // 2
        "ghi",  // 3
        "jkl",  // 4
        "mno",  // 5
        "pqrs", // 6
        "tu",   // 7
        "vwx",  // 8
        "yz"    // 9
    };

    public static void printComb(String str, int idx, String Combination) {
        if (idx == str.length()) {
            System.out.println(Combination);
            return;
        }

        char CurrentChar = str.charAt(idx);
        String mapping = keypad[CurrentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, Combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "235";
        printComb(str, 0, "");
    }
}
