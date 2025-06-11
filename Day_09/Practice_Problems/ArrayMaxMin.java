/*
📌 Problem:
Find the maximum and minimum values from an integer array input by the user.

🧠 Logic:
- Take size input and create an integer array.
- Input array elements using a loop.
- Initialize max to smallest integer and min to largest integer.
- Traverse the array to update max and min accordingly.
- Print the final max and min values.

📊 Time Complexity:
O(n) — Single pass to find max and min.

💾 Space Complexity:
O(n) — For storing the input array.

⚠️ Edge Cases:
- Array size <= 0 is not handled (can be added for robustness).
- Assumes at least one element is entered.
- Scanner not closed (can be added).
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class ArrayMaxMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //imput
        for(int i=0; i<size; i++){
            System.out.print("Enter your number : ");
            numbers[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            } 
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
    }
}