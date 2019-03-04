package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++)
        {
            int num = 1 + random.nextInt(100);
            numbers.add(num);
        }
        System.out.println("ArrayList: " + numbers);
    }

}