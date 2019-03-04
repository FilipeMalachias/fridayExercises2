package Week2.IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        String gender = generalin.nextLine();
        gender = gender.toUpperCase();
        System.out.print("First name: ");
        String firstName = generalin.nextLine();
        firstName = firstName.toUpperCase();
        System.out.print("Last name: ");
        String lastName = generalin.nextLine();
        lastName = lastName.toUpperCase();
        System.out.print("Age: ");
        int age = generalin.nextInt();
            if (age < 20) {
                System.out.println(String.format("Then I shall call you %s %s.", firstName, lastName));
            }
            else if (age >= 20 && gender.equals("M"))
            {
                System.out.print(String.format("Then I shall call you Mr. %s.", lastName));
            } else if (age >= 20 && gender.equals("F"))
            {
                System.out.print(String.format("\nAre you married, %s (y or n)? ", firstName));
                Scanner marriedin = new Scanner(System.in);
                String married  = marriedin.nextLine();
                married = married.toUpperCase();
                if (married.equals("Y"))
                {
                    System.out.println(String.format("\nThen I shall call you Mrs. %s.", lastName));
                } else if (married.equals("N"))
                {
                    System.out.println(String.format("\nThen I shall call you Ms. %s.", lastName));
                }
            }

    }
}
