/*
📌 Problem:
Check whether a given array is strictly increasing using recursion.

🧠 Logic:
- Start from index 0 and compare each element with the next.
- If current element is greater than or equal to the next → array is not strictly increasing.
- Base case: when index reaches the second last element (n - 1), return true.

📊 Time Complexity:
O(n), where n is the length of the array.

💾 Space Complexity:
O(n) due to recursive call stack.

⚠️ Edge Cases:
- Array with 0 or 1 elements is trivially strictly increasing.

💡 Notes:
- Demonstrates recursive traversal through an array.
- Highlights early exit condition when order is violated.
*/
package Day_16.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class SortedArray{
    public static boolean checkArray(int[] matrix , int index , int n){

        if(index == n - 1 ){
            return true;
        }
        if(matrix[index] >= matrix[index+1]){
            return false ;
        }

        return checkArray(matrix, index + 1 , n);       

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your array : ");
        int n = sc.nextInt();
        int matrix[] = new int[n];

        System.out.println("Enter your data : ");
        for(int i = 0; i<n; i++){
            matrix[i] = sc.nextInt();
        }
        
        boolean result = checkArray(matrix, 0 , n);

        if(result){
            System.out.println("This array is strictly increasing!");
        } else {
            System.out.println("This array is not strictly increasing");
        }
    }
}