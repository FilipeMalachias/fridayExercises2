package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class GradesInArrayFile {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        System.out.print("Name (first last): ");
        String nameLast = generalin.nextLine();
        System.out.print("Filename: ");
        String fileName = generalin.nextLine();
        System.out.print("\nHere are your randomly-selected grades (hope you pass): ");
        Random random = new Random();
        int grade1 = 1 + random.nextInt(100);
        int grade2 = 1 + random.nextInt(100);
        int grade3 = 1 + random.nextInt(100);
        int grade4 = 1 + random.nextInt(100);
        int grade5 = 1 + random.nextInt(100);
        System.out.print(String.format("\nGrade 1: %d\n" +
                                    "Grade 2: %d\n" +
                                    "Grade 3: %d\n" +
                                    "Grade 4: %d\n" +
                                    "Grade 5: %d\n", grade1, grade2, grade3, grade4, grade5));
        System.out.println(String.format("\nData saved in \"%s\".", fileName));
    }
}
