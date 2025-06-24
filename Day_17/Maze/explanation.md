# 📘 Detailed Explanation: Intuition Behind Maze Path Count Using Recursion

---

## 🧩 Problem Statement

**Task:**  
Given a grid of size `n x m`, count how many unique paths exist from the **top-left corner (0,0)** to the **bottom-right corner (n-1, m-1)**.  
Allowed moves:  
- Right (`→`)  
- Down (`↓`)  

You **cannot** move diagonally, left, or up.

---

## 🧠 Why This Is a Recursion Problem

You're at a cell `(i, j)` and you want to reach `(n-1, m-1)`.  
At every step, you can either:
- Move right → `(i, j+1)`
- Move down → `(i+1, j)`

You're repeatedly **making a choice**, and recursively breaking the problem into smaller subproblems — that’s recursion!

---

## 🧠 Mindset Behind the Logic

### ❓What should click?

When you’re asked to:
- Explore all **paths** from a starting point,
- By making **choices at each step**,
- Until you reach a goal (or go out of bounds),

That’s a perfect setup for **recursive exploration**.

---

## 🔎 Step-by-Step Intuition

### 🚩 Goal:

Reach `(n-1, m-1)` from `(0, 0)` using only `→` and `↓` moves.

Let’s define a function:

```java
int countPaths(int i, int j, int n, int m)
```

Where:
- `i`, `j` are the current cell coordinates
- `n`, `m` are the grid boundaries

---

## 🧱 Base Cases

1. ✅ **If `i == n-1 && j == m-1`**:  
   You’ve reached the destination. Return `1` path.

2. ❌ **If `i >= n || j >= m`**:  
   You’ve gone out of bounds. Return `0`.

---

## 🔁 Recursive Step

From `(i, j)`, total paths =  
→ paths from `(i, j+1)` (move right)  
+  
↓ paths from `(i+1, j)` (move down)

```java
return countPaths(i, j + 1, n, m) + countPaths(i + 1, j, n, m);
```

---

## 🔂 Recursion Tree Example (3x3 grid)

From `(0,0)`:

```
(0,0)
├── (0,1)
│   ├── (0,2)
│   │   ├── (0,3) ❌
│   │   └── (1,2)
│   │       └── ...
│   └── (1,1)
│       └── ...
└── (1,0)
    └── ...
```

Each node branches into two further recursive calls.

---

## 🧠 What's the Pattern?

At each cell, we're exploring **2 paths**. So, the total number of calls grows **exponentially** with grid size.

---

## 🧮 Time & Space Complexity

- **Time:**  
  `O(2^(n + m))` → At each cell, you branch into 2 calls (right + down)

- **Space:**  
  `O(n + m)` → Maximum depth of recursion stack

---

## 🧠 How to Improve It?

Use **memoization** or **dynamic programming** to store results of overlapping subproblems and avoid recalculating the same states.

---

## 📘 Final Mental Model

> Think of this like being lost in a maze:  
You stand at `(0,0)` and every time you have a choice — go **right** or go **down**.  
Every time you hit a **wall (out of bounds)**, you backtrack.  
Every time you reach the **goal**, you count it as a valid path.

This is a classic example of **"recursion + counting all valid paths."**

---

## ✅ Summary

| Concept                | Maze Path Count                             |
|------------------------|---------------------------------------------|
| Recursion Type         | Tree-style exploration                      |
| Key Insight            | Explore 2 paths from each cell              |
| Base Cases             | Reached goal → return 1, Out of bounds → 0 |
| Recursive Formula      | `f(i,j) = f(i+1,j) + f(i,j+1)`              |
| Optimization (Later)   | Memoization or DP                           |

---
