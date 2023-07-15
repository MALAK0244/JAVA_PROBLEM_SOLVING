package CH03;

import javax.swing.JOptionPane;

public class EX03_25_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter the first edge: ");
        String s2 = JOptionPane.showInputDialog(null, "Enter the second edge:");
        String s3 = JOptionPane.showInputDialog(null, "Enter the third edge:");
        double e1 = Double.parseDouble(s1);
        double e2 = Double.parseDouble(s2);
        double e3 = Double.parseDouble(s3);
        double perimeter = e1 + e2 + e3;
        if (e1 + e2 >= e3 && e2 + e3 >= e1 && e1 + e3 >= e2) {
            JOptionPane.showMessageDialog(null, "Perimeter of the triangle is "
                    + perimeter);
        } else {
            JOptionPane.showMessageDialog(null, "The input is invalid ");
        }

    }
}
