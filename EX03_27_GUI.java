package CH03;

import javax.swing.JOptionPane;

public class EX03_27_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter a point’s"
                + " x-coordinates: ");
        String s2 = JOptionPane.showInputDialog(null, "and enter a point’s"
                + " y-coordinates: ");
        double x = Double.parseDouble(s1);
        double y = Double.parseDouble(s2);
        double intersectX = (-x * (200 * 100)) / ((-y * 200) - (x * 100));
        double intersectY = (-y * (200 * 100)) / ((-y * 200) - (x * 100));
        if (x < intersectX && y < intersectY) {
            JOptionPane.showMessageDialog(null,"The point is in the triangle ");
        } else {
            JOptionPane.showMessageDialog(null,"The point is not in"
                    + " the triangle");
        }

    }
}
