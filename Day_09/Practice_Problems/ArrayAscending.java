/*
📌 Problem:
Check if the input array is sorted in ascending order.

🧠 Logic:
- Take the size of the array and input elements.
- Iterate through the array till the second last element.
- Compare each element with the next one.
- If any element is greater than the next, mark the array as not ascending.
- Print the result accordingly.

📊 Time Complexity:
O(n) — Single pass through the array.

💾 Space Complexity:
O(n) — For storing the input array.

⚠️ Edge Cases:
- Empty or single-element arrays are inherently ascending.
- Scanner resource not closed (can be added).
- No break in loop after detecting non-ascending sequence (optimization possible).
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class ArrayAscending{
    public static void main(String aargs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter your number " + (i+1) + " : ");
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<number.length -1; i++){
            if(number[i] > number[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.print("This Array is in Ascending Order!");
        } else{
            System.out.print("This Array is not in Ascending Order!");
        }
    }
}