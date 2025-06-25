# 🧪 Dry Run: Ways to Call Guests (Single or Pair)

---

### 📌 Problem
You’re hosting a party with `n` guests. Each guest can:
- Attend alone (1 way)
- Or pair up with any of the remaining (n-1) guests

We must find the total number of **unique ways** to call all guests.

---

### ✅ Input
```
n = 4
```

---

## ⚙️ Function: `callGuest(n)`
We'll simulate the recursive call step-by-step.

---

## 🔁 Intermediate-Level Summary Table (Recommended)

| Function Call     | Returns | Reason / Breakdown                            |
|------------------|---------|-----------------------------------------------|
| callGuest(0)      | 1       | Base case: no guests left                     |
| callGuest(1)      | 1       | Base case: only 1 guest → only one way        |
| callGuest(2)      | 2       | Alone + pair: `callGuest(1) + 1*callGuest(0)` → 1 + 1 |
| callGuest(3)      | 4       | Alone + pair: `callGuest(2) + 2*callGuest(1)` → 2 + 2 |
| callGuest(4)      | 10      | Alone + pair: `callGuest(3) + 3*callGuest(2)` → 4 + 6 |

---

### ⚠️ Not a beginner?
Start with the summary table above. Use the full trace below only to debug your recursion intuition. Avoid relying on it permanently.

---

## 🔍 Step-by-Step Dry Run (Beginner Trace)

---

### ▶️ Function Call: `callGuest(4)`

#### Line Executes:
```java
int way1 = callGuest(3);
```

---

### ▶️ Function Call: `callGuest(3)`

#### Line Executes:
```java
int way1 = callGuest(2);
```

---

### ▶️ Function Call: `callGuest(2)`

#### Line Executes:
```java
int way1 = callGuest(1); // base case → returns 1
```

---

### ▶️ Back to `callGuest(2)`:

#### Line Executes:
```java
int way2 = (2 - 1) * callGuest(0); // 1 * 1 = 1
```

✅ Final return from `callGuest(2)`:
```java
way1 + way2 = 1 + 1 = 2
```

---

### ▶️ Back to `callGuest(3)`:

#### Line Executes:
```java
int way2 = (3 - 1) * callGuest(1); // 2 * 1 = 2
```

✅ Final return from `callGuest(3)`:
```java
way1 + way2 = 2 + 2 = 4
```

---

### ▶️ Back to `callGuest(4)`:

#### Line Executes:
```java
int way2 = (4 - 1) * callGuest(2); // 3 * 2 = 6
```

✅ Final return from `callGuest(4)`:
```java
way1 + way2 = 4 + 6 = 10
```

---

## 🔁 Return Tree Summary

```
callGuest(4)
=> callGuest(3) = 4
=> 3 * callGuest(2) = 3 * 2 = 6
=> returns 10
```

---

## 🧮 Final Answer:
```
callGuest(4) = 10
```

---

## 💡 Pro Tip
This problem is similar to **friends pairing problem** and follows a recurrence:

```
ways(n) = ways(n - 1) + (n - 1) * ways(n - 2)
```

Which resembles the Fibonacci structure + pairing combinations. Use **memoization** for optimization.

