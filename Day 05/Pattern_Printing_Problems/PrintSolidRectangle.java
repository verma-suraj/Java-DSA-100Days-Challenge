/*
📌 Problem:
Print a solid rectangle of stars (*) with 4 rows and 5 columns.
*****
*****
*****
*****

🧠 Logic:
- Use nested loops:
  - Outer loop runs 4 times for rows.
  - Inner loop runs 5 times for columns.
- In each inner loop iteration, print "*".
- After inner loop, print a new line to move to the next row.

⚠️ Edge Cases:
- Hardcoded dimensions (4x5), no dynamic input handling.
- No validation needed as there is no input.
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class PrintSolidRectangle{
public static void main(String args []){
    for(int i = 1 ; i <= 4 ; i++){
	            for(int j = 1 ; j <= 5 ; j++){
	            System.out.print("*");
	            }
	        System.out.println();
        }
}
}