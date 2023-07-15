package CH03;

import java.util.Scanner;

public class EX03_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) System.currentTimeMillis() % 100;
        int number2 = (int) System.currentTimeMillis() * 8 % 100;
        System.out.print("What is the sum of " + number1 + " and " + number2
                + " ?");
        int sum = input.nextInt();
        if (sum == number1 + number2) {
            System.out.print(number1 + " + " + number2 + " = " + sum
                    + " is True");
        } else {
            System.out.print(number1 + " + " + number2 + " = " + sum
                    + " is False");
        }
    }
}
