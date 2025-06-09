/*
📌 Problem:
Calculate the Greatest Common Divisor (GCD) of two integers entered by the user using the Euclidean algorithm.

🧠 Logic:
- Read two integers from the user.
- Use the Euclidean algorithm to find the GCD:
  - While second number (b) is not zero:
    - Store b in a temp variable.
    - Update b to a % b.
    - Update a to temp.
  - When b becomes zero, a holds the GCD.
- Print the GCD.

⚠️ Edge Cases:
- Negative numbers are not explicitly handled (can cause unexpected behavior).
- Very large inputs may cause integer overflow or input mismatch exceptions.
- No validation if inputs are integers.
- Zero input handled gracefully by Euclidean algorithm (GCD with 0 is the other number).
*/
package Day_07.Practice_Problems;       //ignore this if you are copying this code to run locally!!

import java.util.*;
public class GCD{
    public static int FindGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.print("Enter your first number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();  //have limit if users enters large number it will show error
        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();

        int gcd = FindGCD(num1 , num2);         //Function is called here
        System.out.print("GCD of " + num1 + " and " + num2 + " is : " + gcd);
        sc.close();
    }
}