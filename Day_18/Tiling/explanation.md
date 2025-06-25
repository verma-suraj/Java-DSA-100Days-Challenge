# 🧠 Explanation: Tiling a Floor with 1 x m Tiles

---

## 📌 Problem Recap

You're given:
- A floor of size `n x m`
- Infinite tiles of size `m x 1`

You need to count the **number of ways** to completely tile the floor.  
Example: A `4 x 2` floor with `2 x 1` tiles can be tiled in 5 different ways.

---

## 🧠 Step-by-Step Intuition

### 1. 🧩 What's being asked?
We need to **count** total valid arrangements.  
This means recursion is suitable because:
- The problem can be **broken down into smaller subproblems**
- There’s a **choice** at every stage (horizontal vs vertical)

---

### 2. 🔄 Recursive Pattern Detection

Ask yourself:
> "At any point, what decisions can I make?"

At each step:
- You can place **1 horizontal tile** (which takes up 1 row)
- OR place **1 vertical tile** (which takes up `m` rows)

So you’re left with:
- `n-1` space if you placed horizontally
- `n-m` space if you placed vertically

Hence, recurrence becomes:
```
ways(n) = ways(n - 1) + ways(n - m)
```

---

### 3. 🎯 Base Case Thinking

Now you reverse-engineer the smallest possible floors:

- ✅ If `n == m`:
  - Either place all vertical (`1 way`)
  - Or place all horizontal (`1 way`)
  → Total `2` ways.

- ✅ If `n < m`:
  - Tiles can't fit horizontally
  - Only 1 way → all vertical

These two observations become your **base cases**:
```java
if (n == m) return 2;
if (n < m) return 1;
```

---

## 🔍 Dry Run Example (n = 4, m = 2)

```
ways(4) = ways(3) + ways(2)
ways(3) = ways(2) + ways(1)
ways(2) = 2
ways(1) = 1
→ Final: ways(4) = 3 + 2 = 5
```

---

## ⚙️ Code Logic Recap

```java
if(n == m) return 2;
if(n < m) return 1;

int vertical = placeTile(n - m, m);
int horizontal = placeTile(n - 1, m);

return vertical + horizontal;
```

---

## ⏱ Time & Space Complexity

| Type             | Value             |
|------------------|-------------------|
| Time Complexity  | O(2^n) exponential |
| Space Complexity | O(n) call stack   |

Can be optimized with **memoization** to O(n).

---

## 🧠 Mindset to Build This From Scratch

1. 🔍 Understand the smallest base condition manually.
2. 🎲 Ask: *What are the valid choices at each step?*
3. 🔁 Form recurrence by breaking problem into subproblems.
4. 🧱 Translate into recursive code with clear base cases.

---

## 📌 Key Takeaways

- This is a variation of **Fibonacci with offset m**
- Recursive choices → build recurrence
- Problem involves **combinatorics** (how many ways to reach a goal)
- Optimization with DP is possible once recurrence is clear

---

## ✅ Practice Resources

- [GeeksforGeeks – Tiling Problem](https://www.geeksforgeeks.org/tiling-problem/)

---

## 💬 Suggestion

Before jumping to code:
- Dry run `n = 1` to `n = 5` by hand
- Observe the pattern to confirm your recurrence
- Try converting to tabulated DP later

