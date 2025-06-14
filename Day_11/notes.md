# 📚 Day 11: StringBuilder in Java

Today I explored `StringBuilder` in Java, which is a **mutable** sequence of characters. It's very useful when we need to perform multiple string operations efficiently.

---

## ✍️ Syntax

```java
StringBuilder sb = new StringBuilder("Suraj");
```

---

## 🔧 setCharAt()

Used to change a character at a specific index.

**Syntax:**
```java
sb.setCharAt(index, 'newChar');
```

**Example:**
```java
StringBuilder sb = new StringBuilder("Suraj");
sb.setCharAt(0, 'i');
System.out.print(sb);
```

**Output:**
```
iuraj
```

---

## ➕ insert()

Used to insert a character or string at a specified position.

**Syntax:**
```java
sb.insert(index, 'char');
```

**Example:**
```java
StringBuilder sb = new StringBuilder("Suraj");
sb.insert(0, 'i');
System.out.print(sb);
```

**Output:**
```
iSuraj
```

---

## ❌ delete()

Used to delete a range of characters. Note that the ending index is **non-inclusive**.

**Syntax:**
```java
sb.delete(start, end);
```

**Example:**
```java
StringBuilder sb = new StringBuilder("Suraj");
sb.delete(2, 3);
System.out.print(sb);
```

**Output:**
```
Suaj
```

---

## 🧩 append()

Used to add characters or strings at the **end** of the current sequence.

**Syntax:**
```java
sb.append("text");
```

**Example:**
```java
StringBuilder sb = new StringBuilder("S");
sb.append("u");
sb.append("r");
sb.append("a");
sb.append("j");
System.out.print(sb);
```

**Output:**
```
Suraj
```

---

## ✅ Summary

StringBuilder is a powerful class for manipulating strings. Key functions include:

- `setCharAt()` – Modify characters
- `insert()` – Insert characters
- `delete()` – Remove characters
- `append()` – Add characters at the end

---

## 🔗 Related

- 🔎 Code: [StringBuilderExamples.java]()

---

## 🧠 Practice Problems

Solved all Day 10 String problems again using `StringBuilder` to make string manipulation more efficient. This included:

* **Question 1: Extract the username from an email ID.**  
  [CreateUsername.java]()

* **Question 2: Replace every occurrence of the character 'e' with 'i'.**  
  [replacingCharacter.java]()

* **Question 3: Reverse a string using `StringBuilder` without using built-in `reverse()`.**  
  [reverseString.java]()

* **Question 4: Count total characters (excluding spaces) from a string array input.**  
  [Strings.java]()

---
## 📝 Summary

- `StringBuilder` is mutable and memory-efficient for string operations.
- Key methods:
  - `setCharAt()` — Change a character at a specific index
  - `insert()` — Insert character at a position
  - `delete()` — Remove character(s) from the string
  - `append()` — Add to the end of the string
- Rewrote all Day 10 problems using `StringBuilder` to practice real-world use cases.

---