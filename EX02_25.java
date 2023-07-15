package CH02;

import java.util.Scanner;

public class EX02_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");

        int timezone = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour = (currentHour + timezone) % 24;
        
        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);

    }
}
