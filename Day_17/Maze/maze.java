/*
📌 Problem:
Count the number of ways to reach from the top-left corner (0,0) to the bottom-right corner (n-1, m-1) of an n x m grid,
moving only right or down.

🧠 Logic:
- Use recursion to explore two possibilities at each step: move right or move down.
- Base case 1: If we go out of bounds (i == n or j == m), return 0.
- Base case 2: If we reach the destination cell (n-1, m-1), return 1.
- Recursive step: return the sum of right and down paths from the current cell.

📊 Time Complexity:
Exponential — O(2^(n+m)) in worst case due to overlapping subproblems.

💾 Space Complexity:
O(n + m) — Because of the recursion call stack depth.

🧪 Example:
For n = 3, m = 3, the total paths = 6.

✅ Purpose:
To understand recursion, grid traversal, and combinatorics (paths without backtracking).
*/
package Day_17.Maze;               //ignore this if you are copying this code to run locally!!

public class maze{
    public static int countPaths(int n , int m , int i , int j ){
        if (i == n || j == m){
            return 0;
        }
        if( i == n-1 && j == m-1){
            return 1;
        }
        int rightpaths = countPaths(n , m , i , j+1);
        int downPaths = countPaths( n, m , i+1 , j);

        return rightpaths + downPaths; 

    }
    public static void main(String args[]){
        int n = 3 , m = 3 ;
        System.out.println(countPaths(n , m , 0 , 0));
    }
}