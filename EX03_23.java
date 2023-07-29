package CH03;

import java.util.Scanner;

public class EX03_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.print("Enter the width and height "
                + "for a rectangle : ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        if (x <= (width / 2) && y <= (height / 2)) {
            System.out.println("Point " + "( " + x + " , " + y + " )"
                    + " is in the rectangle");
        } else {
            System.out.println("Point " + "( " + x + " , " + y + " )"
                    + " is not in the rectangle");

        }

    }
}
