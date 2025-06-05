// 📌 Day 03: Conditional Statements in Java

import java.util.Scanner;

public class condition_examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if statement
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("✅ You are eligible to vote.");
        }

        // if-else
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("🔢 Even number");
        } else {
            System.out.println("🔢 Odd number");
        }

        // if-else-if ladder
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("🏆 Grade: A");
        } else if (marks >= 75) {
            System.out.println("🎖️ Grade: B");
        } else if (marks >= 60) {
            System.out.println("👍 Grade: C");
        } else {
            System.out.println("📘 Grade: D");
        }

        // switch case
        System.out.print("Enter a number (1 to 7) for days of week: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("📅 Monday");
                break;
            case 2:
                System.out.println("📅 Tuesday");
                break;
            case 3:
                System.out.println("📅 Wednesday");
                break;
            case 4:
                System.out.println("📅 Thursday");
                break;
            case 5:
                System.out.println("📅 Friday");
                break;
            case 6:
                System.out.println("📅 Saturday");
                break;
            case 7:
                System.out.println("📅 Sunday");
                break;
            default:
                System.out.println("❌ Invalid day number");
        }

        sc.close();
    }
}
