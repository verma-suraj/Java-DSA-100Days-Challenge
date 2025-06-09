# 📝 Day 07: Functions in Java

---

## ✅ What I Learned

- Functions are reusable blocks of code designed to perform a specific task.
- Java has two types of functions:
  - **Predefined Functions** (e.g., `Math.sqrt()`, `System.out.println()`)
  - **User-defined Functions** created with custom logic using `returnType functionName(params)`
- Function declaration syntax:
  ```java
  returnType functionName(parameters) {
      // function body
      return value;
  }
  ```
- `return` keyword sends a value back to the caller and ends function execution.
- **Function call**: Simply use the function name with appropriate arguments.
- Java executes the `main()` function first.

---

## 🧠 Key Concepts

| Concept | Description |
|--------|-------------|
| `void` | A return type meaning the function returns nothing |
| Parameters | Values passed into a function for it to use |
| Arguments | Actual values passed when the function is called |
| Method Overloading | Defining multiple methods with the same name but different parameters |
| Scope | Variables defined inside a function are local to that function |

---

## ✏️ Example Functions

### 1. Sum of Two Numbers
```java
public static int sum(int a, int b) {
    return a + b;
}
```

### 2. Factorial of a Number
```java
public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

### 3. Check Prime
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

---

## 🔗 Related

- 🔎 Code: [FunctionsExamples.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_07/Functions_Problems/FunctionsExamples.java)

### 📚 Practice Problems

* **Question 1: Find the average of 3 numbers using a function.**  
  [FindAverage.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_07/Functions_Problems/FindAverage.java)

* **Question 2: Print the sum of odd numbers from 1 to N.**  
  [sumOfOddNumbers.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_07/Functions_Problems/sumOfOddNumbers.java)

* **Question 3: Find GCD (Greatest Common Divisor) of two numbers.**  
  [GCD.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_07/Functions_Problems/GCD.java)

* **Question 4: Find the greater of two numbers using a function.**  
  [findGreaterNumber.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_07/Functions_Problems/findGreaterNumber.java)

---

## 🚀 Learning Reflection

Functions make code modular and readable. I now understand how breaking problems into smaller reusable units is a key software engineering skill. This day built the foundation for solving bigger problems efficiently.
