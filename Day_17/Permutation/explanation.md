# 📘 Detailed Explanation: Intuition Behind String Permutations Using Recursion

---

## 🧩 Problem Statement Recap

**Task:**  
Given a string `str`, generate and print **all permutations** of its characters. A permutation is a unique arrangement of all characters in the string.

---

## 🧠 What Is a Permutation?

- A permutation is **not a subsequence**.
- All characters must be used, and **order matters**.
- Example:
  - Input: `"abc"`
  - Output (all permutations):
    ```
    abc  
    acb  
    bac  
    bca  
    cab  
    cba
    ```

---

## 🎯 Goal

Generate all `n!` permutations of a string of length `n`, **without skipping any** and **without using built-in functions or libraries** (i.e., do it manually via recursion to understand the process).

---

## 🧠 Mindset Behind the Logic

### ❓ What Should Trigger Your Recursion Instinct?

When a problem involves:
- Making a **choice at every step**,
- Exploring **all possible outcomes**,
- And there's **no clear iteration formula**,  
you should consider recursion.

> Here, at each step, we must choose one character out of the remaining string. That’s a recursive choice tree — perfect for recursion.

---

## 🔎 High-Level Intuition

### 💡 Step-by-Step Mental Model

Let's say:
- You are at a point where you have a string `str = "abc"`,
- You want to generate **all ways you can arrange its characters**.

#### Step 1: Make a Choice

Pick one character to place in the current position of the permutation.

Example:
- You pick `'a'` → fix `'a'` as first character
- Remaining string = `"bc"`

#### Step 2: Repeat the Process

Now repeat the same process for `"bc"`:
- Fix `'b'` → remaining = `"c"`
- Then fix `'c'` → permutation = `"abc"`

Each time, you're:
- Fixing 1 character,
- Passing the remaining string down to the next level of recursion,
- Continuing until there are **no characters left**.

At that point → you’ve built one full permutation → ✅ print it.

---

## 🔄 Recursive Breakdown

```java
printPermu("abc", "")
```

- Step 1:
  - Fix `'a'`, call → `printPermu("bc", "a")`
  - Fix `'b'`, call → `printPermu("ac", "b")`
  - Fix `'c'`, call → `printPermu("ab", "c")`

- Step 2 (inside each of the above):
  - Repeat the same process: fix one char, reduce string, recurse

- Step 3:
  - When string becomes empty, print the permutation.

---

## 🚦Base Case & Recursive Case

### ✅ Base Case:

```java
if(str.length() == 0) {
    System.out.println(permutation);
    return;
}
```

If there are no characters left in the string → it means we've formed a full permutation → print it.

---

### 🔁 Recursive Case:

```java
for(int i = 0; i < str.length(); i++) {
    char currentChar = str.charAt(i);
    String newStr = str.substring(0, i) + str.substring(i+1);
    printPermu(newStr, permutation + currentChar);
}
```

- Loop through all characters.
- Fix one character → remove it from string → add to permutation.
- Call function again with updated inputs.

---

## 🧮 Time Complexity

- Total permutations = `n!`
- So, time complexity = **O(n!)**

---

## 💾 Space Complexity

- Due to recursion stack: **O(n)** (max depth of recursion = length of the string)

---

## 🧠 Key Takeaways

1. **Choice Diagram = Recursion:**  
   When each step involves choosing something and reducing the input → recursion is your tool.

2. **Permutations Require Full Usage:**  
   Unlike combinations or subsequences, **you must use every character once**.

3. **String Manipulation Is Key:**  
   Removing one character at each step using:
   ```java
   String newStr = str.substring(0, i) + str.substring(i+1);
   ```

4. **Recursive Thinking Pattern:**
   - Choose a character,
   - Reduce the problem,
   - Let recursion handle the rest,
   - Stop when string is empty (base case).

---

## 🔗 Where to Use This Pattern

This approach helps in problems like:
- Letter case permutations,
- Subsets and combinations with constraints,
- Backtracking + recursion for arrangement problems.

---

## 🧠 Final Mindset

> "Fix one, let recursion handle the rest."

That’s your mental model.

At each level:
- Fix 1 char,
- Reduce the string,
- Pass it down.

Base case? Just print the permutation — no backtracking needed if you create a **new string** at every level (pure function-style recursion).

---