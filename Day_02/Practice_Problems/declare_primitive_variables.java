/*
📌 Problem:
Demonstrate the declaration and usage of all Java primitive data types.

🧠 Logic:
- Java has 8 primitive data types: byte, short, int, long, float, double, char, boolean.
- This program assigns example values to each and prints them.

⚠️ Notes:
- `L` is required for long literals.
- `f` is required for float literals.
- `char` uses single quotes.
- `Math.PI` provides a precise double value of π.
- Java is case-sensitive (`Math` not `MATH`).

✅ Purpose:
To understand primitive variable types, their ranges, and proper syntax in Java.
*/
public class declare_primitive_variables{
    public static void main(String args[]){
        byte small_integer = 100;
        short large_integer = 1000;
        int commonly_used_integer = 500000;
        long very_large_integer = 10000000L; // Add 'L' for long literals
        float decimals = 1.05f;              // Add 'f' for float literals
        double precise_decimals = Math.PI;   // 'Math' not 'MATH', case-sensitive
        char character = 'S';                // char uses single quotes
        boolean isTrue = false;

        System.out.println("Small integer is : " + small_integer);
        System.out.println("Large integer is : " + large_integer);
        System.out.println("Commonly used integer is : " + commonly_used_integer);
        System.out.println("Very large integer is : " + very_large_integer);
        System.out.println("Decimal is : " + decimals);
        System.out.println("Precise decimal is : " + precise_decimals);
        System.out.println("Character is : " + character);
        System.out.println("Boolean is : " + isTrue);

    }
}