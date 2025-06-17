package Day_14.Modified_Code;           //ignore this if you are copying this code to run locally!!

public class sumOfnNumbers { // tail recursion sum, more optimized
    public static void findSum(int n, int sum) {
        if (n == 0) {
            System.out.println("Your sum of n natural numbers is: " + sum);
            return;
        }
        sum += n;
        findSum(n - 1, sum);
    }

    public static void main(String[] args) {
        // Scanner removed for Python Tutor compatibility
        int n = 5; // <-- Hardcoded input. Change to test other values.
        System.out.print("Enter your n: ");
        System.out.println(n); // Simulate user input
        findSum(n, 0);
    }
}
