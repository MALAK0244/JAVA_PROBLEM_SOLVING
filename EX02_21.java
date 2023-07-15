package CH02;

import java.util.Scanner;

public class EX02_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double d1 = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
        double d2 = ((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));
        double d3 = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));

        double side1 = Math.pow(d1, 0.5);
        double side2 = Math.pow(d2, 0.5);
        double side3 = Math.pow(d3, 0.5);

        double s = (side1 + side2 + side3) / 2;
        double a = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(a, 0.5);

        System.out.println("The area of the triangle is " + area);
    }
}
