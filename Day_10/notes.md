# 📚 Day 10: Strings in Java

In Java, strings are one of the most commonly used data types. Today’s notes cover string declaration, input, built-in functions, and important properties of strings.

---

## 🧵 String Declaration

```java
String name = "Suraj";
```

This is a simple way to declare a string in Java.

---

## 🧾 Taking Input in Strings

```java
Scanner sc = new Scanner(System.in);

// Takes only one word (up to first space)
String name = sc.next();

// Takes the whole line including spaces
String fullName = sc.nextLine();
```

---

## 🔧 Common String Functions

### 1. **Concatenation (Joining Strings)**

```java
String firstName = "Suraj";
String lastName = "Verma";
String fullName = firstName + " " + lastName;

System.out.print(fullName);
```

**Output:**
```
Suraj Verma
```

---

### 2. **Length of a String**

```java
System.out.print(fullName.length());
```

**Output:**
```
11
```
> "Suraj Verma" contains 11 characters including the space.

---

### 3. **Accessing Characters Using `.charAt()`**

```java
String name = "Suraj";
System.out.print(name.charAt(4));
```

**Output:**
```
j
```
> Indexing in Java starts from 0, so `charAt(4)` gives the 5th character.

---

### 4. **Comparing Strings with `.compareTo()`**

```java
String name1 = "Suraj";
String name2 = "Suraj";

if(name1.compareTo(name2) == 0) {
    System.out.print("Strings are equal");
}
```

**Output:**
```
Strings are equal
```

**How `compareTo()` works:**
- Returns `0` → if both strings are equal  
- Returns `+ve` → if `name1 > name2`  
- Returns `-ve` → if `name1 < name2`

---

### 5. **Substring Extraction**

```java
String sentence = "My name is Suraj";

// Using full form
String name = sentence.substring(11, sentence.length());

// Or using shorthand
String name = sentence.substring(11);

System.out.print(name);
```

**Output:**
```
Suraj
```

> Note: `substring(start, end)` includes `start` but **excludes** `end`.

---

## 📌 Important Concepts

### 🔒 Strings are Immutable

- Once created, strings cannot be modified.
- Operations on strings return new string objects.

---

## 🔁 Type Conversions

### 1. **String → Integer**
```java
String str = "123";
int num = Integer.parseInt(str);
```

### 2. **Integer → String**
```java
int num = 123;
String str = Integer.toString(num);
```

---
## 🔗 Related

- 🔎 Code: [Strings_demo.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/b20b54a2179bd7b14c58174b823329f7ab5eecc8/Day_10/Practice_Problems/Strings_demo.java)

---

### 📚 Practice Problems

* **Question 1: Extract the username from an email ID.**  
  [CreateUsername.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/b20b54a2179bd7b14c58174b823329f7ab5eecc8/Day_10/Practice_Problems/CreateUsername.java)

* **Question 2: Replace every occurrence of the character 'e' with 'i'.**  
  [replacingCharacter.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/b20b54a2179bd7b14c58174b823329f7ab5eecc8/Day_10/Practice_Problems/replacingCharacter.java)

* **Question 3: Reverse a string using `StringBuilder` without using built-in `reverse()`.**  
  [reverseString.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/b20b54a2179bd7b14c58174b823329f7ab5eecc8/Day_10/Practice_Problems/reverseString.java)

* **Question 4: Count total characters (excluding spaces) from a string array input.**  
  [Strings.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/b20b54a2179bd7b14c58174b823329f7ab5eecc8/Day_10/Practice_Problems/Strings.java)

---

## 🧠 Summary

- Strings in Java are objects backed by `char[]` arrays.
- Use `.length()`, `.charAt()`, `.compareTo()`, `.substring()` for string manipulations.
- Strings are immutable — operations return a new string.
- Use `StringBuilder` for efficient and mutable string operations.
