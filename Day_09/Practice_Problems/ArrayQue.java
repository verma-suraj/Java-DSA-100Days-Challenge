/*
📌 Problem:
Take an array input from the user, then search for a given number `x` and print the index where it is found.

🧠 Logic:
- Ask user for array size and initialize array.
- Input elements one by one using a loop.
- Take a number `x` to search in the array.
- Traverse array and compare each element with `x`.
- If match found, print index.

📊 Time Complexity:
O(n) — Linear search through the array.

💾 Space Complexity:
O(n) — For storing `n` array elements.

⚠️ Edge Cases:
- If number is not found, nothing is printed (can be improved).
- No handling for multiple occurrences (prints only last one if multiple found).
- No newline after output.
- Suggestion: Close scanner after usage.
*/
package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class ArrayQue{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //for input
        for(int i=0; i<size; i++){
            System.out.print("Enter numbers in your array : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to find : ");
        int x = sc.nextInt();
         // for output
         for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("Your number found at index " + i );
            }
         }
    }
}