// Day 01: Input and Output in Java

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();
    }
}
