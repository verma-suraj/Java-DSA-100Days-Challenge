/*
📌 Problem:
Print the given string in reverse order using recursion.

🧠 Logic:
- Start printing from the last character (at `index`).
- Recursively call the function with the previous index (`index-1`).
- Base case: when `index` reaches 0, print the first character and stop recursion.

📊 Time Complexity:
O(n), where n = length of the string (each character is printed once).

💾 Space Complexity:
O(n) due to recursion stack.

⚠️ Edge Cases:
- Empty string is not handled explicitly, but works fine since length-1 would be -1 and recursion won't start.

💡 Notes:
- Prints characters from the end towards the beginning.
- Demonstrates recursion by reducing the problem size on each call.
*/
package Day_15.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class PrintRevString{
    public static void PrintRev(String str , int index){
        if(index == 0 ){
            System.out.print(str.charAt(0));
            return;

        }
        System.out.print(str.charAt(index));
        PrintRev(str, index-1);
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        System.out.print("Your reversed string is : ");
        PrintRev(str, str.length()-1);
        sc.close();
    }
}