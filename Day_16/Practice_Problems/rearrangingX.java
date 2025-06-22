/*
📌 Problem:
Move all 'x' characters to the end of the string using recursion.

🧠 Logic:
- Traverse the string character by character.
- If the character is 'x', increment the count.
- Otherwise, add the character to a new string.
- Once traversal is complete, append all 'x's at the end of the new string based on count.

📊 Time Complexity:
O(n), where n is the length of the input string.

💾 Space Complexity:
O(n), for the new string and recursive call stack.

⚠️ Edge Cases:
- Empty string → Output is also an empty string.
- All characters are 'x' → All move to the end (same string).

💡 Notes:
- Demonstrates recursive string building.
- Efficiently separates character filtering and final string reconstruction.
*/
package Day_16.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class rearrangingX{
    public static void rearrange(String name , int i , int count , String newString){
        if(i == name.length()){
            for(int j=0; j<count; j++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = name.charAt(i);

        if(currentChar == 'x'){
            count++ ; 
            rearrange(name , i+1 , count , newString);
        } else{
            newString += currentChar ; 
            rearrange(name , i+1 , count , newString);
        }
    }

    public static void main(String args[]){
        String name = "axbcxxd";        //you change the string to check different cases 

        rearrange(name , 0 , 0 , "");
    }
}