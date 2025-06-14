package Day_11.Practice_Problems;           //ignore this if you are copying this code to run locally!!

public class StringBuilderExamples {
    public static void main(String[] args) {
        // 🔧 setCharAt example
        StringBuilder sb1 = new StringBuilder("Suraj");
        sb1.setCharAt(0, 'i');
        System.out.println("setCharAt: " + sb1); // Output: iuraj

        // ➕ insert example
        StringBuilder sb2 = new StringBuilder("Suraj");
        sb2.insert(0, 'i');
        System.out.println("insert: " + sb2); // Output: iSuraj

        // ❌ delete example
        StringBuilder sb3 = new StringBuilder("Suraj");
        sb3.delete(2, 3); // deletes char at index 2 ('r')
        System.out.println("delete: " + sb3); // Output: Suaj

        // 🧩 append example
        StringBuilder sb4 = new StringBuilder("S");
        sb4.append("u");
        sb4.append("r");
        sb4.append("a");
        sb4.append("j");
        System.out.println("append: " + sb4); // Output: Suraj
    }
}
