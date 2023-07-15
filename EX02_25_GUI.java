package CH02;

import javax.swing.JOptionPane;

public class EX02_25_GUI {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null,
                "Enter the time zone offset to GMT: ");
        int timezone = Integer.parseInt(s1);

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour += timezone;

        JOptionPane.showMessageDialog(null, "The current time is "
                + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
