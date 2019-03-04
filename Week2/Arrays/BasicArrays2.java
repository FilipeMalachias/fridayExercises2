package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num [] = new int [10];
        int count1 = -1;
        for (int i = 0; i < num.length; i++)
        {
            num[i] = 1 + random.nextInt(100);
            count1++;
            System.out.println(String.format("Slot %d contains a %d", count1, num[i]));
        }
        /*System.out.println(String.format("Slot 0 contains a %d", num[0]));
        System.out.println(String.format("Slot 1 contains a %d", num[1]));
        System.out.println(String.format("Slot 2 contains a %d", num[2]));
        System.out.println(String.format("Slot 3 contains a %d", num[3]));
        System.out.println(String.format("Slot 4 contains a %d", num[4]));
        System.out.println(String.format("Slot 5 contains a %d", num[5]));
        System.out.println(String.format("Slot 6 contains a %d", num[6]));
        System.out.println(String.format("Slot 7 contains a %d", num[7]));
        System.out.println(String.format("Slot 8 contains a %d", num[8]));
        System.out.println(String.format("Slot 9 contains a %d", num[9]));*/
    }
}
