package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
        {
            int num = 1 + random.nextInt(100);
            numbers.add(num);
        }
        System.out.println("ArrayList: " + numbers);
        int largest = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) > numbers.get(largest))
            {
                largest = i;
            }
        }
        int numberToPrint = numbers.get(largest);
        System.out.println(String.format("\nThe largest value is %d.", numberToPrint));
        System.out.println(String.format("\nIt is in slot %d.", largest));
    }
}