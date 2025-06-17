/*
📌 Problem:
Print the first `n` terms of the **Fibonacci Series** using recursion.

🧠 Logic:
- Fibonacci series starts with: 0, 1, 1, 2, 3, 5, 8, ...
- Each term is the sum of the previous two.
- The recursive function takes three parameters:
  → `a` = first term,  
  → `b` = second term,  
  → `n` = number of terms left to print

- Base case:
  If `n == 0`, stop the recursion.
- Recursive step:
  Print `a`, then call the function with new values:
  → `PrintFibonacci(b, a+b, n-1)`

📊 Time Complexity:
O(n) → One recursive call for each term to be printed.

💾 Space Complexity:
O(n) → Due to recursion stack.

⚠️ Edge Cases:
- Does not handle negative input or print a message for `n <= 0`.

💡 Notes:
- This version prints the **first n terms** starting from 0.
- This is a **tail-recursive** style function.
- Easy and clean approach for practicing recursion with sequences.
*/
package Day_14.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class FibonacciSeries{
    public static void PrintFibonacci(int a, int b, int n){
        if( n == 0){
            return;
        }
        
        System.out.print(a + " ");
        PrintFibonacci(b, a+b , n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series upto " + n + " terms is : ");
        PrintFibonacci(0, 1, n);

    }
}