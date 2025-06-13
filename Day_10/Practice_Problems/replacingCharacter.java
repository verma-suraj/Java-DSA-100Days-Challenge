/*
📌 Problem:
Replace every occurrence of the character 'e' in a given string with the character 'i'.

🧠 Logic:
- Read a string from the user.
- Iterate through each character of the string.
- If the character is 'e', replace it with 'i'.
- Otherwise, keep the character as it is.
- Build and print the modified string.

📊 Time Complexity:
O(n), where n is the length of the input string.

💾 Space Complexity:
O(n), for storing the new result string.

⚠️ Edge Cases:
- If the string contains no 'e', the output is the same as input.
- Input is taken using `next()` so it reads only the first word (without spaces).
  Use `nextLine()` if you want to accept full sentences.
*/
package Day_10.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class replacingCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input :");
        String input = sc.next();
        String result = "";
        
        //Finding e in string 
        for(int j=0; j<input.length(); j++){
            char currentChar = input.charAt(j);     //store current character of input according to loop
            if(currentChar != 'e'){
                result += currentChar;              //store current character into result as string
            } else{
                result += 'i';                      //replace 'e' with 'i' in result
            }
        }
        System.out.print(result);
    }
}