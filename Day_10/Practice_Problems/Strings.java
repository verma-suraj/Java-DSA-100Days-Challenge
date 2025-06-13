/*
📌 Problem:
Calculate the total number of characters (excluding spaces between inputs) from an array of strings entered by the user.

🧠 Logic:
- Read `n` strings using `nextLine()` to allow full-line input (including spaces).
- Store the strings in an array.
- Use `.length()` method for each string to sum up all characters.

📊 Time Complexity:
O(n * m), where n is number of strings and m is average length per string.

💾 Space Complexity:
O(n * m), for storing strings in the array.

⚠️ Edge Cases:
- Ensure `sc.nextLine()` is used after `sc.nextInt()` to consume leftover newline.
- Handles multi-word strings due to `nextLine()`.
*/
package Day_10.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        sc.nextLine();
        String name[] = new String[n];
        System.out.print("Enter your data : ");

        //Input
        for(int i=0; i<n; i++){
            name[i] = sc.nextLine();
        }

        //Output
        int l = 0;
        for(int i=0; i<n; i++){
            l += name[i].length();
        }
        System.out.print(l);
    }
}