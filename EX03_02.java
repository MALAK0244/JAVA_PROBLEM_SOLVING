package CH03;

import java.util.Scanner;

public class EX03_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer = input.nextInt();
        if (integer % 2 == 0) {
            System.out.print("Is " + integer + " an even number?" + " true");
        } else {
            System.out.print("Is " + integer + " an even number?" + " false");
        }
    }
}
