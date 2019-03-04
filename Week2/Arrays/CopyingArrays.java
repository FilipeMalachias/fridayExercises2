package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int num1[] = new int[10];
        System.out.print("Array 1: ");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = 1 + random.nextInt(100);
            num1 [9] = -7;
            System.out.print(num1[i] + " ");
        }

        num1 [9] = random.nextInt(100);
        System.out.println("");
        int num2[] = new int[num1.length];
        System.out.print("\nArray 2: ");
        for (int i = 0; i < num1.length; i++) num2[i] = num1[i];

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num2[i] + " ");
        }
    }
}
