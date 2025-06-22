# 🌀 Recursion – Classical Problems (Part 2)

This part continues classical recursion problems. These focus more on string transformation, array traversal, and the foundational Tower of Hanoi puzzle.

---

### 🔹 Move all 'x' characters to the end of the string

Given a string, move all `'x'` characters to the end, preserving the order of other characters.  
Example: `"abxcxd"` → `"abcdxx"`

📌 At each step:
- If current char is `'x'`, add it **after** recursive calls  
- Else, add it **before**

🔗 [View Solution → rearrangingX.java](./rearrangingX.java)

---

### 🔹 Remove duplicate characters from a string

Given a string, remove all duplicate characters while preserving the original order.  
Example: `"aabbcc"` → `"abc"`

📌 Use a boolean array (or Set) to track visited characters.

🔗 [View Solution → removeDuplicateString.java](./removeDuplicateString.java)

---

### 🔹 Check if an array is strictly increasing

Given an array, check whether it's strictly increasing using recursion.  
Example: `[1, 3, 5, 7]` → `true`  
`[2, 2, 3]` → `false`

📌 At each step, check if `arr[i] < arr[i+1]` and continue recursively.

🔗 [View Solution → SortedArray.java](./SortedArray.java)

---

### 🔹 Tower of Hanoi

Solve the Tower of Hanoi puzzle for `n` disks.  
Rules:
- Move all disks from source to destination using helper
- Never place a larger disk on top of a smaller one

📌 Recursive strategy:
1. Move `n-1` disks from source → helper  
2. Move `1` disk from source → destination  
3. Move `n-1` disks from helper → destination

🔗 [View Solution → TowerOfHanoi.java](./TowerOfHanoi.java)

---

### ✅ Summary

| Problem                         | Technique            |
|----------------------------------|-----------------------|
| Move 'x' to end                  | Divide + Combine      |
| Remove duplicates                | Recursion + Visited[] |
| Strictly increasing array check  | Linear recursion      |
| Tower of Hanoi                   | Classic recursion     |

This wraps up the classical recursion set. Next, we shift toward recursion + backtracking problems like permutations, combinations, etc.

---
