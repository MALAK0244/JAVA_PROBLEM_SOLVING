package CH02;

import java.util.Scanner;

public class EX02_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int x = input.nextInt();
        char ch = (char) x;
        System.out.println("The character for ASCII code " + x + " is " + ch);
    }

}
