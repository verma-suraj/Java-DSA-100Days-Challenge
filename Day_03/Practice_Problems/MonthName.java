/*
📌 Problem:
Given a number from 1 to 12, print the corresponding month name.

🧠 Logic:
- Take an integer input from the user.
- Use a switch-case construct to map each number (1 to 12) to its respective month name.
- If the input is outside the 1–12 range, print an error message.

⚠️ Notes:
- No validation for non-integer inputs (assumes user enters valid integers).
- Closes the `Scanner` object to avoid resource leak.

✅ Purpose:
To practice `switch` statements, basic conditional logic, and user interaction in Java.
*/
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = scanner.nextInt();
        
        String monthName;
        
        switch (monthNumber) {
            case 1:  monthName = "January"; break;
            case 2:  monthName = "February"; break;
            case 3:  monthName = "March"; break;
            case 4:  monthName = "April"; break;
            case 5:  monthName = "May"; break;
            case 6:  monthName = "June"; break;
            case 7:  monthName = "July"; break;
            case 8:  monthName = "August"; break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Invalid month number!"; break;
        }
        
        System.out.println(monthName);
        
        scanner.close();
    }
}
