package CH03;

import static java.lang.Double.sum;
import javax.swing.JOptionPane;

public class EX03_04_GUI {

    public static void main(String[] args) {
        double number1 = (double) System.currentTimeMillis() % 100;
        double number2 = (double) System.currentTimeMillis() * 8 % 100;
        String s = JOptionPane.showInputDialog(null, "What is the sum of "
                + number1 + " and " + number2 + " ?");
        double sum = Double.parseDouble(s);
        if (sum == number1 + number2) {
            JOptionPane.showMessageDialog(null, number1 + " + " + number2
                    + " = " + sum + " is True");
        } else {
            JOptionPane.showMessageDialog(null, number1 + " + " + number2
                    + " = " + sum + " is False"
                    + "\nTrue sum is " + (number1 + number2));
        }

    }
}
