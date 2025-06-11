/*
📌 Problem:
Take input for a 2D array (matrix) of given dimensions and print the matrix in row-wise format.

🧠 Logic:
- Ask the user for the number of rows and columns
- Create a 2D array of given dimensions
- Use nested loops to take input row-wise
- Use another nested loop to print the array in matrix format

📊 Time Complexity:
O(n * m) — where n = number of rows, m = number of columns (for both input and output loops)

💾 Space Complexity:
O(n * m) — space used by the 2D array

⚠️ Edge Cases:
- rows = 0 or cols = 0 → No input/output should be processed
- Non-integer inputs will cause runtime errors (not handled in this version)
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class TwoDArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //inputs
        //rows
        System.out.println("Enter your data : ");
        for(int i=0; i<rows; i++){
            
            //columns
            for(int j=0; j<cols; j++){
                //System.out.print("Enter your data in " + (i+1)+ " , " + (j+1) +  " cell : ");
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("Your matrix is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}