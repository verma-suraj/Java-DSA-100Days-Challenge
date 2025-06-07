/*
📌 Problem:
Print an inverted half pyramid rotated by 180 degrees using stars (*).
   *
  **
 ***
****

🧠 Logic:
- Outer loop runs from 1 to n (number of rows).
- First inner loop prints (n - i) spaces to shift stars right.
- Second inner loop prints i stars.
- Print newline after each row.

⚠️ Edge Cases:
- n is hardcoded to 4, no input handling.
- Variable m is declared but unused (can be removed).
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class InvertedHalfPyramidRotatedBy180Deg{
public static void main(String args []){
    int n = 4;
    int m = 5; 
    				//outer loop
	        for(int i=1; i<=n; i++){
	            //inner loop ->Space print
	            for(int j=1; j<=n-i; j++){
	                System.out.print(" ");
	            }
	            //inner loop for -> star print
	            for(int j=1; j<=i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }


	}
}