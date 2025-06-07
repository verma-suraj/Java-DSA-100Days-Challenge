/*
📌 Problem:
Print a half pyramid pattern of stars (*) with 4 rows.
*
**
***
****

🧠 Logic:
- Outer loop runs from 1 to n (number of rows).
- Inner loop runs from 1 to i (current row number).
- Print "*" in inner loop.
- Print newline after each row.

⚠️ Edge Cases:
- n is hardcoded to 4, no input handling.
- Variable m is declared but unused (can be removed).
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class HalfPyramid{
public static void main(String args []){
    int n = 4;
    int m = 5; 
    		//outer loop
	        for(int i = 1 ; i <= n ; i++){
	            //inner loop
	            for(int j = 1 ; j <= i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}
}