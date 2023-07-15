package CH02;

import java.util.Scanner;

public class EX02_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();
        System.out.print("Employee Name: " + name + "\nHours Worked: "
                + hours + "\nPay Rate: $" + pay + "\nGross Pay: $" + (pay * 10));
        double x = (pay * (federal * 10));
        double y = (pay * (state * 10));
        System.out.print("\nDeductions: "
                + "\n  Federal Withholding (" + (federal * 100) + "%)  : $" + x
                + "\n  State Withholding (" + (state * 100) + "%)  : $" + y
                + "\n  Total Deduction: $" + (x + y));
        System.out.println("\nNet Pay : " + ((pay * 10) - (x + y)));

    }
}
