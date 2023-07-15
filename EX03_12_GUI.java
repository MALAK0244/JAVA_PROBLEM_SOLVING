package CH03;

import javax.swing.JOptionPane;

public class EX03_12_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter an integer : ");
        int num = Integer.parseInt(s);
        if ((num % 5 == 0) ^ (num % 6 == 0)) {
            JOptionPane.showMessageDialog(null, num + " is divisible by 5 or 6,"
                    + " but not both ");
        } else if ((num % 5 == 0) && (num % 6 == 0)) {
            JOptionPane.showMessageDialog(null, num + " is divisible by both "
                    + "5 and 6 ");
        } else {
            JOptionPane.showMessageDialog(null, num + " is not divisible "
                    + "by either 5 or 6 ");
        }
    }
}
