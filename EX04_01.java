package CH04;

import java.util.Scanner;

public class EX04_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int count = 0;
        int pos = 0;
        int neg = 0;
       
        System.out.print("Enter an int value, "
                + "the program exits if the input is 0: ");
        int value = input.nextInt();

        do {
            total += value;
            count++;
            if (value > 0) {
                pos++;
            }
            if (value < 0) {
                neg++;
            }
            value = input.nextInt();
        } while (value != 0);
        double average = ((double) total) / count;
        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);
        System.out.println("The total is " + total);
        System.out.printf("The average is %1.2f\n", average);

    }
}
