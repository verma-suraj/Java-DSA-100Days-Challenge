# 🧪 Dry Run: Generate All Permutations of a String

---

## 📌 Problem
Given a string, generate and print **all permutations** of its characters using recursion.

---

## ✅ Input
```
str = "abc"
permutation = ""
```

---

## 🧭 Recommended Reading Strategy

If you're **not a beginner**, skip to the **Recursive Execution Flow Summary** — it gives you a clean view of all recursive paths and printed results.

If you're struggling to visualize how recursion generates permutations, scroll down to the **Step-by-Step Trace** section which explains each line executed in full detail.

> 🎯 **Pro Tip:** For regular practice, focus on mastering the **summary view** and try drawing recursion trees mentally.

---

## 🌳 Recursive Execution Flow Summary (for Intermediate Learners)

Each function call is written as:  
`printPermu(str, permutation)`

```
printPermu("abc", "")
├── pick 'a' → printPermu("bc", "a")
│   ├── pick 'b' → printPermu("c", "ab")
│   │   └── pick 'c' → printPermu("", "abc") → ✅ print "abc"
│   └── pick 'c' → printPermu("b", "ac")
│       └── pick 'b' → printPermu("", "acb") → ✅ print "acb"
├── pick 'b' → printPermu("ac", "b")
│   ├── pick 'a' → printPermu("c", "ba")
│   │   └── pick 'c' → printPermu("", "bac") → ✅ print "bac"
│   └── pick 'c' → printPermu("a", "bc")
│       └── pick 'a' → printPermu("", "bca") → ✅ print "bca"
└── pick 'c' → printPermu("ab", "c")
    ├── pick 'a' → printPermu("b", "ca")
    │   └── pick 'b' → printPermu("", "cab") → ✅ print "cab"
    └── pick 'b' → printPermu("a", "cb")
        └── pick 'a' → printPermu("", "cba") → ✅ print "cba"
```

---

## 📊 Return Value Table

| Function Call                   | Output Printed |
|--------------------------------|----------------|
| printPermu("", "abc")          | abc            |
| printPermu("", "acb")          | acb            |
| printPermu("", "bac")          | bac            |
| printPermu("", "bca")          | bca            |
| printPermu("", "cab")          | cab            |
| printPermu("", "cba")          | cba            |

---

## 🧾 Output Printed to Console

```
abc  
acb  
bac  
bca  
cab  
cba  
```

Total permutations = 3! = 6 ✅

---

## ⚙️ Time & Space Complexity

- **Time:** `O(n!)` — Each permutation takes `O(n)` to build, total `n!` permutations.
- **Space:** `O(n)` — Due to recursion depth and string building.

---

## 📘 Detailed Step-by-Step Trace (for Absolute Beginners)

Start from:  
```java
printPermu("abc", "")
```

---

### ▶️ Function Call: printPermu("abc", "")

#### Iteration i = 0:
currentChar = 'a'  
newString = "bc"  
call → `printPermu("bc", "a")`

---

### ▶️ Function Call: printPermu("bc", "a")

#### Iteration i = 0:
currentChar = 'b'  
newString = "c"  
call → `printPermu("c", "ab")`

---

### ▶️ Function Call: printPermu("c", "ab")

#### Iteration i = 0:
currentChar = 'c'  
newString = ""  
call → `printPermu("", "abc")`

➡️ Base case → print "abc"

---

⬅️ Return to: printPermu("bc", "a")

#### Iteration i = 1:
currentChar = 'c'  
newString = "b"  
call → `printPermu("b", "ac")`

---

### ▶️ Function Call: printPermu("b", "ac")

#### Iteration i = 0:
currentChar = 'b'  
newString = ""  
call → `printPermu("", "acb")`

➡️ Base case → print "acb"

---

⬅️ Return to: printPermu("abc", "")

#### Iteration i = 1:
currentChar = 'b'  
newString = "ac"  
call → `printPermu("ac", "b")`

---

### ▶️ Function Call: printPermu("ac", "b")

#### Iteration i = 0:
currentChar = 'a'  
newString = "c"  
call → `printPermu("c", "ba")`

---

### ▶️ Function Call: printPermu("c", "ba")

#### Iteration i = 0:
currentChar = 'c'  
newString = ""  
call → `printPermu("", "bac")`

➡️ Base case → print "bac"

---

⬅️ Return to: printPermu("ac", "b")

#### Iteration i = 1:
currentChar = 'c'  
newString = "a"  
call → `printPermu("a", "bc")`

---

### ▶️ Function Call: printPermu("a", "bc")

#### Iteration i = 0:
currentChar = 'a'  
newString = ""  
call → `printPermu("", "bca")`

➡️ Base case → print "bca"

---

⬅️ Return to: printPermu("abc", "")

#### Iteration i = 2:
currentChar = 'c'  
newString = "ab"  
call → `printPermu("ab", "c")`

---

### ▶️ Function Call: printPermu("ab", "c")

#### Iteration i = 0:
currentChar = 'a'  
newString = "b"  
call → `printPermu("b", "ca")`

---

### ▶️ Function Call: printPermu("b", "ca")

#### Iteration i = 0:
currentChar = 'b'  
newString = ""  
call → `printPermu("", "cab")`

➡️ Base case → print "cab"

---

⬅️ Return to: printPermu("ab", "c")

#### Iteration i = 1:
currentChar = 'b'  
newString = "a"  
call → `printPermu("a", "cb")`

---

### ▶️ Function Call: printPermu("a", "cb")

#### Iteration i = 0:
currentChar = 'a'  
newString = ""  
call → `printPermu("", "cba")`

➡️ Base case → print "cba"

---

## 🔚 Final Output Recap

```
abc  
acb  
bac  
bca  
cab  
cba  
```

✅ All 6 permutations of "abc" successfully printed.

---
