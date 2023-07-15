package CH03;

import javax.swing.JOptionPane;

public class EX03_03_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter a ");
        String s2 = JOptionPane.showInputDialog(null, ",enter b ");
        String s3 = JOptionPane.showInputDialog(null, ",enter c ");
        String s4 = JOptionPane.showInputDialog(null, ",enter d ");
        String s5 = JOptionPane.showInputDialog(null, ",enter e ");
        String s6 = JOptionPane.showInputDialog(null, "and enter f : ");
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = Double.parseDouble(s3);
        double d = Double.parseDouble(s4);
        double e = Double.parseDouble(s5);
        double f = Double.parseDouble(s6);
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        if ((a * d) - (b * c) == 0) {
            JOptionPane.showMessageDialog(null,"The equation has no solution ");
        } else {
            JOptionPane.showMessageDialog(null, "X is " + x + " and Y is " + y);
        }

    }
}
