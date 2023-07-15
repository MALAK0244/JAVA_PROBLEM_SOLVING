package CH03;

import java.util.Scanner;

public class GuessBirthday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String set1 = " 1  3  5  7"
                + "\n 9 11 13 15"
                + "\n17 19 21 23"
                + "\n25 27 29 31";

        String set2 = " 2  3  6  7"
                + "\n10 11 14 15"
                + "\n18 19 22 23"
                + "\n26 27 30 31";

        String set3 = " 4  5  6  7"
                + "\n12 13 14 15"
                + "\n20 21 22 23"
                + "\n28 29 30 31";

        String set4 = "  8  9 10 11"
                + "\n12 13 14 15"
                + "\n24 25 26 27"
                + "\n28 29 30 31";

        String set5 = "16 17 18 19"
                + "\n20 21 22 23"
                + "\n24 25 26 27"
                + "\n28 29 30 31";

        int days = 0;
        System.out.print("Is your birthday in Set1? \n" + set1
                + "\nEnter 0 for No and 1 for Yes:");
        int answer = input.nextInt();
        if (answer == 1) {
            days += 1;
        }
        System.out.print("Is your birthday in Set2? \n" + set2
                + "\nEnter 0 for No and 1 for Yes:");
        answer = input.nextInt();
        if (answer == 1) {
            days += 2;
        }
        System.out.print("Is your birthday in Set3? \n" + set3
                + "\nEnter 0 for No and 1 for Yes:");
        answer = input.nextInt();
        if (answer == 1) {
            days += 4;
        }
        System.out.print("Is your birthday in Set4? \n" + set4
                + "\nEnter 0 for No and 1 for Yes:");
        answer = input.nextInt();
        if (answer == 1) {
            days += 8;
        }
        System.out.print("Is your birthday in Set5? \n" + set5
                + "\nEnter 0 for No and 1 for Yes:");
        answer = input.nextInt();
        if (answer == 1) {
            days += 16;
        }

        String s1 = "  1  3   5"
                + "\n  7  9  11";

        String s2 = "  2    3   6"
                + "\n  7   10  11";

        String s3 = "  4   5  6"
                + "\n  7  12";

        String s4 = " 8   9   10"
                + "\n11  12";

        int month = 0;
        System.out.print("Is your birthmonth in Set1? \n" + s1
                + "\nEnter 0 for No and 1 for Yes:");
        int ans = input.nextInt();
        if (ans == 1) {
            month += 1;
        }
        System.out.print("Is your birthmonth in Set2? \n" + s2
                + "\nEnter 0 for No and 1 for Yes:");
        ans = input.nextInt();
        if (ans == 1) {
            month += 2;
        }
        System.out.print("Is your birthmonth in Set3? \n" + s3
                + "\nEnter 0 for No and 1 for Yes:");
        ans = input.nextInt();
        if (ans == 1) {
            month += 4;
        }
        System.out.print("Is your birthmonth in Set4? \n" + s4
                + "\nEnter 0 for No and 1 for Yes:");
        ans = input.nextInt();
        if (ans == 1) {
            month += 8;
        }
        System.out.print("\nYour birthday is " + days + " !");
        switch (month) {
            case 1:
                System.out.print("\nYour birthmonth is January ");
                break;
            case 2:
                System.out.println("\nYour birthmonth is February ");
                break;
            case 3:
                System.out.println("\nYour birthmonth is March");
                break;
            case 4:
                System.out.println("\nYour birthmonth is April ");
                break;
            case 5:
                System.out.println("\nYour birthmonth is May ");
                break;
            case 6:
                System.out.println("\nYour birthmonth is June");
                break;
            case 7:
                System.out.println("\nYour birthmonth is July ");
                break;
            case 8:
                System.out.println("\nYour birthmonth is August ");
                break;
            case 9:
                System.out.println("\nYour birthmonth is September ");
                break;
            case 10:
                System.out.println("\nYour birthmonth is October ");
                break;
            case 11:
                System.out.println("\nYour birthmonth is November ");
                break;
            case 12:
                System.out.println("\nYour birthmonth is December ");
                break;
        }

    }
}
