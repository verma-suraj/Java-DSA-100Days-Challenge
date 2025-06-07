/*
📌 Problem:
Print an inverted half pyramid pattern using numbers.
1234
123
12
1

🧠 Logic:
- Outer loop runs from 1 to n (number of rows).
- Inner loop runs from 1 to (n + 1 - i), printing current column number.
- Print newline after each row.

⚠️ Edge Cases:
- n is hardcoded to 4, no input handling.
- Variable m is declared but unused (can be removed).
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class InvertedHalfPyramidWithNumbers{
public static void main(String args []){
    int n = 4;
    int m = 5; 
    						//outer loop 
	        for(int i=1; i<=n; i++){
	            //inner loop
	            for(int j=1; j<=n+1-i; j++){
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	}
}