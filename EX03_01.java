package CH03;

import java.util.Scanner;

public class EX03_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1 = (-b + Math.pow(((b * b) - (4 * a * c)), 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(((b * b) - (4 * a * c)), 0.5)) / 2 * a;
        if ((b * b) - (4 * a * c) > 0) {
            System.out.print("The roots are " + r1 + " and " + r2);
        } else if ((b * b) - (4 * a * c) == 0) {
            System.out.print("The roots are " + r1);
        } else {
            System.out.print("The equation has no real roots");
        }

    }
}
