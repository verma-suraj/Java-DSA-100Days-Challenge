# 🔁 Recursion in Java – Day 14 of #100DaysOfCode

## 📌 What is Recursion?

Recursion is a method of solving problems where a function calls itself to break down the problem into smaller sub-problems of the same type.  
This continues until it reaches a **base case** – a condition where the recursion stops.

---

## 🧠 Real-Life Analogy: Composite Functions in Math

Recursion works like composite functions in mathematics:

```text
f(f(f(f(x)))) → Outer function waits for the result of the inner one.
```

Similarly in recursion:

```java
int f(int n) {
    return f(n - 1) + something;
}
```

The function waits for `f(n-1)` before it can compute `f(n)` — **"Solve the rest first, I’ll handle the current one after that."**

---

## 🛠️ Structure of Recursive Function

```java
returnType function(parameters) {
    // Base Case: to stop recursion
    if (baseCondition) {
        return baseValue;
    }

    // Recursive Case: solve smaller subproblem
    return someOperation(function(smallerInput));
}
```

---

## 🧩 Example – Sum of N Natural Numbers

```java
int sum(int n) {
    if (n == 1) return 1;      // base case
    return n + sum(n - 1);     // recursive call
}
```

In this example:
- Each call **waits** for the result of the next one
- `sum(4) = 4 + sum(3)` → `3 + sum(2)` → `2 + sum(1)` → returns `1`
- Now unwinds: `2 + 1 = 3`, `3 + 3 = 6`, `4 + 6 = 10`

---

## 🧾 Memory: How Recursion is Implemented

Each function call in recursion is pushed onto the **call stack**, which holds:
- Function’s local variables
- Parameters
- Return address (to know where to go after finishing)

### 👇 Stack Trace for `sum(3)`

```
sum(3) → sum(2) → sum(1)

call stack:
-------------
| sum(3)     |
| sum(2)     |
| sum(1)     | → returns 1
-------------
```

Now returning back:
```
sum(1) returns 1 → sum(2) returns 2 + 1 = 3 → sum(3) returns 3 + 3 = 6
```

---

## 🔄 Return Value – Why It’s Crucial

In recursion, the return value is **how the previous function gets the result** of its subproblem.  
Without returning, nothing is passed back up the chain.

### ❌ Wrong

```java
void sum(int n) {
    sum(n - 1); // no return, no calculation stored
}
```

### ✅ Correct

```java
int sum(int n) {
    if (n == 1) return 1;
    return n + sum(n - 1);
}
```

Each return value **bubbles back up**, completing the full computation.

---

## 🧠 Recursion = Delegation

You only solve the **last** part.  
The rest is **delegated** to future calls.

🔁 "You do the rest, I'll just finish my part once you return."

This mindset helps when thinking recursively:
- Don't solve the entire problem
- Just make progress and **trust** the recursion

---

## 📐 Time and Space Complexity

### Example: Factorial

```java
int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n - 1);
}
```

- **Time Complexity:** O(n) — `n` calls made
- **Space Complexity:** O(n) — `n` frames in call stack

🧠 Space grows due to **stack frames**, not array/list usage!

---

## 💥 Stack Overflow

If the base case is wrong or missing:
```java
int f(int n) {
    return f(n - 1); // infinite loop
}
```
This leads to a **StackOverflowError** – stack memory fills up with never-ending calls.

---

## 🔄 Recursive vs Iterative

| Feature         | Recursion             | Iteration              |
|-----------------|------------------------|------------------------|
| Readability     | Cleaner for logic like DFS, Trees | Simple for loops     |
| Performance     | Slower (stack overhead) | Faster                 |
| Memory          | More (O(n) stack)       | Constant (O(1))        |
| Best Use Case   | Tree, Graph, Backtracking | Arrays, Simple Loops |

---

## 🔍 How Stack Frames Work (Return Phase)

For `fact(3)`:

```
fact(3)
→ fact(2)
  → fact(1)
    → returns 1
  → returns 2 * 1 = 2
→ returns 3 * 2 = 6
```

Each return:
- Pops current frame
- Passes the result upward
- Stack shrinks back to the caller

📌 **Only one active call at a time**, others are paused in memory.

---

## 📘 Summary

Recursion is about breaking a problem into smaller subproblems.  
It uses a **call stack** where:
- Each function waits until the smaller subproblem is solved
- The **base case** is the key to stopping
- Return values pass the result back up
- Memory is used for each call, so stack overflows are possible

Think recursively like this:
> "I trust my future self to solve the rest – I’ll just do one small part."

---

## 🛠️ Trouble Visualizing Recursion?

If recursion logic seems confusing, try **visualizing it step-by-step** using these tools:

### 📍 Visual Tools:
- [📊 Visualgo.net](https://visualgo.net/en/recursion) – Best for understanding **predefined** recursion templates like factorial, fibonacci, etc.
- [🧠 PythonTutor.com (Java)](https://pythontutor.com/java.html#mode=edit) – Best for visualizing your own custom recursive code.

> ⚠ Note: PythonTutor requires slight modifications in code to run smoothly.  
For this reason, **a modified version of each Java file** (compatible with PythonTutor) is included inside the `/Modified_Code/` folder with the same filename.

## 🔗 Related

### 📚 Practice Problems

* **Question 1: Find the factorial of a number using recursion.**  
  [Factorial.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Practice_Problems/Factorial.java)  
  🔁 [Modified Version (for PythonTutor)](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Modified_Code/Factorial.java)

* **Question 2: Print the first `n` terms of the Fibonacci Series using recursion.**  
  [FibonacciSeries.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Practice_Problems/FibonacciSeries.java)  
  🔁 [Modified Version](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Modified_Code/FibonacciSeries.java)

* **Question 3: Print numbers from 1 to a given number `x` using recursion.**  
  [RecursionPrintNumb.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Practice_Problems/RecursionPrintNumb.java)  
  🔁 [Modified Version](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Modified_Code/RecursionPrintNumb.java)

* **Question 4: Calculate the sum of first `x` natural numbers using standard recursion.**  
  [sumOfNaturalNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Practice_Problems/sumOfNaturalNumbers.java)  
  🔁 [Modified Version](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Modified_Code/sumOfNaturalNumbers.java)

* **Question 5: Calculate the sum of first `n` natural numbers using tail recursion.**  
  [sumOfnNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Practice_Problems/sumOfnNumbers.java)  
  🔁 [Modified Version](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_14/Modified_Code/sumOfnNumbers.java)

---

### ✅ Ending Note

For today, just focus on these foundational problems to understand **how recursive flow works**, both in logic and memory.

🧠 **Tomorrow we'll dive into standard recursion problems** — like power calculation, gcd, reverse string, etc. — to build deeper conceptual clarity.

Until then, practice well!
