/*
📌 Problem:
Calculate the sum of the first n natural odd numbers.

🧠 Logic:
- The sum of the first n odd numbers is n² (square of n).
- Take input n from the user.
- Return n * n as the sum.
- Print the result.

⚠️ Edge Cases:
- No validation if n is negative or zero (ideally should be positive).
- No input validation for non-integer inputs.
*/
package Day_07.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class sumOfOddNumbers{
    public static int sumOfOdd(int n){
        int x = n*n;
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        //sumOfOdd(n);
        System.out.print("Your sum of first n natural odd numbers is : " + sumOfOdd(n));
        sc.close();

    }
}