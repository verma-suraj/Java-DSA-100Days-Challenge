# 📝 Day 04: Loops in Java

---

## ✅ What I Learned

Java provides three main types of loops to repeat a block of code:

---

### 🔁 1. `while` Loop

Used when the number of iterations is **not known** in advance. Condition is checked **before** execution.

#### 🧩 Syntax

```java
while (condition) {
    // do something
}
```

#### ✅ Example

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

#### 🔍 Output
```
1
2
3
4
5
```

---

### 🔁 2. `do-while` Loop

Ensures the loop body runs **at least once**, as the condition is checked **after** execution.

#### 🧩 Syntax

```java
do {
    // do something
} while (condition);
```

#### ✅ Example

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

#### 🔍 Output
```
1
2
3
4
5
```

---

### 🔁 3. `for` Loop

Best when the number of iterations is **known**. All loop parts are in one line.

#### 🧩 Syntax

```java
for (initialization; condition; updatation) {
    // do something
}
```

#### ✅ Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

#### 🔍 Output
```
1
2
3
4
5
```

---

## 🧠 Loop Control Statements

### 🔸 `break`

Exits the loop immediately.

#### ✅ Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

#### 🔍 Output
```
1
2
```

| Statement | Purpose            | Use Case              | Related            | Personal Takeaway                        |
|-----------|--------------------|------------------------|--------------------|------------------------------------------|
| `break`   | Exit the loop       | Stop on a condition    | Switch, nested loops | Helpful in searching or early exit cases |

---

### 🔸 `continue`

Skips the current iteration and moves to the next.

#### ✅ Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```

#### 🔍 Output
```
1
2
4
5
```

| Statement   | Purpose              | Use Case                   | Related         | Personal Takeaway                            |
|-------------|----------------------|-----------------------------|------------------|----------------------------------------------|
| `continue`  | Skip current loop step | Ignore certain conditions  | Filtering logic  | Helped me avoid unwanted prints in patterns  |

---

## 📌 Summary Table

| Loop Type    | Condition Checked | Runs At Least Once | Best Used When        | Related           | Personal Takeaway                          |
|--------------|-------------------|--------------------|------------------------|-------------------|--------------------------------------------|
| `while`      | Before            | ❌                 | Condition is uncertain | Infinite loops    | Helped me build logic for user input       |
| `do-while`   | After             | ✅                 | Run once minimum       | Menu-driven apps  | Guarantees one-time execution              |
| `for`        | Before            | ❌                 | Fixed iteration count  | Arrays, patterns  | Makes pattern problems clean & simple      |

---

## 🔗 Related

- 🔎 Code: [loop_examples.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/7b5583b41dd8da4b19ab5323b83fd0500c66a856/Day%2004/Practice_Problems/loop_examples.java)

### 📚 Practice Problems

* **Question 1: Print numbers from 1 to N using all three loops.**  
  [PrintNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/7b5583b41dd8da4b19ab5323b83fd0500c66a856/Day%2004/Practice_Problems/PrintNumbers.java)

* **Question 2: Keep taking input until user enters 0 (using while loop).**  
  [InputUntilZero.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/7b5583b41dd8da4b19ab5323b83fd0500c66a856/Day%2004/Practice_Problems/InputUntilZero.java)

* **Question 3: Print the sum of first N natural numbers (using for loop).**  
  [SumNaturalNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/7b5583b41dd8da4b19ab5323b83fd0500c66a856/Day%2004/Practice_Problems/SumOfNaturalNumbers.java)

* **Question 4: Check if a given number entered by the user is a prime number or not. (using for loop).**  
  [PrimeNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/7b5583b41dd8da4b19ab5323b83fd0500c66a856/Day%2004/Practice_Problems/PrimeNumbers.java)

---

## 💡 Personal Takeaway

Loops helped me understand how to repeat tasks efficiently.  
The `for` loop made pattern problems easier, while `while` and `do-while` helped with input-based logic.  
Now, I feel more confident about writing reusable and dynamic code!
