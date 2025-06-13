package Day_10.Practice_Problems;

import java.util.Scanner;

public class Strings_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input examples
        System.out.print("Enter your first name: ");
        String firstName = sc.next();  // Takes a single word
        sc.nextLine(); // To consume the leftover newline
        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine(); // Takes a full line

        // Concatenation
        String lastName = "Verma";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length of full name
        System.out.println("Length: " + fullName.length());

        // charAt
        if (firstName.length() > 2) {
            System.out.println("Character at index 2: " + firstName.charAt(2));
        }

        // compareTo
        String name1 = "Suraj";
        String name2 = "Suraj";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }

        // Substring
        if (sentence.length() >= 11) {
            String name = sentence.substring(11); // From index 11 to end
            System.out.println("Extracted Name from sentence: " + name);
        }

        // String to Integer
        String numStr = "1234";
        int num = Integer.parseInt(numStr);
        System.out.println("Parsed Integer: " + num);

        // Integer to String
        int val = 5678;
        String strVal = Integer.toString(val);
        System.out.println("Converted String: " + strVal);

        sc.close();
    }
}
