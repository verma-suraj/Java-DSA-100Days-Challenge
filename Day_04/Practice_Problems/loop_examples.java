// LoopDemo.java
public class loop_examples {
    public static void main(String[] args) {

        // 1. while loop: runs only if condition is true
        int a = 1;
        System.out.println("WHILE LOOP (Condition: a <= 3)");
        while (a <= 3) {
            System.out.println("While Loop Value: " + a);
            a++;
        }

        // 2. do-while loop: executes at least once even if condition is false
        int b = 5;
        System.out.println("\nDO-WHILE LOOP (Condition: b <= 3)");
        do {
            System.out.println("Do-While Loop Value: " + b);
            b++;
        } while (b <= 3);

        // 3. for loop: best when number of iterations is known
        System.out.println("\nFOR LOOP (i from 1 to 3)");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop Value: " + i);
        }
    }
}
