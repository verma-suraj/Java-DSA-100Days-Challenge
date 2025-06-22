/*
📌 Problem:
Remove duplicate characters from a string while preserving the original order.

🧠 Logic:
- Use a boolean array of size 26 to track whether a character ('a' to 'z') has already appeared.
- Traverse the input string character by character.
- If a character has not been seen before, append it to the new string and mark it as seen.
- If it's a duplicate, skip it.
- Use recursion to handle each character one by one.

📊 Time Complexity:
O(n), where n is the length of the input string.

💾 Space Complexity:
O(n) for newString + O(1) for the boolean map (fixed size of 26).

⚠️ Notes:
- Assumes input contains only lowercase English letters.
- Uses static boolean array to maintain state across recursive calls.

✅ Purpose:
To demonstrate character filtering, recursion, and use of auxiliary data structures (boolean array).
*/
package Day_16.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class removeDuplicateString{
    public static boolean[] map = new boolean[26];
public static void removeDuplicate(String str , int index , String newString){
    if(index == str.length()){
        System.out.print(newString);
        return;
    }
    char currentChar = str.charAt(index);
    if(map[currentChar - 'a'] == true){
        removeDuplicate(str , index+1 , newString);
    } else{
        newString += currentChar;
        map[currentChar - 'a'] = true;
        removeDuplicate(str , index+1 , newString);
    }
}
public static void main(String args[]){
    String str = "abbccda";         //you change the string to check different cases 
    removeDuplicate(str , 0 , "");
}
}