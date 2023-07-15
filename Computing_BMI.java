package CH03;

import java.util.Scanner;

public class Computing_BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilograms : ");
        double weight = input.nextDouble();
        System.out.print("Enter height in meters : ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.printf("Your BMI is %5.2f\n", BMI);
        if (BMI < 16) {
            System.out.println("You are seriously underweight");
        } else if (BMI < 18) {
            System.out.println("You are under weight");
        } else if (BMI < 24) {
            System.out.println("You are normal weight");
        } else if (BMI < 29) {
            System.out.println("You are overweight");
        } else if (BMI < 35) {
            System.out.println("You are seriously overweight");
        } else {
            System.out.println("You are gravely overweight");
        }
    }
}
