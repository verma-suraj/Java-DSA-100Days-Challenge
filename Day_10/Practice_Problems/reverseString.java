/*
📌 Problem:
Reverse a given string using `StringBuilder` in Java without using any built-in reverse function.

🧠 Logic:
- Read a string from the user.
- Convert it into a `StringBuilder` object for easy character manipulation.
- Swap characters from the front and back moving towards the center.
- Print the reversed string.

📊 Time Complexity:
O(n/2) → effectively O(n), where n is the length of the string.

💾 Space Complexity:
O(n) for the `StringBuilder` storing the reversed string.

⚠️ Edge Cases:
- If string length is 0 or 1, the result is the same as input.
- Case-sensitive and whitespace-sensitive.
*/
package Day_10.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class reverseString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        StringBuilder sb = new StringBuilder(name);

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back , frontChar);
        }
        System.out.print("Reverse name is : " + sb);
    }
}