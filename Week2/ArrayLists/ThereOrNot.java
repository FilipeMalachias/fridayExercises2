package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ThereOrNot {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
        {
            int num = 1 + random.nextInt(50);
            numbers.add(num);
        }
        System.out.println("ArrayList: " + numbers);
        System.out.print("\nValue to find : ");
        int value = generalin.nextInt();

        boolean find = false;

        int count = 0;
        for (int l = 0; l < numbers.size(); l++) {
            if (value == numbers.get(l)) {
                find = true;
                count++;
                System.out.println(String.format("\n%d is in the array at the %d slot.", value, l));
            }

        }
        if (count != 0)
        {
            System.out.println(String.format("\n%d was found %d times.", value, count));
        }
        else if (count  == 0)
        {
            System.out.println(String.format("\n%d is not in the ArrayList.", value));
        }
    }
}