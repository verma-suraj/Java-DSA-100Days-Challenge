# 🌀 Recursion – Classical Problems (Part 1)

In this part, we solve some classical string-based problems using recursion. Each problem focuses on breaking down a task into smaller subproblems using base and recursive cases.

---

### 🔹 Print all subsequences of a string

A subsequence is any combination where each character may be included or excluded, while maintaining the original order.  
Example: `"abc"` → `["", "a", "b", "ab", "c", "ac", "bc", "abc"]`

📌 We explore two choices at every character:
- Include the character
- Exclude the character

🔗 [View Solution → impSubsequence.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/6c93017ba64d3d5dec7fcd110bb9df0f7f1352d2/Day_15/Practice_Problems/impSubsequence.java)

---

### 🔹 Print all **unique** subsequences of a string

Similar to the previous problem, but avoids printing duplicate subsequences.  
Example: For input `"aaa"` → valid output is `["", "a", "aa", "aaa"]` (no repetitions)

📌 We use a `HashSet` to keep track of already printed subsequences.

🔗 [View Solution → impUniqueSubsequence.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/6c93017ba64d3d5dec7fcd110bb9df0f7f1352d2/Day_15/Practice_Problems/impUniqueSubsequence.java)

---

### 🔹 Print all possible keypad combinations

Given a string of digits, print all possible letter combinations based on a mobile keypad layout.  
Example: Input `"23"` → Output: `["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]`

📌 Use a mapping of digits to characters and explore all combinations recursively.

🔗 [View Solution → KeypadCombination.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/6c93017ba64d3d5dec7fcd110bb9df0f7f1352d2/Day_15/Practice_Problems/KeypadCombination.java)

---

### 🔹 Print a string in reverse using recursion

Given a string, print it in reverse without using loops or additional variables.  
Example: Input `"hello"` → Output: `"olleh"`

📌 Recurse till the end of the string and print characters while returning back through the call stack.

🔗 [View Solution → PrintRevString.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/6c93017ba64d3d5dec7fcd110bb9df0f7f1352d2/Day_15/Practice_Problems/PrintRevString.java)

---

### 🔹 Find the first and last occurrence of a character

Given a string and a target character, find the index of its **first** and **last** appearance using recursion.  
Example: `"abcaad"`, target `'a'` → First: 0, Last: 4

📌 Use recursion to traverse the string and update first/last indices when matches are found.

🔗 [View Solution → OccurenceIndex.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/6c93017ba64d3d5dec7fcd110bb9df0f7f1352d2/Day_15/Practice_Problems/OccurenceIndex.java)

---

### ✅ Summary of Classical Recursion Problems (Part 1)

| Problem                             | Time Complexity | Space Complexity |
| :---------------------------------- |:-------------- | :--------------- |
| Print all subsequences              | $O(2^n)$        | $O(n)$           |
| Unique subsequences                 | $O(2^n * n)$    | $O(2^n * n)$     |
| Keypad combinations                 | $O(4^n)$        | $O(n)$           |
| Reverse string                      | $O(n)$          | $O(n)$           |
| First & last index of character     | $O(n)$          | $O(n)$           |

---

### In the next part, we’ll cover:
- Moving characters to the end  
- Removing duplicates  
- Checking for sorted arrays  
- Tower of Hanoi

---
