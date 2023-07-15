package CH03;

import java.util.Scanner;

public class EX03_25 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three edges : ");
        double e1 = input.nextInt();
        double e2 = input.nextInt();
        double e3 = input.nextInt();
        double perimeter = e1 + e2 + e3;
        if (e1 + e2 >= e3 && e2 + e3 >= e1 && e1 + e3 >= e2) {
            System.out.print("Perimeter of the triangle is " + perimeter);
            
        } else {
            System.out.print("The input is invalid ");
            
        }
    }
}
