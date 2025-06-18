/*
📌 Problem:
Find the first and last occurrence index of a character in a given string using recursion.

🧠 Logic:
- Traverse the string recursively from left to right.
- Keep track of:
   🔹 First occurrence (when it's not set yet)
   🔹 Last occurrence (every time after the first match)
- Use static variables to store indices across recursive calls.

📊 Time Complexity:
O(n), where n = length of the string (each character checked once).

💾 Space Complexity:
O(n) due to recursion stack.

⚠️ Edge Cases:
- Character not found → both first and last remain -1.
- Only one occurrence → both first and last may be the same.

💡 Notes:
- Demonstrates recursive string traversal with global (static) tracking.
*/
package Day_15.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class OccurenceIndex {
    static int first = -1;
    static int last = -1;
    public static void getIndices(String data , char element , int index){
        if(index == data.length()){
            return;
        }
        if(data.charAt(index) == element){
            if(first == -1){
                first = index;
            } else {
                last = index;
            }
        }
        getIndices(data , element , index+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your data : ");
        String data = sc.nextLine();
        System.out.print("Enter element you want to find : ");
        char element = sc.next().charAt(0);
        getIndices(data, element, 0);

        System.out.println("First occurence of elemnt " + element + " is : " + first);
        System.out.println("Last occurence of elemnt " + element + " is : " + last);

    }
}