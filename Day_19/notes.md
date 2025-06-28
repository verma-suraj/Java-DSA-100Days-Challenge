# 🔁 Day 19: Backtracking in Java – #100DaysOfCode

---

## 📌 What is Backtracking?

Backtracking is a **systematic approach** to solving problems by exploring all potential options and abandoning choices as soon as they are known to be invalid.

> Think of it as:  
> "Try every path. If you hit a dead end, back up and choose another."

---

## 🧠 Real-Life Analogy: Solving a Maze

Imagine you're in a maze:

- Choose a direction and go.
- Hit a wall? Backtrack to the last choice point and try another direction.

In code:

- **Make a choice.**
- **Explore.**
- **If invalid, undo and try the next choice.**

---

## 🛠️ Structure of a Backtracking Function

Backtracking is built around **recursion** and **choice-making** with undo steps.

General pattern in Java:

```java
void backtrack(State state) {
    if (isGoal(state)) {
        recordSolution(state);
        return;
    }

    for (Choice c : getChoices(state)) {
        if (isValid(c, state)) {
            makeChoice(c, state);
            backtrack(state);
            undoChoice(c, state);
        }
    }
}
````

✅ Base Case
<br>
✅ Make Choice
<br>
✅ Explore Recursively
<br>
✅ Undo Choice (Backtrack)

---

## 🧾 How Backtracking Uses the Call Stack

Every recursive call holds:

* The **current state**
* The **point to return to**

When a path fails:

* Call stack unwinds to the last decision point.
* Execution resumes with the next choice.

👇 Example trace for 4-Queens:

```
solve(0)
→ solve(1)
  → solve(2)
    → solve(3)
      → solve(4) ✅ found
```

---

## 🔄 Pruning – Making Backtracking Efficient

Without pruning, backtracking tries **all** possibilities.

✅ **Pruning** discards invalid paths early.

Examples:

* In N-Queens, skip unsafe columns.
* In Sudoku, don't place digits violating the rules.

---

## 🔍 Common Backtracking Patterns in Java

### ➜ Subsets / Power Set

```java
void generateSubsets(int index, List<Integer> current) {
    if (index == nums.length) {
        result.add(new ArrayList<>(current));
        return;
    }
    // Exclude
    generateSubsets(index + 1, current);
    // Include
    current.add(nums[index]);
    generateSubsets(index + 1, current);
    current.remove(current.size() - 1);
}
```

---

### ➜ Permutations

```java
void permute(List<Integer> nums, List<Integer> current, boolean[] used) {
    if (current.size() == nums.size()) {
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = 0; i < nums.size(); i++) {
        if (used[i]) continue;
        used[i] = true;
        current.add(nums.get(i));
        permute(nums, current, used);
        current.remove(current.size() - 1);
        used[i] = false;
    }
}
```

---

## 📐 Time and Space Complexity

⭐ **Time Complexity:** Generally exponential.

* Subsets: O(2^n)
* Permutations: O(n!)
* Sudoku / N-Queens: Exponential with pruning

⭐ **Space Complexity:**

* O(n) for recursion stack
* Extra space for storing solutions

---

## 💥 Common Pitfalls

⚠️ **Forgetting to Undo Changes:**

```java
current.add(...);
backtrack();
current.remove(...); // must undo
```

⚠️ **Missing Constraints:**

* Without pruning, time explodes.

⚠️ **Incorrect Base Cases:**

* Risk of missing solutions or infinite recursion.

---

## 🔄 Backtracking vs Brute Force

| Feature          | Brute Force       | Backtracking                  |
| ---------------- | ----------------- | ----------------------------- |
| Tries Everything | Yes               | Yes                           |
| Pruning          | No                | Yes                           |
| Efficiency       | Worse             | Better                        |
| Best Use Case    | Very small spaces | Large spaces with constraints |

---

## 🔍 How Stack Frames Work

For subset generation:

```
call(0, [])
→ call(1, [])
  → call(2, [])
  → call(2, [nums[1]])
→ call(1, [nums[0]])
  → call(2, [nums[0]])
  → call(2, [nums[0], nums[1]])
```

✅ Each call:

* Saves current state
* Waits for child calls
* Resumes and tries next option

---

## 📘 Summary

✅ Backtracking = **Try all options** + **Prune bad paths**
<br>
✅ Systematic exploration
<br>
✅ Recursion manages state
<br>
✅ Undo choices to explore alternatives

> "I’ll try this. If it fails, I’ll undo and try something else."

---

## 📍 Visual Tools for Learning

* [📊 VisuAlgo Backtracking Examples](https://visualgo.net/en)
* [🧠 PythonTutor (Java)](https://pythontutor.com/java.html#mode=edit)

---

## 🔗 Related

### 📚 Practice Problems

* **Problem 1: Solve a standard 9x9 Sudoku puzzle using Backtracking.**

  * Description: Fill in a 9x9 grid so every row, column, and 3x3 subgrid contains digits 1–9 exactly once.
  * Code File: [Sudoku.java](Practice_Problems/Sudoku.java)
  * 🔁 [Modified Version (for PythonTutor)](Modified_Code/Sudoku.java)

* **Problem 2: Solve the N-Queens problem using Backtracking.**

  * Description: Place `n` queens on an `n x n` chessboard so that no two queens threaten each other. Print all valid board configurations.
  * Code File: [N\_queen.java](Practice_problems/N_queen.java)
  * 🔁 [Modified Version (for PythonTutor)](Modified_Code/N_Queen.java)

---

## ✅ Ending Note

For today, focus on writing **clean backtracking solutions**:

* Define your **base case**.
* Make **valid choices**.
* Apply **pruning** to avoid unnecessary work.
* Always **undo** your changes.

🧠 Practice these patterns!
