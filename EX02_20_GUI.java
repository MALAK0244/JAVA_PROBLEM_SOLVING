package CH02;

import javax.swing.JOptionPane;

public class EX02_20_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter x1 ");
        String s2 = JOptionPane.showInputDialog(null, "and y1 : ");
        String s3 = JOptionPane.showInputDialog(null, "Enter x2 ");
        String s4 = JOptionPane.showInputDialog(null, "and y2: ");
        double x1 = Double.parseDouble(s1);
        double y1 = Double.parseDouble(s2);
        double x2 = Double.parseDouble(s3);
        double y2 = Double.parseDouble(s4);

        double x = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double distance = Math.pow(x, 0.5);
        JOptionPane.showMessageDialog(null, "The distance of the two points is "
                + distance);
    }

}
