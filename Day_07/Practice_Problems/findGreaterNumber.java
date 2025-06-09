/*
📌 Problem:
Take two integers as input and print the greater of the two using a function.

🧠 Logic:
- Use an `if-else` structure inside a function to compare the two numbers.
- If both numbers are equal, print a message and return either number.
- In the main method, print the result with appropriate labeling.

⚠️ Edge Cases:
- a == b → Both numbers are equal (you’re handling this well!)
- Very large or very small integers → Java handles them fine with `int` (up to ~2 billion)
*/
package Day_07.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class findGreaterNumber{
    public static int GreaterNumberIs(int a, int b){
        //int i = 0;
        if(a == b){
            System.out.print("Both Numbers are equal!");
            return a;
        }
        else if(a>b){
            return a;
        } else {
            return b;
        }
       // return i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter your second number : ");
        int b = sc.nextInt();
        if(a != b){
            System.out.print(GreaterNumberIs(a,b) + " is greater");      //Here we called function directly in print statement.
        } 
        else{
            GreaterNumberIs(a, b);
        }
        
        sc.close();
    }
    
}
