package Day_09.Practice_Problems;           //ignore this if you are copying this code to run locally!!

import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ 1D Array
        int[] oneD = new int[5];
        System.out.println("Enter 5 elements for 1D array:");
        for (int i = 0; i < oneD.length; i++) {
            oneD[i] = sc.nextInt();
        }

        System.out.print("1D Array: ");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
        System.out.println();

        // 2️⃣ 2D Array
        int[][] twoD = new int[2][3];
        System.out.println("Enter 6 elements for 2D array (2x3):");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
