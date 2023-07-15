package CH02;

import java.util.Scanner;

public class EX02_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double kiloWeight = weight * 0.45359237;
        double metheight = height * 0.0254;
        double BMI = (kiloWeight / (metheight * metheight));
        System.out.println("BMI is " + BMI);
    }
}
