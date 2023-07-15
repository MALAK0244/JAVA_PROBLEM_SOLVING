package CH02;

import javax.swing.JOptionPane;

public class EX02_21_GUI {

    public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog(null, "Enter x1 ");
        String s2 = JOptionPane.showInputDialog(null, "and y1 for "
                + " a triangle:");
        String s3 = JOptionPane.showInputDialog(null, "Enter x2 ");
        String s4 = JOptionPane.showInputDialog(null, "and y2 "
                + " a triangle:");
        String s5 = JOptionPane.showInputDialog(null, "Enter x3 ");
        String s6 = JOptionPane.showInputDialog(null, "and y3 for"
                + " a triangle:");

        double x1 = Double.parseDouble(s1);
        double y1 = Double.parseDouble(s2);
        double x2 = Double.parseDouble(s3);
        double y2 = Double.parseDouble(s4);
        double x3 = Double.parseDouble(s5);
        double y3 = Double.parseDouble(s6);

        double d1 = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
        double d2 = ((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));
        double d3 = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));

        double side1 = Math.pow(d1, 0.5);
        double side2 = Math.pow(d2, 0.5);
        double side3 = Math.pow(d3, 0.5);

        double s = (side1 + side2 + side3) / 2;
        double a = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(a, 0.5);

        JOptionPane.showMessageDialog(null, "The area of the triangle is "
                + area);
    }
}
