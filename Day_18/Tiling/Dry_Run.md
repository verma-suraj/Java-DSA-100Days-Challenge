# 🧪 Dry Run: Tiling Problem (n x m floor with 1 x m tiles)

---

### 📌 Problem
Given a floor of size `n x m` and tiles of size `m x 1`, count the number of ways to tile the floor.

---

### ✅ Input
```
n = 4, m = 2
```

---

## ⚙️ Function: `placeTile(n, m)`
We'll simulate this recursively.

---

## 🔁 Intermediate-Level Summary Table (Recommended for Non-Beginners)

| Function Call     | Returns | Explanation                                   |
|-------------------|---------|-----------------------------------------------|
| `placeTile(0,2)`  | 1       | n < m → only vertical placement possible      |
| `placeTile(1,2)`  | 1       | n < m → only vertical placement possible      |
| `placeTile(2,2)`  | 2       | n == m → 2 ways (all vertical or all horizontal) |
| `placeTile(3,2)`  | 3       | `= placeTile(1,2) + placeTile(2,2)` → 1 + 2   |
| `placeTile(4,2)`  | 5       | `= placeTile(2,2) + placeTile(3,2)` → 2 + 3   |

---

### ⚠️ Not a complete beginner?  
Jump straight to the intermediate table above. If you get stuck visualizing how the recursion tree builds, use the detailed trace below. For practice, try *not* relying on this once you understand the flow.

---

## 🔍 Step-by-Step Dry Run (Beginner View)

---

### ▶️ Function Call: `placeTile(4, 2)`

#### Line Executes:
```java
int vertical = placeTile(4 - 2, 2); // → placeTile(2, 2)
```

---

### ▶️ Function Call: `placeTile(2, 2)`

#### Line Executes:
```java
if (n == m) return 2;
```

#### Result:
✅ Base case hit. `placeTile(2, 2)` returns `2`.

---

Returning to `placeTile(4, 2)`...

#### Line Executes:
```java
int horizontal = placeTile(4 - 1, 2); // → placeTile(3, 2)
```

---

### ▶️ Function Call: `placeTile(3, 2)`

#### Line Executes:
```java
int vertical = placeTile(3 - 2, 2); // → placeTile(1, 2)
```

---

### ▶️ Function Call: `placeTile(1, 2)`

#### Line Executes:
```java
if (n < m) return 1;
```

#### Result:
✅ Base case hit. `placeTile(1, 2)` returns `1`.

---

Returning to `placeTile(3, 2)`...

#### Line Executes:
```java
int horizontal = placeTile(3 - 1, 2); // → placeTile(2, 2)
```

---

### ▶️ Function Call: `placeTile(2, 2)`

✅ Already evaluated → returns `2`

---

#### Final Return for `placeTile(3, 2)`:
```java
vertical + horizontal = 1 + 2 = 3
```

---

Returning to `placeTile(4, 2)`...

### ✅ Final Return:
```java
vertical + horizontal = 2 + 3 = 5
```

---

### 🧮 Final Answer:
```
placeTile(4, 2) = 5 ways to tile the floor
```

---

## 🔁 Call Trace Summary

```
placeTile(4, 2)
=> placeTile(2, 2) → 2
=> placeTile(3, 2)
   => placeTile(1, 2) → 1
   => placeTile(2, 2) → 2
   => returns 3
=> returns 5
```

---

## 💡 Pro Tip  
This is a **variation of Fibonacci** with offset `m` → You can optimize this with **DP** or **memoization** for `O(n)` time.

