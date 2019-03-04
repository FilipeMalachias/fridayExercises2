package Week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);

        System.out.print("Please enter your current earth weight:  ");
        int weigth = generalin.nextInt(); // user input
        System.out.print("I have information for the following planets:\n" +
                        "   1. Venus  2.   Mars 3.   Jupiter\n" +
                        "   4. Saturn 5. Uranus    6. Neptune\n" +
                        "Wich planet are you visiting? ");
        int planet = generalin.nextInt();
            double planet1 = weigth * 0.78;
            double planet2 = weigth * 0.39;
            double planet3 = weigth * 2.65;
            double planet4 = weigth * 1.17;
            double planet5 = weigth * 1.05;
            double planet6 = weigth * 1.23;
            if (planet == 1)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet1));
            } else if (planet == 2)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet2));
            } else if (planet == 3)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet3));
            } else if (planet == 4)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet4));
            } else if (planet == 5)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet5));
            } else if (planet == 6)
            {
                System.out.println(String.format("Your weight would be %.2f pounds on that planet.", planet6));
            } else if (planet == 0 || planet > 6)
            {
                System.out.println("Not valid");
            }
    }
}
