package CH03;

import javax.swing.JOptionPane;

public class EX03_01_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter a ");
        String s2 = JOptionPane.showInputDialog(null, ", b ");
        String s3 = JOptionPane.showInputDialog(null, "and c : ");
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = Double.parseDouble(s3);
        double r1 = (-b + Math.pow(((b * b) - (4 * a * c)), 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(((b * b) - (4 * a * c)), 0.5)) / 2 * a;
        if ((b * b) - (4 * a * c) > 0) {
            JOptionPane.showMessageDialog(null, "The roots are " + r1 
                    + " and " + r2);
        } else if ((b * b) - (4 * a * c) == 0) {
            JOptionPane.showMessageDialog(null, "The roots are " + r1);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real"
                    + " roots");
        }

    }
}
