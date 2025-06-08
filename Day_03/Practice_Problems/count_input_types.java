/*
📌 Problem:
Create a program that takes user input repeatedly and counts how many numbers are:
- Zero
- Positive
- Negative
User should be able to continue or exit using a flag (1 = continue, 0 = exit).

🧠 Logic:
- Use a while loop that continues as long as input == 1
- Inside the loop, take number input and check if it's zero, positive, or negative
- Maintain counters for each category

⚠️ Edge Cases:
- First input = 0 → program ends immediately
- No numbers entered → all counters stay 0
- Negative inputs are counted correctly
*/
import java.util.*;

public class count_input_types{
    public static void main(String[] args){
        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        System.out.print("Press 1 to contiue and 0 to exit : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1) {
            if (input == 0) {
            System.out.println("Program ended!");
            break;
        } else{
            System.out.print("Enter your number : ");
            int b = sc.nextInt();
            if(b==0){
                zeros++;
            }
            else if(b>0){
                positives++;
            }
            else{
                negatives++;
            }
        }
        System.out.print("Press 1 to contiue and 0 to exit : ");
        input = sc.nextInt();
        };
        System.out.println("Zeros = " + zeros);
        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);
        sc.close();
    }
}