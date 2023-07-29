package CH04;

import java.util.Scanner;

public class EX04_46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        short integer = input.nextShort();
        String bits = "";
        for (int i = 0; i < 16; i++) {
            // if integer is odd --->1
            // if integer is even --->0
            bits = (integer & 1) + bits;
            // integer / 2 and round 
            // round above if integer is negative
            // round below if integer is positive
            integer >>= 1;

        }
        System.out.println("The bits are " + bits);
    }
}
