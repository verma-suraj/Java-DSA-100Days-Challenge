/*
📌 Problem:
Calculate the sum of first `n` natural numbers using **tail recursion** (optimized recursion).

🧠 Logic:
- Use a recursive function `findSum(n, sum)` where `sum` accumulates the result.
- Base condition: When `n == 0`, print the total sum.
- Recursive step: Add current `n` to `sum` and call `findSum(n-1, sum)`.

📊 Time Complexity:
O(n) → One recursive call per number from n to 1.

💾 Space Complexity:
O(n) → Call stack (tail recursion may be optimized by compiler to O(1) in some cases).

⚠️ Edge Cases:
- If n = 0, output is 0.
- Input should be a non-negative integer.

💡 Notes:
- This is a **tail-recursive** version of the sum function, which is more memory-efficient.
*/
package Day_14.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class sumOfnNumbers{     //tail recursion sum , more optimized 
    public static void findSum(int n , int sum){
        if( n == 0){
            System.out.println("Your sum of n natural numbers is : " + sum);
            return;
        }
        sum += n;
        findSum(n-1, sum);
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n : ");
        int n = sc.nextInt();
        findSum(n, 0)   ;    
    }
}