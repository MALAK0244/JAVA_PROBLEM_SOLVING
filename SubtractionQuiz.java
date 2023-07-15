package CH03;

import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What subtraction of " + number1 + " and " + number2
                + " ? ");
        int solution = input.nextInt();
        if (solution == number1 - number2) {
            System.out.println("You are Correct \n"
                    + number1 + "-" + number2 + " = " + solution);

        } else {
            System.out.println("Your solution is False "
                    + "\nThe correct solution is " + (number1 - number2));
        }
    }
}
