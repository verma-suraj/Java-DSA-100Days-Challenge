/*
📌 Problem:
Print a hollow rectangle of stars (*) with 4 rows and 5 columns. 
*****
*   *
*   *
*****

🧠 Logic:
- Use nested loops:
  - Outer loop runs n times for rows.
  - Inner loop runs m times for columns.
- For each cell (i, j):
  - Print "*" if it's on the border (first row, last row, first column, last column).
  - Else print a space " ".
- After each row, print a newline.

⚠️ Edge Cases:
- Fixed dimensions n=4, m=5 — no input handling.
- If n or m < 2, the shape might not form correctly (not handled here).
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

public class HollowRectangle{
public static void main(String args []){
    int n = 4;
    int m = 5; 
    	//outer loop
	        for(int i = 1 ; i <= n ; i++){
	            //inner loop
	            for(int j = 1 ; j <= m ; j++){
	                //cell -> (i,j)
	                if (i == 1 || j == 1 || i == n || j == m) {
	                    System.out.print("*");
	                } else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
        }
	}
}