package CH03;

import java.util.Scanner;

public class EX03_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = input.nextInt();

        System.out.println((num % 5 == 0 && num % 6 == 0) ? "Is " + num
                + " divisible by 5 and 6 ? true"
                : "Is " + num + " divisible by 5 and 6 ? false");

        System.out.println((num % 5 == 0 ^ num % 6 == 0) ? "Is " + num
                + " divisible by 5 or 6 ? true"
                : "Is " + num + " divisible by 5 or 6 ? false");

        System.out.println((num % 5 == 0 || num % 6 == 0) ? "Is " + num
                + " divisible by 5 or 6 but not both ? true"
                : "Is " + num + " divisible by 5 or 6 but not both ? false");
    }
}
// second way 
/*  if (num % 5 == 0 && num % 6 == 0) {
            System.out.println("Is " + num + " divisible by 5 and 6 ? "
                    + "true");
        } else {
            System.out.println("Is " + num + " divisible by 5 and 6 ? "
                    + "false");
        }

    if (num % 5 == 0 ^ num % 6 == 0) {
            System.out.println("Is " + num + " divisible by 5 or 6 ? "
                    + "true");
        } else {
            System.out.println("Is " + num + " divisible by 5 or 6 ? "
                    + "false"); 
        }
    if (num % 5 == 0 || num % 6 == 0) {
            System.out.println("Is " + num + " divisible by 5 or 6 ,"
                    + " but not both? true");
        } else {
            System.out.println("Is " + num + " divisible by 5 or 6 ,"
                    + " but not both? false");
        } */
