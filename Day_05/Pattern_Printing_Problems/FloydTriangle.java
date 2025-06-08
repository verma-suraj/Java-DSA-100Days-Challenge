/*
📌 Problem:
Print Floyd's triangle with n rows.
1  
2  3
4  5  6  
7  8  9  10

🧠 Logic:
- Initialize a number variable to 1.
- Outer loop runs from 1 to n (rows).
- Inner loop runs from 1 to i (current row number).
- Print current number and increment it.
- Print newline after each row.

⚠️ Edge Cases:
- n is hardcoded to 4, no input handling.
*/

package Pattern_Printing_Problems;      //ignore this if you are copying this code to run locally!!


public class FloydTriangle{
public static void main(String args []){
    int n= 4;
    int number = 1; 
    			//outer loop 
	        for(int i=1; i<=n; i++){
	            //inner loop
	            for(int j=1; j<=i; j++){
	                System.out.print(number+"  ");
	                number++ ;
	            }
	            System.out.println();
	        }
	}
}
