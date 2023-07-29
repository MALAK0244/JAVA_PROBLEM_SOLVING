package CH03;

import javax.swing.JOptionPane;

public class EX03_08_GUI {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null,
                "Enter the first number: ");
        String s2 = JOptionPane.showInputDialog(null,
                "Enter the second number :");
        String s3 = JOptionPane.showInputDialog(null,
                "Enter the third number :");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = Integer.parseInt(s3);

        int temp;
        if (num3 < num1) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        JOptionPane.showMessageDialog(null, num1 + " < " + num2 + " < " + num3);

    }
}
