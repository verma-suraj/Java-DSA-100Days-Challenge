package Day_06.Pattern_Printing_Problems;        //ignore this if you are copying this code to run locally!!

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}
