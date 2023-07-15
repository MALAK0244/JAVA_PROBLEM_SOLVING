package CH02;

import javax.swing.JOptionPane;

public class EX02_05_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter the subtotal");
        String s2 = JOptionPane.showInputDialog(null, "and a gratuity rate:");
        double subtotal = Double.parseDouble(s1);
        double gratuityRate = Double.parseDouble(s2);
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        JOptionPane.showMessageDialog(null, "The gratuity is " + gratuity
                + " and total is " + total);
    }
}
