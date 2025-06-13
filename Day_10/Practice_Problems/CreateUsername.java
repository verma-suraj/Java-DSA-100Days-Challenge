/*
📌 Problem:
Extract the username from an email ID. The username is defined as the part of the email before the '@' symbol.

🧠 Logic:
- Take an email address as input from the user.
- Traverse each character in the email string.
- Append characters to the username until the '@' symbol is encountered.
- Stop when '@' is found and print the username.

📊 Time Complexity:
O(n), where n is the number of characters in the email ID until '@'.

💾 Space Complexity:
O(n), where n is the length of the extracted username.

⚠️ Edge Cases:
- If email doesn't contain '@', the whole string will be returned as the username.
- Only the first '@' is considered — which is valid for standard email structure.
*/
package Day_10.Practice_Problems;           //ignore this if you are copying this code to run locally!!
import java.util.*;
public class CreateUsername{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your emai I'd : ");
        String email = sc.next();
        String username = "";

        //creating username
        for(int i=0; i<email.length(); i++){
            char currentChar = email.charAt(i);
            if(currentChar == '@'){
                break;              //will only take characters before @ in the email I'd
            } else {
                username += currentChar;
            }
        }
        System.out.print("Username = " + username);
    }
}