package Day_14.Modified_Code;           //ignore this if you are copying this code to run locally!!

public class RecursionPrintNumb {
    public static void PrintNumb(int n, int x) {
        if (n > x) {
            return;
        }
        System.out.println(n);
        PrintNumb(n + 1, x);
    }

    public static void main(String[] args) {
        // Scanner removed for Python Tutor compatibility
        int x = 5; // <-- Hardcoded input value. Change it to test.
        System.out.print("Enter the value of n: ");
        System.out.println(x); // Simulate user input
        int n = 1;
        System.out.println("Your series is :- ");
        PrintNumb(n, x);
    }
}
