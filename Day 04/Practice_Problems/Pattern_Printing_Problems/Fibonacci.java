/*
📌 Problem:
Print the first 'n' terms of the Fibonacci sequence.
The Fibonacci series is: 0, 1, 1, 2, 3, 5, 8, 13...

🧠 Logic:
- Start with two variables: a = 0, b = 1
- Loop from i = 0 to n - 1:
    - Print 'a'
    - Calculate next term: next = a + b
    - Update: a = b, b = next

⚠️ Edge Cases:
- n = 0 → No output
- n = 1 → Output: 0
- n < 0 → Invalid input, though currently not handled
*/

package Pattern_Printing_Problems;      //ignore this if you are copying this code to run locally!!

import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n : ");
        int n = sc.nextInt();
        int a = 0 , b = 1;

        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}