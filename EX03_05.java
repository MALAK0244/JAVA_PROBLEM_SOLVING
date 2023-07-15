package CH03;

import java.util.Scanner;

public class EX03_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() * 8 % 10;
        int number3 = (int) System.currentTimeMillis() * 5 % 10;
        System.out.print("What is the sum of " + number1 + " , " + number2
                + " and " + number3 + " ?");
        int sum = input.nextInt();
        if (sum == number1 + number2 + number3) {
            System.out.print(number1 + " + " + number2 + " + " + number3
                    + " = " + sum + " is True ");
        } else {
            System.out.print(number1 + " + " + number2 + " + " + number3
                    + " = " + sum + " is False");

        }
    }
}
