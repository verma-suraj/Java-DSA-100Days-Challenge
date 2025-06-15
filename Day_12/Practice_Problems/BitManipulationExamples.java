package Day_12.Practice_Problems;

public class BitManipulationExamples {

    public static void main(String[] args) {
        // Get Bit
        int number = 5; // Binary: 0101
        int position = 1;
        int bitMask = 1 << position;

        System.out.println("Get Bit:");
        if ((bitMask & number) == 0) {
            System.out.println("The bit at position " + position + " was 0");
        } else {
            System.out.println("The bit at position " + position + " was 1");
        }

        // Set Bit
        number = 5;
        position = 1;
        bitMask = 1 << position;

        System.out.println("\nSet Bit:");
        int setResult = bitMask | number;
        System.out.println("Result after setting bit at position " + position + ": " + setResult);

        // Clear Bit
        number = 5;
        position = 1;
        bitMask = 1 << position;
        int newBitMask = ~bitMask;

        System.out.println("\nClear Bit:");
        int clearResult = newBitMask & number;
        System.out.println("Result after clearing bit at position " + position + ": " + clearResult);

        // Update Bit
        number = 5;
        position = 2;
        bitMask = 1 << position;
        int operator = 0; // Change to 1 to set, 0 to clear

        System.out.println("\nUpdate Bit:");
        if (operator == 0) {
            newBitMask = ~bitMask;
            int updateResult = newBitMask & number;
            System.out.println("Result after clearing bit at position " + position + ": " + updateResult);
        } else {
            int updateResult = bitMask | number;
            System.out.println("Result after setting bit at position " + position + ": " + updateResult);
        }
    }
}
