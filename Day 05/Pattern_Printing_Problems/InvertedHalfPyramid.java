/*
📌 Problem:
Print an inverted half pyramid of stars (*) with 4 rows.
****
***
**
*

🧠 Logic:
- Outer loop runs from n down to 1.
- Inner loop runs from 1 to i.
- Print "*" in inner loop.
- Print newline after each row.

⚠️ Edge Cases:
- n is hardcoded to 4, no input handling.
- Variable m is declared but unused (can be removed).
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class InvertedHalfPyramid{
public static void main(String args []){
    int n = 4;
    int m = 5; 
    			//outer loop
	        for(int i = n ; i >= 1 ; i--){
	            //inner loop
	            for(int j = 1 ; j <= i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
        }

	}
}