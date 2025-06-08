# 📝 Day 02: Data Types, Variables, and Operators

---

## ✅ What I Learned

- Java data types (primitive and non-primitive)
- Variable declaration, naming conventions, and scopes
- Java operators: arithmetic, relational, logical, bitwise, assignment
- Binary number system and bit-level operations
- Scanner methods for handling different input types

---

## 🧠 Data Types

### 🔹 Primitive Data Types

| Data Type | Size     | Example                 | Purpose                     |
|-----------|----------|-------------------------|-----------------------------|
| byte      | 1 byte   | `byte b = 100;`         | Small integers              |
| short     | 2 bytes  | `short s = 1000;`       | Larger than byte            |
| int       | 4 bytes  | `int x = 50000;`        | Most used integer type      |
| long      | 8 bytes  | `long l = 100000L;`     | Very large numbers          |
| float     | 4 bytes  | `float f = 10.5f;`      | Decimal (less precision)    |
| double    | 8 bytes  | `double d = 99.99;`     | Decimal (more precision)    |
| char      | 2 bytes  | `char c = 'A';`         | Single character            |
| boolean   | 1 bit    | `boolean b = true;`     | True or false               |

---

### 📥 Scanner Syntax for Declaring All Primitive Data Types

```java
Scanner sc = new Scanner(System.in);

// Integer types
byte b = sc.nextByte();
short s = sc.nextShort();
int i = sc.nextInt();
long l = sc.nextLong();

// Floating-point types
float f = sc.nextFloat();
double d = sc.nextDouble();

// Character input
char c = sc.next().charAt(0);  // Read first character from input string

// Boolean
boolean bool = sc.nextBoolean();
```

🧠 **Notes**:
- Java does not have `nextChar()`, so we use `next().charAt(0)` to get a single character.
- Always ensure valid input format to prevent exceptions.
- Add `import java.util.Scanner;` at the top of your Java program.

---


## 💡 Variables

- Declare: `int age;`
- Initialize: `age = 25;`
- Combined: `int age = 25;`
- Naming rules: must start with letter, `_`, or `$`; no spaces; case-sensitive

---

## 📥 Scanner Methods

| Method            | Description                          |
|------------------|--------------------------------------|
| `hasNext()`       | Checks for any token                 |
| `hasNextInt()`    | Checks for an integer                |
| `hasNextDouble()` | Checks for a double                  |
| `hasNextLine()`   | Checks for full line input           |
| `hasNextBoolean()`| Checks for boolean input             |

---

## 🔢 Unary Operators

| Operator | Meaning        |
|----------|----------------|
| `++`     | Increment by 1 |
| `--`     | Decrement by 1 |

### 🔁 Pre-Increment vs Post-Increment

```java
int a = 10;
int b = 0;

b = ++a; // Pre-Increment
System.out.println(a); // 11
System.out.println(b); // 11

b = a++; // Post-Increment
System.out.println(a); // 10
System.out.println(b); // 11
```

---

## ➗ Arithmetic Operators

| Operator | Description     |
|----------|-----------------|
| `+`      | Addition         |
| `-`      | Subtraction      |
| `*`      | Multiplication   |
| `/`      | Division         |
| `%`      | Modulus (remainder) |

---

## 🔍 Relational Operators

| Operator | Description         |
|----------|---------------------|
| `==`     | Equal to            |
| `!=`     | Not equal to        |
| `>`      | Greater than        |
| `<`      | Less than           |
| `>=`     | Greater or equal    |
| `<=`     | Less or equal       |

---

## 🧠 Logical Operators

| Operator | Description     |
|----------|-----------------|
| `&&`     | Logical AND      |
| `||`     | Logical OR       |
| `!`      | Logical NOT      |

### 🧪 Logical Truth Table

| Operation | Stmt1 | Stmt2 | Result |
|-----------|-------|-------|--------|
| `AND`     | T     | T     | T      |
|           | T     | F     | F      |
|           | F     | T     | F      |
|           | F     | F     | F      |
| `OR`      | T     | T     | T      |
|           | T     | F     | T      |
|           | F     | T     | T      |
|           | F     | F     | F      |

---

## 🔢 Binary Number System (Base 2)

| Decimal | Binary |
|---------|--------|
| 0       | 000    |
| 1       | 001    |
| 2       | 010    |
| 3       | 011    |
| 4       | 100    |
| 5       | 101    |
| 6       | 110    |
| 7       | 111    |
| 8       | 1000   |
| 9       | 1001   |

---

## ⚙️ Bitwise Operators

Let `A = 0101` and `B = 0110`

| Symbol | Name                 | Operation | Result | Execution View                                                                                                      | Logic Table                                     |
|--------|----------------------|-----------|--------|---------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|
| `&`    | Binary AND           | A & B     | 0100   | <pre style="margin: 0; padding: 0; line-height: 1.2;">  0101<br>& 0110<br>-----<br>  0100</pre>                   | `0 & 0 = 0`<br>`0 & 1 = 0`<br>`1 & 0 = 0`<br>`1 & 1 = 1` |
| `\|`   | Binary OR            | A `\|` B  | 0111   | <pre style="margin: 0; padding: 0; line-height: 1.2;">  0101<br>\| 0110<br>-----<br>  0111</pre>                   | `0 \| 0 = 0`<br>`0 \| 1 = 1`<br>`1 \| 0 = 1`<br>`1 \| 1 = 1` |
| `^`    | Binary XOR           | A ^ B     | 0011   | <pre style="margin: 0; padding: 0; line-height: 1.2;">  0101<br>^ 0110<br>-----<br>  0011</pre>                   | `0 ^ 0 = 0`<br>`0 ^ 1 = 1`<br>`1 ^ 0 = 1`<br>`1 ^ 1 = 0` |
| `~`    | One's Complement     | ~A        | 1010   | <pre style="margin: 0; padding: 0; line-height: 1.2;">~0101 = 1010</pre>                                            | `~0 = 1`<br>`~1 = 0`                            |
| `<<`   | Binary Left Shift    | A << 1    | 1010   | <pre style="margin: 0; padding: 0; line-height: 1.2;">0101 << 1 = 1010</pre>                                       | Shifts all bits left and inserts 0 at right     |
| `>>`   | Binary Right Shift   | B >> 1    | 0011   | <pre style="margin: 0; padding: 0; line-height: 1.2;">0110 >> 1 = 0011</pre>                                       | Shifts all bits right and inserts 0 at left     |
---

## 📝 Assignment Operators

| Operator | Equivalent |
|----------|------------|
| `=`      | `a = b`    |
| `+=`     | `a = a + b`|
| `-=`     | `a = a - b`|
| `*=`     | `a = a * b`|
| `/=`     | `a = a / b`|
| `%=`     | `a = a % b`|

---

## 💡 Personal Takeaway

Learning operators helped me understand how machines process decisions and data. Bitwise operations felt like working at the binary level of computing. Logical operators helped visualize program flow better. Loved today’s depth!

---

## 🔗 Related

### 📚 Practice Problems

* **Question 1: Declare and print all primitive data types.** [Link](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_02/Practice_Problems/declare_primitive_variables.java)  
* **Question 2: Perform arithmetic and relational operations on 2 inputs.** [Link](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/main/Day_02/Practice_Problems/arithmetic_relational_operations.java)
