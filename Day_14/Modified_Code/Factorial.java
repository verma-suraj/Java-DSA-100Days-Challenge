package Day_14.Modified_Code;           //ignore this if you are copying this code to run locally!!
 
public class Factorial {
    public static int printFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        // Scanner is removed for Python Tutor compatibility
        int n = 5; // <-- Hardcoded input value. Change as needed.
        System.out.print("Enter the number to find factorial: ");
        System.out.println(n); // Simulate user input display
        int result = printFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
