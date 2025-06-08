# 📝 Day 03: Conditional Statements

---

## ✅ What I Learned

- Java conditional control structures
- When and how to use `if`, `if-else`, `if-else-if`, and `switch`
- Importance of `break` to prevent fall-through in `switch`
- Syntax, flow, and nesting possibilities

---

## 🔹 if Statement

```java
if (condition) {
    // Executes if condition is true
}
```

🧠 Example:
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

---

## 🔹 if-else Statement

```java
if (condition) {
    // Executes if condition is true
} else {
    // Executes if condition is false
}
```

🧠 Example:
```java
int number = 5;
if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

---

## 🔹 if-else if-else Ladder

```java
if (condition1) {
    // Executes if condition1 is true
} else if (condition2) {
    // Executes if condition2 is true
} else {
    // Executes if none of the above are true
}
```

🧠 Example:
```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

---

## 🔹 switch Statement

```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

🧠 Example:
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

⚠️ Use `break` to stop checking after a match. Without it, the code will continue running into the next case ("fall-through").

---

## 🔗 Related

- 🔎 Code: [condition_examples.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day%2003/Practice_Problems/condition_examples.java)

### 📚 Practice Problems

* **Question 1: Count how many numbers are zero, positive, or negative until the user exits.**  
  [count_number_types.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day%2003/Practice_Problems/count_number_types.java)

* **Question 2: Classify marks into performance categories with input validation.**  
  [grade_classifier.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day%2003/Practice_Problems/grade_classifier.java)

* **Question 3: Given a number from 1 to 12, print the corresponding month name.**  
  [MonthName.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day%2003/Practice_Problems/MonthName.java)

* **Question 4: Build a simple calculator that performs basic arithmetic operations (+, -, \*, /, %) on two user-input numbers.**  
  [SimpleCalculator.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day%2003/Practice_Problems/MonthName.java)

## 💡 Personal Takeaway

Understanding conditionals gives the power to control the flow of a program. Now, I can make decisions in code, just like we do in real life!