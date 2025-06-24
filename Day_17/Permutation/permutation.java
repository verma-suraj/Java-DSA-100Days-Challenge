/*
📌 Problem:
Generate and print all permutations of a given string.

🧠 Logic:
- Use recursion to build permutations by choosing each character in the string one by one.
- At each recursive step:
  - Pick one character `currentChar` from the string.
  - Form a new string by removing that character from the original (`newString`).
  - Append `currentChar` to the current `permutation` and call the function recursively.

🛑 Base Case:
- If the original string becomes empty, print the formed `permutation`.

📊 Time Complexity:
O(n!) — Total number of permutations for a string of length n.


✅ Purpose:
Understanding recursion, backtracking, and string manipulation.
*/
package Day_17.Permutation;               //ignore this if you are copying this code to run locally!!

public class permutation{
    public static void printPermu(String str , String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length() ; i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermu(newString , permutation+currentChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermu(str , "");
    }
}