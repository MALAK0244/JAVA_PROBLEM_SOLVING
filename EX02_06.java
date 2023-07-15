package CH02;

import java.util.Scanner;

public class EX02_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int x = number % 10;
        int y = number / 10;
        int z = y % 10;
        int i = y / 10;
        int c = i % 10;
        int sum = x + z + c;
        System.out.println("The sum of the digits " + sum);
    }
}
