package CH03;
//explain
import java.util.Scanner;

public class EX03_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double intersectX = (-x * (200 * 100)) / ((-y * 200) - (x * 100));
        double intersectY = (-y * (200 * 100)) / ((-y * 200) - (x * 100));
        if (x < intersectX && y < intersectY) {
            System.out.print("The point is in the triangle ");
        } else {
            System.out.print("The point is not in the triangle");
        }
    }
}
