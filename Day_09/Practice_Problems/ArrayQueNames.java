/*
📌 Problem:
Take the size of an array from the user and input that many names.
Then, print greetings for each name in the format: "Hello <name>!"

🧠 Logic:
- Ask user for array size
- Use a for loop to input each name into the array
- Use another for loop to iterate and print greetings for each name

📊 Time Complexity:
O(n) — where n is the number of names (2 separate loops of O(n) each)

💾 Space Complexity:
O(n) — for storing the names in the array

⚠️ Edge Cases:
- size = 0 → no output, should not crash
- Unexpected characters in names are still accepted, since no validation is applied
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class ArrayQueNames{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];
        //Array input
        for(int i=0; i<size; i++){
           System.out.print("Enter the names : ");
            names[i] = sc.next();
        }
        
        //output
        for(int i=0; i<names.length; i++){
            System.out.println("Hello " + names[i] + "!");
        }
    }
}