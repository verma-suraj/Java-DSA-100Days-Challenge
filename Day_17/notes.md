# Day 17: Recursion Practice - Permutations & Maze Paths

## 🌟 Topics Covered
- Generating permutations using recursion
- Counting paths in a grid using recursion

---

## 🧩 Problem 1: Generate All Permutations of a String

### 🔹 Problem Statement
Given a string `s`, print all possible **permutations** of the characters of the string.

> For example,  
Input: `"abc"`  
Output: `["abc", "acb", "bac", "bca", "cab", "cba"]`

---

### 💡 Approach
- At every index, swap the current character with every character **after** it (including itself).
- Recurse to fix the next position.
- Use backtracking: **undo the swap** after the recursive call.

### ✅ Base Case:
- If `index == s.length() - 1`, print the permutation.

---

### 🔁 Recursive Function Signature
```java
void permute(char[] str, int index)
```

### 🧠 Key Insight
- Each recursive level fixes one character in the permutation.
- Total permutations = `n!`

---

### ⏱ Time Complexity
- `O(n!)` permutations, each takes `O(n)` to print → total `O(n * n!)`

---

### 🧪 Try It Yourself  
Try it by yourself on LeetCode — the exact question might vary, but the **core recursive approach** remains the same.

### 🔗 LeetCode Reference  
[View on LeetCode](https://leetcode.com/problems/permutations/)

### 📂 Resources
- 🔗 [Solution Code (Java)](../permutation/permutation.java)
- 🔗 [Dry Run](../permutation/dryrun.md)
- 🔗 [Detailed Explanation](../permutation/notes.md)

---

## 🧩 Problem 2: Maze Path Count (Right + Down only)

### 🔹 Problem Statement
You are in a grid of size `n x m`. Count the total number of **unique paths** from `(0,0)` to `(n-1,m-1)`  
You can move **only right or down** at each step.

> For example,  
Input: `n = 2, m = 2`  
Output: `2`  
Paths: `(0,0)→(0,1)→(1,1)` and `(0,0)→(1,0)→(1,1)`

---

### 💡 Approach
- From a cell `(i, j)`, two choices:
  - Move Right → `(i, j+1)`
  - Move Down → `(i+1, j)`
- Recursively try both, and **sum** the results.

### ✅ Base Cases:
- If `i == n-1 && j == m-1` → reached destination → return 1
- If `i >= n || j >= m` → out of bounds → return 0

---

### 🔁 Recursive Function Signature
```java
int countPaths(int i, int j, int n, int m)
```

---

### ⏱ Time Complexity
- `O(2^(n + m))` (exponential recursion tree)

---

### 🧪 Try It Yourself  
Try it by yourself on LeetCode — the exact question might vary, but the **core recursive approach** remains the same.

### 🔗 LeetCode Reference  
[View on LeetCode](https://leetcode.com/problems/unique-paths/)

### 📂 Resources
- 🔗 [Solution Code (Java)](../maze/maze.java)
- 🔗 [Dry Run](../maze/dryrun.md)
- 🔗 [Detailed Explanation](../maze/notes.md)

---

## 📊 Summary Table

| Problem              | Time Complexity | Space Complexity | Techniques             |
|----------------------|-----------------|------------------|-------------------------|
| String Permutations  | O(n * n!)       | O(n)             | Recursion, Backtracking |
| Maze Path Count      | O(2^(n+m))      | O(n + m)         | Recursion               |

---

## 📌 Tips
- For permutations, always backtrack (undo the swap).
- For maze paths, visualize the grid and try dry runs on paper.
- Optimize maze path with memoization or DP later.

---

## 🔁 What's Next
- Add backtracking template to your notes.
- Practice same logic with `List<String>` instead of printing.
