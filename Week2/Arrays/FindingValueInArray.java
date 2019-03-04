package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingValueInArray {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        Random random = new Random();
        int num[] = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = 1 + random.nextInt(50);
            System.out.print(num[i] + " ");
        }
        System.out.print("\nValue to find : ");
        int value = generalin.nextInt();

        boolean find = false;

        for (int l = 0; l < num.length; l++) {
            if (value == num[l]) {
                find = true;
                System.out.println(String.format("%d is in the array at the %d position, just to remember the array position start at [0].", value, l));
            }
        }
    }
}