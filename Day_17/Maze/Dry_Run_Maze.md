# 🧪 Dry Run: Maze Path Count (Recursion Only - Right & Down)

---

## 📌 Problem
Count the number of ways to go from cell `(0,0)` to `(n-1, m-1)` in an `n x m` grid, moving **only right or down**.

---

## ✅ Input
```
n = 3, m = 3
Starting from cell (0, 0)
```

---

## 🧭 Recommended Reading Strategy

If you're **not an absolute beginner**, start with the **Recursive Execution Flow Summary** below — it presents a clean, high-level recursion tree and return values to help you mentally trace function calls efficiently.

However, if you **still struggle to visualize the flow**, scroll down to the **Detailed Step-by-Step Trace**, which breaks down every recursive call line by line. Use it to debug exactly where you're getting stuck.

> 🎯 **Pro Tip:** For regular practice and interviews, try to build intuition using only the summary version — it strengthens recursion visualization skills.

---

## 🌳 Recursive Execution Flow Summary (for Intermediate Learners)

A clean summary of recursive return paths for `countPaths(3, 3, 0, 0)`.  
Each function call is shown with its return value; base case calls return `{}`.

```
F(0, 0)
=> F(0, 1)
   => F(0, 2)
      => F(0, 3) → {0}
      => F(1, 2)
         => F(1, 3) → {0}
         => F(2, 2) → {1} ✅
      → F(1,2) = 1
   → F(0,2) = 1
   => F(1,1)
      => F(1,2) → {1}
      => F(2,1)
         => F(2,2) → {1}
         => F(3,1) → {0}
      → F(2,1) = 1
   → F(1,1) = 2
→ F(0,1) = 3
=> F(1,0)
   => F(1,1) → {2}
   => F(2,0)
      => F(2,1) → {1}
      => F(3,0) → {0}
   → F(2,0) = 1
→ F(1,0) = 3
→ F(0,0) = 6 ✅
```

---

## 📊 Return Value Table

| Function Call       | Returns |
|---------------------|---------|
| countPaths(2,2)     | 1       |
| countPaths(1,2)     | 1       |
| countPaths(0,2)     | 1       |
| countPaths(2,1)     | 1       |
| countPaths(1,1)     | 2       |
| countPaths(0,1)     | 3       |
| countPaths(2,0)     | 1       |
| countPaths(1,0)     | 3       |
| countPaths(0,0)     | 6       |

---

## 🧮 Total Unique Paths: **6**

The 6 unique right/down paths in a `3x3` grid are:
1. R → R → D → D  
2. R → D → R → D  
3. R → D → D → R  
4. D → R → R → D  
5. D → R → D → R  
6. D → D → R → R

---

## ⚙️ Time & Space Complexity

- **Time:** `O(2^(n+m))` — exponential due to overlapping recursive calls.
- **Space:** `O(n + m)` — max depth of recursion call stack.

---

## 💡 Optimization Tip

Use memoization (`int[][] dp`) or bottom-up DP to avoid repeated subproblems and reduce time to `O(n * m)`.

---

## 📘 Detailed Step-by-Step Trace (for Absolute Beginners)

This section traces every function call from `countPaths(3, 3, 0, 0)` using your code line references.

---

### ▶️ Function Call: countPaths(3, 3, 0, 0)

line executes: `if (i == n || j == m)`  
input passes: countPaths(3, 3, 0, 0)  
result: Not a base case → continue

line executes: `if (i == n-1 && j == m-1)`  
result: Not destination → continue

---

#### ▶️ Right Path Call from (0, 0)
line executes: `int rightpaths = countPaths(n, m, i, j+1);`  
input passes: countPaths(3, 3, 0, 1)

---

##### ▶️ Function Call: countPaths(3, 3, 0, 1)

Not a base case  
Right call → countPaths(3, 3, 0, 2)

###### ▶️ Function Call: countPaths(3, 3, 0, 2)

Right call → countPaths(3, 3, 0, 3)  
➡️ Out of bounds → return 0

Down call → countPaths(3, 3, 1, 2)

####### ▶️ Function Call: countPaths(3, 3, 1, 2)

Right call → countPaths(3, 3, 1, 3) → return 0  
Down call → countPaths(3, 3, 2, 2)

######## ▶️ Function Call: countPaths(3, 3, 2, 2) ✅ Destination → return 1

⬅️ Final return: countPaths(1,2) = 0 + 1 = 1  
⬅️ Final return: countPaths(0,2) = 0 + 1 = 1

---

##### ▶️ Down Path from (0,1)
call: countPaths(3, 3, 1, 1)

Right → countPaths(1, 2) → already computed = 1  
Down → countPaths(2, 1)

###### ▶️ countPaths(2, 1)

Right → countPaths(2, 2) = 1  
Down → countPaths(3, 1) = 0

⬅️ Final return: countPaths(2,1) = 1  
⬅️ Final return: countPaths(1,1) = 1 + 1 = 2  
⬅️ Final return: countPaths(0,1) = 1 (right) + 2 (down) = 3

---

#### ▶️ Down Path Call from (0, 0)
line executes: `int downPaths = countPaths(n, m, i+1, j);`  
input passes: countPaths(3, 3, 1, 0)

Right → countPaths(1, 1) = 2  
Down → countPaths(2, 0)

##### ▶️ countPaths(2, 0)

Right → countPaths(2, 1) = 1  
Down → countPaths(3, 0) = 0

⬅️ Final return: countPaths(2,0) = 1  
⬅️ Final return: countPaths(1,0) = 2 + 1 = 3

---

## 🔚 Final return value of countPaths(0,0):  
rightpaths (3) + downPaths (3) = **6**  
⬅️ `System.out.println(...)` → prints `6`

---

