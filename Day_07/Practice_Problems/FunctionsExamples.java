package Day_07.Practice_Problems;

// FunctionsExamples.java
// Demonstrates basic function concepts in Java

public class FunctionsExamples {

    // Function with return type and parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Function with void return type
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Function to demonstrate method overloading
    public static int square(int x) {
        return x * x;
    }

    public static double square(double x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Calling add function
        int result = add(10, 5);
        System.out.println("Sum: " + result);

        // Calling greet function
        greet("Suraj");

        // Calling factorial
        int fact5 = factorial(5);
        System.out.println("Factorial of 5: " + fact5);

        // Checking even or odd
        System.out.println("Is 8 even? " + isEven(8));

        // Method overloading
        System.out.println("Square of 4 (int): " + square(4));
        System.out.println("Square of 5.5 (double): " + square(5.5));
    }
}
