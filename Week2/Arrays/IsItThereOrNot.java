package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot {
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

        int count = 0;
        for (int l = 0; l < num.length; l++) {
            if (value == num[l]) {
                find = true;
                count++;
                System.out.println(String.format("%d is in the array at the %d position, just to remember the array position start at [0].", value, l));
            }
        }
        if (count != 0)
        {
            System.out.println(String.format("%d was found %d times.", value, count));
        }
        else if (count  == 0)
        {
            System.out.println(String.format("%d is not in the array.", value));
        }
    }
}