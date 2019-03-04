package Week2.IfStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner generalin = new Scanner (System.in);
        System.out.print("Your height in m: ");
        double heigth = generalin.nextDouble();

        System.out.print("Your weight in kg: ");
        int weight = generalin.nextInt();

        double bmi = weight / (heigth*heigth);
        System.out.println(String.format("\nYour BMI is %.5f", bmi));
        System.out.print("BMI Category: ");
        if (bmi < 15.0)
        {
            System.out.println("very severely underweight\n");
        } else if (bmi >= 15.0 && bmi <= 16.0)
        {
            System.out.println("severely underweight\n");
        } else if (bmi >= 16.1 && bmi <+ 18.4)
        {
            System.out.println("underweight\n");
        } else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("normal weight");
        } else if (bmi >= 25.0 && bmi <= 29.9)
        {
            System.out.println("overweight");
        } else if (bmi >= 30.0 && bmi <= 34.9)
        {
            System.out.println("moderately obese");
        } else if (bmi >= 35.0 && bmi <= 39.9)
        {
            System.out.println("severely obese");
        } else if (bmi >= 40.0)
        {
            System.out.println("very severely (or \"morbidly\") obese");
        }
    }
}
