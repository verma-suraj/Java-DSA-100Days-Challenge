/*
📌 Problem:
Search for a number in a 2D array and print its position (row, column) if found.

🧠 Logic:
- Take number of rows and columns as input to define a 2D array.
- Populate the 2D array with user input.
- Take a number 'x' as input to search.
- Traverse through the entire matrix and check if any element matches 'x'.
- If found, print the index (1-based). If not, show "not found".

📊 Time Complexity:
O(n * m) — where `n` = rows and `m` = columns.

💾 Space Complexity:
O(n * m) — for the 2D array.

⚠️ Edge Cases:
- If `x` occurs multiple times, all positions will be printed.
- Indexes shown are 1-based for user readability.
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class PrintArrayIndex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter your data : ");

        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to find : ");
        int x = sc.nextInt();

        //Searching number
        boolean found = false;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("Your number " + x + " is at index = (" + (i+1) + " , " + (j+1) + " ) ");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.print("Number " + x + " is not found in array. ");
        }
    }
}