package CH03;

import javax.swing.JOptionPane;

public class EX03_05_GUI {

    public static void main(String[] args) {
        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() * 8 % 10;
        int number3 = (int) System.currentTimeMillis() * 7 % 10;
        String s = JOptionPane.showInputDialog(null, "What is the sum of "
                + number1 + " , " + number2 + " and " + number3 + " ?");
        int sum = Integer.parseInt(s);
        if (sum == number1 + number2 + number3) {
            JOptionPane.showMessageDialog(null, number1 + " + " + number2
                    + " + " + number3 + " = " + sum + " is True ");
        } else {
            JOptionPane.showMessageDialog(null, number1 + " + " + number2
                    + " + " + number3 + " = " + sum + " is False"
                    + "\nTrue Sum is " + (number1 + number2 + number3));

        }

    }
}
