/*
📌 Problem:
Calculate the area of a circle given its radius.

🧠 Logic:
- Area of a circle = π * r^2
- Use Math.PI constant for π value.

⚠️ Edge Cases:
- Radius zero or negative (not handled explicitly here).

💡 Notes:
- Variable names could be more descriptive for clarity.
- Using `double` primitive type instead of `Double` wrapper is more common here.
*/
import java.util.*;

public class circle_area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Radius : ");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is " + area + " .");
        sc.close();
    }
}
