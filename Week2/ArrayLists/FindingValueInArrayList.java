package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
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

        for (int l = 0; l < numbers.size(); l++) {
            if (value == numbers.get(l)) {
                find = true;
                System.out.println(String.format("%d is in the array at the %d slot.", value, l));
            }

        }
    }
}