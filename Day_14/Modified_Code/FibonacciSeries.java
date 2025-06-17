package Day_14.Modified_Code;           //ignore this if you are copying this code to run locally!!

public class FibonacciSeries {
    public static void PrintFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        System.out.print(a + " ");
        PrintFibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        // Scanner is removed for Python Tutor compatibility
        int n = 7; // <-- Hardcoded input. Change it to any positive number.
        System.out.print("Enter n: ");
        System.out.println(n); // Simulate user input
        System.out.print("Fibonacci series up to " + n + " terms is: ");
        PrintFibonacci(0, 1, n);
    }
}
