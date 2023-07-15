package CH03;

import java.util.Scanner;

public class EX03_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1’s center x , y-coordinates"
                + ", and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        System.out.print("Enter circle2’s center x , y-coordinates"
                + ", and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        double distance = Math.pow((Math.pow(x2 - x1, 2)
                + Math.pow(y2 - y1, 2)), 0.5);
        if (distance <= (Math.pow((Math.pow(radius1 - radius2, 2)), 0.5))) {
            System.out.print("Circle2 is inside circle1");
        } else if (distance <= (radius1 + radius2)) {
            System.out.print("Circle2 overlaps circle1");
        } else {
            System.out.print("Circle2 does not overlap circle1");
        }
    }
}
