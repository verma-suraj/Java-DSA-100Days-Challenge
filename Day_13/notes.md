# 📊 Sorting in Java — Day 13 of #100DaysOfCode

Sorting is a fundamental concept in DSA that helps in organizing data in a particular order (ascending or descending). Today, I learned and implemented the three basic sorting algorithms:

---

## 🔁 1. Bubble Sort

Bubble Sort repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. This process is repeated until the array is sorted.

### 🔹 How it Works:
- Compare adjacent elements
- Swap if left > right
- Largest element "bubbles up" to the end in each pass

### 📦 Time Complexity:
- **Best Case:** O(n) [Already Sorted]
- **Average/Worst Case:** O(n²)

### ✅ Space Complexity:
- O(1) (In-place sorting)

### 📌 Java Code:
```java
public class BubbleSort {
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);
    }
}
```

---

## 🎯 2. Selection Sort

Selection Sort divides the array into two parts: sorted and unsorted. It repeatedly picks the smallest element from the unsorted part and puts it at the beginning.

### 🔹 How it Works:
- Find the minimum element from unsorted part
- Swap it with the first unsorted element
- Repeat for rest of the array

### 📦 Time Complexity:
- **Best, Average, Worst Case:** O(n²)

### ✅ Space Complexity:
- O(1) (In-place)

### 📌 Java Code:
```java
public class SelectionSorting {
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};
        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }
}
```

---

## 🧩 3. Insertion Sort

Insertion Sort builds the final sorted array one item at a time. It takes the current element and places it at its correct position in the already sorted part of the array.

### 🔹 How it Works:
- Start from index 1, treat it as current
- Compare it backward with sorted elements
- Shift elements and insert current at the correct place

### 📦 Time Complexity:
- **Best Case:** O(n) [Already Sorted]
- **Average/Worst Case:** O(n²)

### ✅ Space Complexity:
- O(1) (In-place)

### 📌 Java Code:
```java
public class InsertionSorting {
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7, 8, 3, 1, 2};
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        PrintArray(arr);
    }
}
```

---

## 🧠 Summary Table

| Algorithm        | Time Complexity (Best) | Time Complexity (Worst) | Space | Stability   | In-place |
|------------------|------------------------|--------------------------|-------|-------------|----------|
| Bubble Sort      | O(n)                   | O(n²)                    | O(1)  | ✅ Stable   | ✅ Yes   |
| Selection Sort   | O(n²)                  | O(n²)                    | O(1)  | ❌ Unstable | ✅ Yes   |
| Insertion Sort   | O(n)                   | O(n²)                    | O(1)  | ✅ Stable   | ✅ Yes   |

---

📌 All these are comparison-based **in-place sorting** algorithms. For large data or better performance, we use advanced algorithms like Merge Sort, Quick Sort, etc.

---

## 🧩 Practice Note

This topic involves standard sorting algorithms (Bubble, Selection, Insertion) that follow fixed patterns. The logic remains exactly the same across all problems — only the array input differs.

👉 Hence, no separate `Practice_Problems/` folder is added for Day 13.  
Instead, try modifying the input array in the provided code examples to strengthen your understanding.
