package Week2.IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE!\n\n");
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"Kitchen\"?\n");

        String r2 = generalin.nextLine();
        r2 = r2.toUpperCase();
        if (r2.equals("KITCHEN")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");

            String r4 = generalin.nextLine();
            r4 = r4.toUpperCase();

            if (r4.equals("REFRIGERATOR")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                    String e1 = generalin.nextLine();
                    e1 = e1.toUpperCase();
                    if (e1.equals("YES"))
                    {
                        System.out.println("I did not know what to say1");
                    } else if (e1.equals("NO"))
                    {
                        System.out.println("You die of starvation... eventually.");
                    }
            } else if (r4.equals("CABINET")) {
                System.out.println("I did not know what to say2");
                String e2 = generalin.nextLine();
                e2 = e2.toUpperCase();
                if (e2.equals("YES"))
                {
                    System.out.println("I did not know what to say3");
                } else if (e2.equals("NO"))
                {
                    System.out.println("I did not know what to say4");
                }

            }
        }

        else if (r2.equals("UPSTAIRS")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");

            String r5 = generalin.nextLine();
            r5 = r5.toUpperCase();
            if (r5.equals("BEDROOM")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                String e3 = generalin.nextLine();
                e3 = e3.toUpperCase();
                if (e3.equals("YES")) {
                    System.out.println("I did not know what to say5");
                } else if (e3.equals("NO")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            } else if (r5.equals("BATHROOM")) {
                System.out.println("I did not know what to say6");
                String e4 = generalin.nextLine();
                e4 = e4.toUpperCase();
                if (e4.equals("YES")) {
                    System.out.println("I did not know what to say7");
                } else if (e4.equals("NO")) {
                    System.out.println("I did not know what to say8");
                }

            }
        }
    }
}
