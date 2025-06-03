# 📝 Day 01: Java Input/Output

---

## ✅ What I Learned

- How to take input from the user using `Scanner` class  
- How to print output using `System.out.print()` and `System.out.println()`  
- Difference between `next()`, `nextLine()`, `nextInt()`, etc.  
- How to handle multiple inputs  
- Common input-related issues and how to avoid them  

---

## 📌 Key Concepts

### 🔹 Importing Scanner

To use `Scanner`, we need to import it from the `java.util` package:

```java
import java.util.Scanner;
```

---

### 🔹 Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

---

### 🔹 Taking Different Types of Input

```java
int number = sc.nextInt();         // For integers
String word = sc.next();           // For a single word
String line = sc.nextLine();       // For full line input
float price = sc.nextFloat();      // For float values
```

> 🔸 `next()` reads a single word (stops at space), while `nextLine()` reads the entire line including spaces.

---

### 🔹 Output in Java

```java
System.out.print("Hello ");       // Prints on same line
System.out.println("World!");     // Prints and moves to next line
```

---

## 🧠 Tips & Edge Cases

- After using `nextInt()` or `next()`, if you use `nextLine()`, it may skip input because of leftover newline characters. Use an extra `sc.nextLine();` to clear it.

```java
int age = sc.nextInt();
sc.nextLine(); // clear buffer
String name = sc.nextLine();
```

- Always close the `Scanner` object after use to avoid memory leaks:

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

Today I learned how user input actually works in Java and the difference between various input methods.  
I also faced the classic `nextLine()` skip issue after using `nextInt()`, but now I understand why and how to fix it.  
This will help a lot going forward when dealing with real input-heavy programs.

---

## 🔗 Related

- 🔎 Code: [input_output.java](./input_output.java)
