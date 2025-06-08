/*
📌 Problem:
Print the multiplication table of a given number from 1 to 10.

🧠 Logic:
- Multiply the input number with integers from 1 to 10.
- Print the results in the format: number x i = product.

⚠️ Edge Cases:
- No special edge cases for positive or negative numbers here.

💡 Notes:
- Could be optimized using a loop instead of repeated print statements.
*/

import java.util.*;

public class multiplication_table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int number = sc.nextInt();

        System.out.println("Your table is : ");
        System.out.println(number + " x " + "1 = " + number * 1);
        System.out.println(number + " x " + "2 = " + number * 2);
        System.out.println(number + " x " + "3 = " + number * 3);
        System.out.println(number + " x " + "4 = " + number * 4);
        System.out.println(number + " x " + "5 = " + number * 5);
        System.out.println(number + " x " + "6 = " + number * 6);
        System.out.println(number + " x " + "7 = " + number * 7);
        System.out.println(number + " x " + "8 = " + number * 8);
        System.out.println(number + " x " + "9 = " + number * 9);
        System.out.println(number + " x " + "10 = " + number * 10);

        sc.close();
    }
}
