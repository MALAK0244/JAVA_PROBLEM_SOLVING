package CH03;
//Explain

import java.util.Scanner;

public class EX03_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three points ’s x- and y-coordinates: ");
        double Xa = input.nextDouble();
        double Ya = input.nextDouble();
        double Xb = input.nextDouble();
        double Yb = input.nextDouble();
        double Xc = input.nextDouble();
        double Yc = input.nextDouble();
        System.out.print("Enter a point’s x- and y-coordinates: ");
        double X = input.nextDouble();
        double Y = input.nextDouble();
        double ABP = Math.abs(Xa * (Yb - Y) + (Xb * (Y - Ya))
                + ((X * (Ya - Yb))) / 2.0);
        double PBC = Math.abs(X * (Yb - Yc) + (Xb * (Yc - Y))
                + (Xc * (Y - Yb)) / 2.0);
        double APC = Math.abs((Xa * (Y - Yc) + (X * (Yc - Ya))
                + (Xc * (Ya - Y))) / 2.0);
        double ABC = Math.abs((Xa * (Yb - Yc) + (Xb * (Yc - Ya))
                + (Xc * (Ya - Yb))) / 2.0);
        if (ABC == ABP + PBC + APC) {
            System.out.println("The point is in the triangle ");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
