package Week2.IfStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner generalin = new Scanner (System.in);
        System.out.print("What's your last name? ");
        String lastName = generalin.nextLine();
        String name1 = "Carswell"; //or before: say "you don't have to wait long"
        String name2 = "Jones"; //or before: say "that's not bad"
        String name3 = "Smith"; //or before: say "looks like a bit of a wait"
        String name4 = "Young"; //or before: say "it's gonna be a while"
        lastName = lastName.toUpperCase();
        if (lastName.compareTo(name1) < 0)
        {
            System.out.println("You don't have to wait long, " + lastName);
        }  else if (lastName.compareTo(name1) > 0 && lastName.compareTo(name2) < 0)
        {
            System.out.println("That's not bad, " + lastName);
        } else if (lastName.compareTo(name2) > 0 && lastName.compareTo(name3) < 0)
        {
            System.out.println("Looks like a bit of a wait, " + lastName);
        } else if (lastName.compareTo(name3) > 0 && lastName.compareTo(name4) < 0)
        {
            System.out.println("It's gonna be a while, " + lastName);
        } else if (lastName.compareTo(name4) > 0) {
            System.out.println("Not going anywhere for a while, " + lastName);
        }
    }
}
