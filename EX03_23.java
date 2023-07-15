package CH03;

import java.util.Scanner;

public class EX03_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x <= (10 / 2) && y <= (5 / 2)) {
            System.out.print("Point " + "( " + x + " , " + y + " )"
                    + " is in the rectangle");
        } else {
            System.out.print("Point " + "( " + x + " , " + y + " )"
                    + " is not in the rectangle");

        }

    }
}
