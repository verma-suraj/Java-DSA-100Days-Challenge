/*
📌 Problem:
Print the elements of a 2D matrix in spiral order (clockwise).

🧠 Logic:
- Use four pointers to keep track of the current boundaries of the matrix:
  row_s (start row), row_e (end row), col_s (start column), col_e (end column).
- Traverse the matrix in the order: top row → right column → bottom row → left column.
- After each traversal, move the pointers inward to avoid re-printing the same elements.
- Stop when the start pointers cross the end pointers.

⚠️ Edge Cases:
- When the matrix has a single row or column left, the loops ensure no duplicates by checking conditions.
*/

package Pattern_Printing_Problems;          //ignore this if you are copying this code to run locally!!

import java.util.*;
public class SpiralLoop{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter your data : ");

        //Input of matrix data 
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int row_s = 0 , col_s = 0 , row_e = rows-1 , col_e = cols-1;

        //spiral matrix print

        System.out.println("Your spiral matrix is : ");
        while(row_s <= row_e && col_s <= col_e){
            //Top
            for(int i=col_s; i<=col_e; i++){
                System.out.print(matrix[row_s][i] + " ");
            }
            
            //Right
            for(int i=row_s + 1; i<=row_e; i++){
                System.out.print(matrix[i][col_e] + " ");
            }

            //bottom
            for(int i=col_e-1; i>=col_s; i--){
                if(row_s == row_e){
                    break;
                } else {
                    System.out.print(matrix[row_e][i] + " ");
                }
            }
            //left
            for(int i=row_e - 1; i>row_s; i--){
                if(col_s == col_e){
                    break;
                } else{
                    System.out.print(matrix[i][col_s] + " ");
                }
            }
            row_s++ ; row_e-- ; col_s++ ; col_e-- ;
        }


    }
}