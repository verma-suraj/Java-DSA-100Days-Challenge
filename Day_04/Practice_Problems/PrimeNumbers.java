/*
📌 Problem:
Check if a given number entered by the user is a prime number or not.

🧠 Logic:
- Take an integer input from the user.
- If the number is less than or equal to 1, it is not prime.
- For numbers greater than 1, check divisibility from 2 up to √n:
    - If any number divides n exactly, mark it as not prime and break.
- If no divisor is found, the number is prime.
- Print the result accordingly.

⚠️ Edge Cases:
- Numbers <= 1 handled (not prime).
- Negative numbers and zero handled by same <=1 condition.
- No validation if input is an integer.
*/
import java.util.*;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if(n <=1 ){
            System.out.print("This is not a prime number!");
            return;
       }
       boolean isprime = true;
       for(int i = 2; i <= Math.sqrt(n) ; i++){
        if( n % i == 0){
            isprime = false;
        break;
        }
    }   
        
        if(isprime){
            System.out.print("It is a prime number!");
        }
        else{
            System.out.print("It is not a prime number");
        }
        
       

    }
}
