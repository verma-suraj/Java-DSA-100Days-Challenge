/*
📌 Problem:
Solve the Tower of Hanoi puzzle for `n` disks using recursion.

🧠 Logic:
- Move `n-1` disks from source (`src`) to helper (`help`) using destination (`dest`) as temporary storage.
- Move the largest disk (nth disk) from source (`src`) to destination (`dest`).
- Move the `n-1` disks from helper (`help`) to destination (`dest`) using source (`src`) as temporary storage.

- Base case:
  When `n == 1`, just move the single disk from source to destination.

📊 Time Complexity:
O(2^n) → exponential number of moves.

💾 Space Complexity:
O(n) → recursion stack depth.

⚠️ Edge Cases:
- `n` should be positive, no handling for zero or negative input.

💡 Notes:
- Prints each move as a step in the solution.
- Classic recursion problem illustrating divide-and-conquer and backtracking.
*/
package Day_16.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;
public class TowerOfHanoi{
    public static void PrintHanoi(int n , String src , String help , String dest){
        if(n==1){
            System.out.println("Transfer disk " + n + " From " + src + " to " + dest);
            return;
        }

        PrintHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk " + n + " From " + src + " to " + dest);
        PrintHanoi(n-1, help , src , dest );

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of discs: ");
        int n = sc.nextInt();
        System.out.println("Considering the size of is same as the number i.e 1 is smaller than 2 and so on...");
        PrintHanoi(n, "S", "H", "D");
    }
}