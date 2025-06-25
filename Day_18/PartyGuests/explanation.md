# 🧠 Explanation: Ways to Call Guests (Single or Pair)

---

## 📌 Problem Overview

You’re organizing a party for `n` guests.

Each guest has **two choices**:
1. Come **alone**
2. Form a **pair** with one of the other guests

You need to count the total number of ways to invite all guests such that **each guest either comes alone or is paired**.

---

## 🧠 Step-by-Step Intuition

### 1. 🎯 Understand the Output
We don’t care about the exact combinations — we only want to **count** how many valid groupings exist.

---

### 2. 🔁 Recurrence Relation

At every stage, we look at the current guest:

#### Case 1: The guest comes alone
- We're left with the remaining `n - 1` guests.
- → Recursive call: `ways(n - 1)`

#### Case 2: The guest pairs with one of the `(n - 1)` others
- Number of ways to choose a partner = `(n - 1)`
- Remaining guests = `n - 2`
- → Recursive call: `(n - 1) * ways(n - 2)`

#### ⛓ Combined Recurrence:
```
ways(n) = ways(n - 1) + (n - 1) * ways(n - 2)
```

---

### 3. 🛑 Base Cases

| Case     | Meaning                               | Return |
|----------|----------------------------------------|--------|
| n == 0   | No guests → 1 way (do nothing)         | 1      |
| n == 1   | One guest → only way is solo           | 1      |

```java
if (n <= 1) return 1;
```

---

## 📊 Dry Run (n = 4)

Breakdown:
```
ways(4) = ways(3) + 3 * ways(2)
ways(3) = ways(2) + 2 * ways(1)
ways(2) = ways(1) + 1 * ways(0)
ways(1) = 1
ways(0) = 1

⇒ ways(2) = 1 + 1 = 2
⇒ ways(3) = 2 + 2 = 4
⇒ ways(4) = 4 + 6 = 10
```

---

## 📚 Real-Life Analogy

This problem is similar to:
- **Pairing friends for a group activity**
- **Couples and singles arriving at an event**

---

## ⏱ Time & Space Complexity

| Type             | Value             |
|------------------|-------------------|
| Time Complexity  | O(2^n) (without memoization) |
| Space Complexity | O(n) (recursion call stack)  |

You can **optimize** with memoization or tabulated DP.

---

## 🧠 Pattern Recognition

This recurrence:
```
ways(n) = ways(n - 1) + (n - 1) * ways(n - 2)
```
is also used in:
- **Friends Pairing Problem**
- **Partitioning guests/friends into single/pairs**

---

## ✅ Practice Platform

- [GeeksforGeeks – Friends Pairing Problem](https://www.geeksforgeeks.org/friends-pairing-problem/)

---

## 🧭 Strategy to Build Intuition

1. Think about the smallest values of `n` and **manually list** all valid groupings.
2. Observe how the number grows.
3. Understand that at each step, **a choice is being made** (solo or pair).
4. Model the choice → form recurrence → base case → build recursion.

---

## 💡 Key Takeaways

- At the heart of this problem is the concept of **choices at every step**
- Use recursion to explore these choices
- Practice converting the recurrence into a **bottom-up DP** solution

