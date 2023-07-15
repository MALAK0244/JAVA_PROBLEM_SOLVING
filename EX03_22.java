package CH03;

import java.util.Scanner;

public class EX03_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double dis = Math.pow((x * x) + (y * y), 0.5);
        int radius = 10;
        if (dis <= radius) {
            System.out.print("Point " + "( " + x + " , " + y + " )"
                    + " is in the circle");
        } else {
            System.out.print("Point " + "( " + x + " , " + y + " )"
                    + " is not in the circle");

        }
    }
}
