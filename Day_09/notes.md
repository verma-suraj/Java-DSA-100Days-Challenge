# 📘 Day 09: Arrays in Java

Arrays are one of the most fundamental data structures used to store multiple values of the same type in a single variable.

---

## 📌 What is an Array?

An **array** is a container object that holds a fixed number of values of a single data type.

```java
int[] arr = new int[5];  // Declaration + Memory allocation
```

---

## 🧠 Key Concepts

| Concept                  | Description |
|--------------------------|-------------|
| Fixed Size               | The size of an array is defined at the time of creation and cannot be changed. |
| Zero-based Indexing      | Indexing starts from 0 (i.e., first element is at index 0). |
| Homogeneous Elements     | All elements in the array must be of the same type. |
| Stored in Heap           | Arrays in Java are objects and are stored in heap memory. |

---

## 🧮 Array Declaration

### ➤ 1D Array

```java
int[] numbers = new int[5]; // Default values = 0
int[] nums = {10, 20, 30, 40}; // Direct initialization
```

### ➤ 2D Array

```java
int[][] matrix = new int[3][4]; // 3 rows, 4 columns
int[][] table = {
    {1, 2, 3},
    {4, 5, 6}
};
```

---

## 🔁 Input & Output of Arrays

### ✅ 1D Array Input

```java
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}
```

### ✅ 1D Array Output

```java
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

OR using enhanced for loop:

```java
for(int num : arr) {
    System.out.print(num + " ");
}
```

---

### ✅ 2D Array Input

```java
Scanner sc = new Scanner(System.in);
int[][] matrix = new int[3][4];  // 3 rows, 4 columns
for(int i = 0; i < matrix.length; i++) {
    for(int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = sc.nextInt();
    }
}
```

### ✅ 2D Array Output

```java
for(int i = 0; i < matrix.length; i++) {
    for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

OR using enhanced for loop:

```java
for(int[] row : matrix) {
    for(int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```

---

## 📏 Array Length

```java
arr.length  // Gives total number of elements in 1D array
matrix.length        // Number of rows
matrix[0].length     // Number of columns in first row
```

---

## 🛠️ Array Index & Errors

- Accessing an index out of bounds throws:
```java
ArrayIndexOutOfBoundsException
```

---

## 🔄 Modifying Arrays

```java
arr[2] = 100; // Change value at index 2 in 1D array
matrix[1][3] = 50; // Change value at row 1, column 3 in 2D array
```

---

## 📚 Types of Arrays

- **1D Arrays**: `int[] arr = new int[5];`
- **2D Arrays**: `int[][] matrix = new int[3][4];`
- Multi-dimensional arrays are arrays of arrays.

---

## 🔗 Related

- 🔎 Code: [arrays.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/arrays.java)

### 📚 Practice Problems

* **Question 1: Check if the input array is sorted in ascending order.**  
  [ArrayAscending.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/ArrayAscending.java)

* **Question 2: Find the maximum and minimum values from an integer array input by the user.**  
  [ArrayMaxMin.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/ArrayMaxMin.java)

* **Question 3: Take an array input from the user, then search for a given number `x` and print the index where it is found.**  
  [ArrayQue.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/ArrayQue.java)

* **Question 4: Take the size of an array from the user and input that many names. Then, print greetings for each name in the format: "Hello `<name>`!"**  
  [ArrayQueNames.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/ArrayQueNames.java)

* **Question 5: Search for a number in a 2D array and print its position (row, column) if found.**  
  [PrintArrayIndex.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/PrintArrayIndex.java)

* **Question 6: Find the transpose of a given matrix. (Transpose is obtained by swapping rows and columns)**  
  [TransposeOfMatrix.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/TransposeOfMatrix.java)

* **Question 7: Take input for a 2D array (matrix) of given dimensions and print the matrix in row-wise format.**  
  [TwoDArrays.java](https://github.com/verma-suraj/Java-DSA-100Days-Challenge/blob/a1a9de943820efb8c9b61ba1c6b5545df0ecff1d/Day_09/Practice_Problems/TwoDArrays.java)



## 🧠 Summary

- Arrays store elements of same type in contiguous memory.
- Declared with size or initialized directly.
- Use `.length` for size and loops for traversal.
- Arrays are fixed in size, stored in heap, and indexed from 0.
- 2D arrays require nested loops for traversal and modification.

---
