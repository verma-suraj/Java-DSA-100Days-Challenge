/*
📌 Problem:
Print numbers from 1 to a given number `x` using recursion.

🧠 Logic:
- Define a recursive function `PrintNumb(n, x)` that prints numbers from `n` to `x`.
- Base condition: If `n > x`, stop the recursion.
- Recursive step: Print current `n`, then call the function with `n + 1`.

📊 Time Complexity:
O(x - n) → O(x) where x is the input number.

💾 Space Complexity:
O(x - n) stack frames due to recursive calls.

⚠️ Edge Cases:
- If `x < 1`, the function will terminate immediately without printing.
*/
package Day_14.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class RecursionPrintNumb{
    public static void PrintNumb(int n , int x){
        if( n > x){
            return;
        }
        System.out.println(n);
        PrintNumb(n+1 , x);
        
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of n : " );
        int x = sc.nextInt();
        int n = 1;
        System.out.println("Your series is :- ");
        PrintNumb(n , x);
    }
}