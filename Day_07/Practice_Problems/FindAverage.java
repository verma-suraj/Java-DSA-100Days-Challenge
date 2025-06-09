/*
📌 Problem:
Take three integers from the user and calculate their average using a function.

🧠 Logic:
- Create a function `Average(int a, int b, int c)` that adds the three numbers and divides by 3.
- Call this function from `main()` after taking user input.

⚠️ Edge Cases:
- All inputs are 0 → output is 0
- Integer division truncates decimals, e.g. (5 + 6 + 7) / 3 = 6, not 6.0
- If floating-point precision is needed, use `double` instead of `int`
*/

package Day_07.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class FindAverage{
    public static int Average(int a, int b, int c){
        int x = (a+b+c)/3;
        return x;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        System.out.print("Enter your third number : ");
        int c = sc.nextInt();
        int avg =Average(a, b, c);          //called function here 
        System.out.println("Your average is : " + avg);
    }
}