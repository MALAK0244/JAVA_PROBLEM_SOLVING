package CH02;

import java.util.Scanner;

public class EX02_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        final double PI = 3.14159;
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area + "\nThe volume is " + volume);
    }
}
