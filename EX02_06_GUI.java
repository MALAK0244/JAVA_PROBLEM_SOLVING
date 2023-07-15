package CH02;

import javax.swing.JOptionPane;

public class EX02_06_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter a number between 0 and 1000: ");
        int number = Integer.parseInt(s);
        int x = number % 10;
        int y = number / 10;
        int z = y % 10;
        int i = y / 10;
        int c = i % 10;
        int sum = x + z + c;

        JOptionPane.showMessageDialog(null, "The sum of the digits " + sum);

    }
}
