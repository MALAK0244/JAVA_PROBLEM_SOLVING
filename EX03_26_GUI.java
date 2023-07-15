package CH03;

import javax.swing.JOptionPane;

public class EX03_26_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter an integer : ");
        int num = Integer.parseInt(s);
        if (num % 5 == 0 && num % 6 == 0) {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by"
                    + " 5 and 6 ? " + "true");
        } else {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by"
                    + " 5 and 6 ? " + "false");
        }
        if (num % 5 == 0 ^ num % 6 == 0) {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by"
                    + " 5 or 6 ? " + "true");
        } else {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by"
                    + " 5 or 6 ? " + "false");
        }
        if (num % 5 == 0 || num % 6 == 0) {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by"
                    + " 5 or 6 ," + " but not both? true");
        } else {
            JOptionPane.showMessageDialog(null, "Is " + num + " divisible by "
                    + "5 or 6 ," + " but not both? false");
        }

    }
}
