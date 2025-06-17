/*
📌 Problem:
Calculate the sum of first `x` natural numbers using **standard recursion** (non-tail recursive).

🧠 Logic:
- Use a recursive function `findSum(n, x)` where:
  - `n` is the current number starting from 1.
  - `x` is the upper limit entered by the user.
- Base case: If `n > x`, return 0.
- Recursive step: Return `n + findSum(n+1, x)`.

📊 Time Complexity:
O(x) → One recursive call for each number from 1 to x.

💾 Space Complexity:
O(x) → Each recursive call uses stack memory. Not as optimized as tail recursion.

⚠️ Edge Cases:
- If `x < 1`, the sum is 0.
- Only valid for non-negative integers.

💡 Notes:
- This is a **head-recursive** approach (recursive call is not the last operation).
- Less memory-efficient than tail recursion.
*/
package Day_14.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class sumOfNaturalNumbers{   // standard recursion , less optamized 
    public static int findSum(int n , int x){
        if( n > x){
            return 0;
        }
        return n + findSum(n+1, x);
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n : ");
        int n = 1;
        int x = sc.nextInt();
        int sum = findSum(n, x); ;

        System.out.println("Sum of first " + x + " natural numbers is : " + sum);
    }
}