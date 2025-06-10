# Day 08 – Space and Time Complexity

📌 **Today’s topic is theoretical. We do not have any practice problem to solve today.  
From tomorrow onwards, we will calculate space and time complexity for every problem we solve.**

---

## 🧠 Topic: Space and Time Complexity

Understanding space and time complexity is crucial to write efficient code. It helps us analyze the performance of our algorithms in terms of both speed and memory usage.

---

## ⏱ Time Complexity

**Definition**: Time Complexity represents the amount of time an algorithm takes to run as a function of the input size `n`.

### 📊 Common Time Complexities:

| Complexity      | Example                         |
|-----------------|---------------------------------|
| O(1)            | Constant time (e.g., accessing an array element) |
| O(log n)        | Binary Search                   |
| O(n)            | Linear Search                   |
| O(n log n)      | Merge Sort, Quick Sort (avg)    |
| O(n²)           | Bubble Sort, Selection Sort     |
| O(2ⁿ)           | Recursion (e.g., Fibonacci naive)|
| O(n!)           | Factorial time (e.g., permutations) |

### 💡 Rules to Remember:

- **Ignore constants**: `O(2n)` → `O(n)`
- **Consider worst-case scenario** unless stated otherwise.
- **Drop non-dominant terms**: `O(n + log n)` → `O(n)`

---

## 🧮 Space Complexity

**Definition**: Space Complexity is the total memory space used by an algorithm (including input, auxiliary space, etc.) relative to the input size.

### 📊 Common Examples:

| Scenario                          | Space Complexity |
|-----------------------------------|------------------|
| No extra space used               | O(1)             |
| Storing results in an array       | O(n)             |
| Recursive function calls          | O(n) (due to call stack) |

---

## ✅ Tips for Optimization

- Use **in-place algorithms** to save space.
- Avoid **nested loops** when not required.
- Use **efficient data structures** (e.g., HashMap instead of ArrayList for search).
- Always consider the **constraints** of the problem.

---

## 📌 Summary

- **Time complexity** measures *speed*.
- **Space complexity** measures *memory usage*.
- Learn to analyze loops, recursions, and data structures used.
- Optimization is about improving one or both without harming the other significantly.

---

## 🔗 Useful Resources

- [Big-O Cheatsheet](https://www.bigocheatsheet.com/)
- [Time & Space Complexity - Visual Algo](https://visualgo.net/en)
- [GeeksForGeeks - Asymptotic Analysis](https://www.geeksforgeeks.org/analysis-of-algorithms-set-1-asymptotic-analysis/)

---
