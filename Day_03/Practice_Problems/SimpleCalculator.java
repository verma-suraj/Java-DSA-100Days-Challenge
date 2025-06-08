/*
📌 Problem:
Build a simple calculator that performs basic arithmetic operations (+, -, *, /, %) on two user-input numbers.

🧠 Logic:
- Take two numbers and one operator as input from the user.
- Use switch-case to determine which operation to perform.
- Handle edge cases like division or modulo by zero.
- Display the result or appropriate error message.

⚠️ Notes:
- Handles floating point inputs.
- Includes validation for division and modulo by zero.
- Doesn’t handle invalid (non-numeric) inputs — assumes correct input type.

✅ Purpose:
Practice of conditionals, switch-case, arithmetic operators, and robust input/output handling in Java.
*/
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        double result;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
