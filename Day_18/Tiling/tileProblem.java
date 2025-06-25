/*
📌 Problem:
Given a floor of size `n x m` and tiles of size `m x 1`, 
count the number of ways to tile the floor completely.

🧠 Logic:
- You can place a tile vertically → it takes up `m` rows.
- You can place a tile horizontally → it takes up 1 row.
- The total number of ways is the sum of both possibilities.

🛑 Base Cases:
- If `n == m`: Two ways → all vertical or all horizontal.
- If `n < m`: Only one way → all tiles placed vertically (no horizontal fit).

🧮 Recursive Formula:
ways(n) = ways(n - m) + ways(n - 1)

📊 Time Complexity:
Exponential (can be optimized with DP/memoization).

✅ Purpose:
To understand recursive problem-solving using breaking down possibilities.
*/
package Day_18.Tiling;          //ignore this if you are copying this code to run locally!!

public class tileProblem{
    public static int placeTile(int n , int m ){
        if(n == m ){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertical placements 
        int verticalPlacements = placeTile(n-m , m);

        //horizontal placements
        int horizontalPlacements = placeTile(n-1 , m );

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String args[]){
        int n = 4 , m = 2 ;             //play with values for different cases 
        System.out.println("Total ways to place tiles are " + placeTile(n , m ));
    }
}