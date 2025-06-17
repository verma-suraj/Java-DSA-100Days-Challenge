/*
📌 Problem:
Find the factorial of a number using **recursion**.

🧠 Logic:
- Factorial of a number `n` is defined as:  
  `n! = n * (n-1) * (n-2) * ... * 1`
- Special cases:
  - `0! = 1`
  - `1! = 1`
- Use recursion:
  - Base case: If `n == 0` or `n == 1`, return 1
  - Recursive step: return `n * factorial(n - 1)`

📊 Time Complexity:
O(n) → One recursive call for each number from `n` down to `1`.

💾 Space Complexity:
O(n) → Each recursive call uses stack memory.

⚠️ Edge Cases:
- Negative inputs are not handled.
- Factorial grows very fast — use long or BigInteger for larger values.

💡 Notes:
- This is a classic example of **head recursion**.
- Clean and readable approach for learning recursion.
*/
package Day_14.Practice_Problems;           //ignore this if you are copying this code to run locally!!
 
import java.util.*;

public class Factorial{
    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        } else if(n == 1){
            return 1;
        }
        return n * printFactorial(n-1);


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the to find factorial : ");
        int n = sc.nextInt();
        int result = printFactorial(n);
        System.out.println("Factorial of " + n + " is : " + result);
    }
}