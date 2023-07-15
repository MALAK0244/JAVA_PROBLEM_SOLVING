package CH03;

import javax.swing.JOptionPane;

public class GuessBirthday_GUI {

    public static void main(String[] args) {

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

        int answer = JOptionPane.showConfirmDialog(null, "Is your birthday "
                + "in Set1? \n" + set1);
        if (answer == JOptionPane.YES_OPTION) {
            days += 1;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthday "
                + "in Set2? \n" + set2);
        if (answer == JOptionPane.YES_OPTION) {
            days += 2;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthday "
                + "in Set3? \n" + set3);
        if (answer == JOptionPane.YES_OPTION) {
            days += 4;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthday "
                + "in Set4? \n" + set4);
        if (answer == JOptionPane.YES_OPTION) {
            days += 8;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthday "
                + "in Set5? \n" + set5);
        if (answer == JOptionPane.YES_OPTION) {
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
        answer = JOptionPane.showConfirmDialog(null, "Is your birthmonth in "
                + "Set1? \n" + s1);
        if (answer == JOptionPane.YES_OPTION) {
            month += 1;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthmonth in "
                + "Set2? \n" + s2);
        if (answer == JOptionPane.YES_OPTION) {
            month += 2;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthmonth in "
                + "Set3? \n" + s3);
        if (answer == JOptionPane.YES_OPTION) {
            month += 4;
        }
        answer = JOptionPane.showConfirmDialog(null, "Is your birthmonth in "
                + "Set4? \n" + s4);
        if (answer == JOptionPane.YES_OPTION) {
            month += 8;
        }
        JOptionPane.showMessageDialog(null, "\nYour birthday is " + days);

        switch (month) {
            case 1:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is January ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is February ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth"
                        + " is March");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is April ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is May ");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is June");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is July ");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth"
                        + " is August ");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is September ");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is October ");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is November ");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "\nYour birthmonth "
                        + "is December ");
                break;
        }

    }
}
