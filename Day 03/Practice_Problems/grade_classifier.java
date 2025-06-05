/*
📌 Problem:
Ask the user if they want to continue. If yes, prompt for marks out of 100 and classify the marks into performance categories.

🧠 Logic:
- Take initial input to continue (1) or exit (0)
- Validate that only 0 or 1 is entered
- If 1, ask for marks and validate that marks are between 0 and 100
- Based on marks:
    - 90–100 → "This is good"
    - 60–89  → "This is also good"
    - 0–59   → "This is good as well"

⚠️ Edge Cases:
- Invalid menu input (like 2 or -1) → handled
- Marks below 0 or above 100 → handled
*/
import java.util.*;
public class grade_classifier{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to continue and 0 to end: ");
        int i = sc.nextInt();
        while (i != 0 && i != 1) {
            System.out.println("invalid number! press 0 and 1 only");
            System.out.println("Enter 1 to continue and 0 to end: ");
            i = sc.nextInt();
        }
            if (i == 0) {
                System.out.println("The program has ended!!");
                sc.close();
                return;
            }
            else{
                System.out.print("Enter your marks out of 100:");
                int j = sc.nextInt();
                while (j < 0 || j > 100) {
                    System.out.println("Plese enter valid number out of 100");
                    System.out.print("Enter your marks out of 100:");
                    j = sc.nextInt();
                }
                if (j >= 90) {
                    System.out.println("This is good");
                }
                else if( j <= 89 && j >= 60){
                    System.out.println("This is also good");
                }
                else{
                    System.out.println("This is good as well");
                }
        }
        
    }
}