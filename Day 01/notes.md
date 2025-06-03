# 📝 Day 01: Java Input/Output

---

## ✅ What I Learned

- How to take input from the user using `Scanner` class  
- How to print output using `System.out.print()` and `System.out.println()`  
- Difference between `next()`, `nextLine()`, `nextInt()`, etc.  
- How to handle multiple inputs  
- Common input-related issues and how to avoid them  

---

## 📌 Theory & Key Concepts

### 🔹 Input and Output in Java

Input and output (I/O) are essential for interacting with users or other systems.  
Java provides easy-to-use classes for handling I/O from the console.

### 🔹 Scanner Class for Input

The `Scanner` class in Java is used to read user input from various sources, like keyboard input (`System.in`).  
It supports reading many data types: integers, floats, strings, etc.

Before using `Scanner`, you need to import it:

```java
import java.util.Scanner;
```

Then, create a Scanner object to read input:

```java
Scanner sc = new Scanner(System.in);
```

---

### 🔹 Reading Different Data Types

- `nextInt()`: Reads an integer value  
- `next()`: Reads a single word (until whitespace)  
- `nextLine()`: Reads an entire line including spaces  
- `nextFloat()`: Reads a floating-point number

Example usage:

```java
int number = sc.nextInt();
String word = sc.next();
String line = sc.nextLine();
float price = sc.nextFloat();
```

> **Note:** `next()` reads input until it encounters a space, while `nextLine()` reads the entire line including spaces.

---

### 🔹 Printing Output

You can print text or variables to the console using:

- `System.out.print()`: Prints without moving to a new line  
- `System.out.println()`: Prints and moves to the next line

Example:

```java
System.out.print("Hello ");
System.out.println("World!");
```

Output:

```
Hello World!
```

---

## 🧠 Common Issues & Tips

- When mixing `nextInt()` (or other non-string inputs) with `nextLine()`, you may face an input skipping problem due to leftover newline characters in the input buffer.  
  To fix this, add an extra `sc.nextLine();` after the numeric input to consume the leftover newline.

```java
int age = sc.nextInt();
sc.nextLine();  // Consume the leftover newline
String name = sc.nextLine();
```

- Always close the `Scanner` object when done to free system resources:

```java
sc.close();
```

---

## 🔍 Practice Example

```java
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}
```

---

## 💡 Personal Takeaway

Today I learned how Java handles user input and output through the `Scanner` class and `System.out` methods.  
Understanding the difference between various input methods (`next()`, `nextLine()`, `nextInt()`) and how to handle the newline issue will help me avoid common bugs.  
This foundation will be crucial as I work on more complex input-driven programs.

---

## 🔗 Related

- 🔎 Code: [input_output.java](./input_output.java)
