package CH03;

import javax.swing.JOptionPane;

public class EX03_29_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter circle1’s center"
                + " x-coordinates ");
        String s2 = JOptionPane.showInputDialog(null, ", enter circle1’s center"
                + " y-coordinates");
        String s3 = JOptionPane.showInputDialog(null, "and enter circle1’s"
                + " center radius");
        double x1 = Double.parseDouble(s1);
        double y1 = Double.parseDouble(s2);
        double radius1 = Double.parseDouble(s3);

        String s4 = JOptionPane.showInputDialog(null, "Enter circle2’s center"
                + " x-coordinates ");
        String s5 = JOptionPane.showInputDialog(null, ", enter circle2’s center"
                + " y-coordinates");
        String s6 = JOptionPane.showInputDialog(null, "and enter circle2’s"
                + " center radius");
        double x2 = Double.parseDouble(s4);
        double y2 = Double.parseDouble(s5);
        double radius2 = Double.parseDouble(s6);

        double distance = Math.pow((Math.pow(x2 - x1, 2)
                + Math.pow(y2 - y1, 2)), 0.5);
        if (distance <= (Math.pow((Math.pow(radius1 - radius2, 2)), 0.5))) {
            JOptionPane.showMessageDialog(null, "Circle2 is inside circle1");
        } else if (distance <= (radius1 + radius2)) {
            JOptionPane.showMessageDialog(null, "Circle2 overlaps circle1");
        } else {
            JOptionPane.showMessageDialog(null, "Circle2 does not"
                    + " overlap circle1");
        }

    }
}
