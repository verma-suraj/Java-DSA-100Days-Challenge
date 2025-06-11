/*
📌 Problem:
Find the transpose of a given matrix.
(The transpose of a matrix is obtained by swapping rows and columns.)

🧠 Logic:
- Create a new matrix `transpose` with dimensions swapped (cols x rows).
- Assign `transpose[j][i] = matrix[i][j]` for all elements.
- Print the transposed matrix.

📊 Time Complexity:
O(rows * cols) — each element is processed once.

💾 Space Complexity:
O(rows * cols) — for storing the original and transposed matrix.

⚠️ Edge Cases:
- Works for non-square matrices as well, because transpose matrix size is cols x rows.
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class TransposeOfMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter your data :");

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Transpose of matrix 

        int transpose[][] = new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        //output
        System.out.println("Your transpose matrix is : ");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}