package CH04;

import java.util.Scanner;

public class EX04_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year : ");
        int firstDay = input.nextInt();
        int days = 0;
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.println("    January " + year);
                    days = 31;
                    break;
                case 2:
                    System.out.println("    February " + year);
                    if ((year % 4 == 0) ) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    System.out.println("     March " + year);
                    days = 31;
                    break;
                case 4:
                    System.out.println("      April " + year);
                    days = 30;
                    break;
                case 5:
                    System.out.println("       May " + year);
                    days = 31;
                    break;
                case 6:
                    System.out.println("       June" + year);
                    days = 30;
                    break;
                case 7:
                    System.out.println("       July " + year);
                    days = 31;
                    break;
                case 8:
                    System.out.println("      August " + year);
                    days = 31;
                    break;
                case 9:
                    System.out.println("    September " + year);
                    days = 30;
                    break;
                case 10:
                    System.out.println("     October " + year);
                    days = 31;
                    break;
                case 11:
                    System.out.println("      November " + year);
                    days = 30;
                    break;
                case 12:
                    System.out.println("      December " + year);
                    days = 31;
                    break;
            }
            for (int i = 0; i < 30; i++) {
                System.out.print("-");
            }
            System.out.println(" \nSun Mon Tue Wed Thu Fri Sat");
            
            // sun ---> 0 .... sat ---> 6  and put spaces before the day
            for (int x = 0; x < firstDay; x++) {
                System.out.print("    ");
           }
            // formating for days when become smallest than 10 
            for (int i = 1; i <= days; i++) {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                // enter new line when become 7 days
                if ((i + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            // enter new line and space before any month
            System.out.println("");
            
            firstDay = (firstDay + days) % 7;

        }

    }
}
