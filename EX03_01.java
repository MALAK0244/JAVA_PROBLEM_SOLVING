package CH03;

import java.util.Scanner;

public class EX03_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.printf("The roots are %1.6f and %1.5f\n" , r1  , r2);
        } else if (discriminant == 0) {
            double r = (-b ) / 2 * a;        
            System.out.println("The roots are " + r);
        } else {
            System.out.println("The equation has no real roots");
        }

    }
}
