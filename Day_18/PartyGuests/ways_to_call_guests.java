/*
📌 Problem:
You are hosting a party with `n` guests. Each guest can either:
1. Attend the party alone (single)
2. Pair up with any one of the remaining guests (in pair)

🔍 Goal:
Find the total number of ways you can call all guests.

🧠 Logic:
- If a guest comes alone → solve for (n - 1) guests.
- If a guest pairs up → they can pair with (n - 1) others.
  And then we solve the problem for remaining (n - 2) guests.

🛑 Base Case:
- If n <= 1 → only 1 way to call the guests.

🧮 Recursive Formula:
ways(n) = ways(n - 1) + (n - 1) * ways(n - 2)

📊 Time Complexity:
Exponential without optimization (can be improved using memoization or DP)

✅ Real-Life Analogy:
This is like arranging friends for a party: each can come alone or as a pair — combinations matter.
*/
package Day_18.PartyGuests;         //ignore this if you are copying this code to run locally!!

public class ways_to_call_guests{
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single guest
        int way1 = callGuest(n-1);

        //in pair
        int way2 = (n-1) * callGuest(n-2);
        return way1 + way2;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.print("Total ways to call guests is " + callGuest(n));
    }
}