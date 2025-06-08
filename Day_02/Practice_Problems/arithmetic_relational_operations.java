/*
📌 Problem:
Perform arithmetic and relational operations on two user-input integers.

🧠 Logic:
- Accept two integers from the user.
- Perform all 5 basic arithmetic operations: +, -, *, /, %.
- Use conditional to avoid division by zero.
- Check 6 relational conditions between the numbers.

⚠️ Notes:
- Always check for division by zero before `/` and `%`.
- Relational operators return boolean values.
- Java uses short-circuit evaluation for conditional logic.

✅ Purpose:
To understand how to use arithmetic and relational operators in Java with user input.
*/

package Day_02.Practice_Problems;
import java.util.Scanner;

public class arithmetic_relational_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Arithmetic operations
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division and Modulus not possible (division by zero)");
        }

        // Relational operations
        System.out.println("\n--- Relational Operations ---");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        sc.close();
    }
}
