package CH02;

import java.util.Scanner;

public class EX02_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double distance = Math.pow(x, 0.5);
        System.out.println("The distance of the two points is " + distance);

    }
}
