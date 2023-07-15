package CH02;

import java.util.Scanner;

public class EX02_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();
        int days = ((min / 60)) / 24;
        int year = days / 365;
        int x = days - (year * 365);
        System.out.println(min + " minutes is approximately " + year
                + " years and " + x + " days");
    }
}
