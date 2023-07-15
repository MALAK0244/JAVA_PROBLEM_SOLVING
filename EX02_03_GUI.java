package CH02;

import javax.swing.JOptionPane;

public class EX02_03_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a value for feet:");
        double feet = Double.parseDouble(s);
        double meter = feet * 0.305;
        JOptionPane.showMessageDialog(null, feet + " feet is " + meter
                + " meters");

    }
}
