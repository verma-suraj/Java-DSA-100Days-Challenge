package Day_14.Modified_Code;           //ignore this if you are copying this code to run locally!!

public class sumOfNaturalNumbers {   // standard recursion, less optimized
    public static int findSum(int n, int x) {
        if (n > x) {
            return 0;
        }
        return n + findSum(n + 1, x);
    }

    public static void main(String[] args) {
        // Scanner removed for Python Tutor compatibility
        int n = 1;
        int x = 5; // <-- Hardcoded input. Change this value as needed.
        System.out.print("Enter your n: ");
        System.out.println(x); // Simulate user input
        int sum = findSum(n, x);

        System.out.println("Sum of first " + x + " natural numbers is: " + sum);
    }
}
