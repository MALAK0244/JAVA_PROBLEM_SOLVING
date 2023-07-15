package CH02;

import javax.swing.JOptionPane;

public class EX02_04_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a number in pounds:");
        double pounds = Double.parseDouble(s);
        double kilograms = pounds * 0.454;
        JOptionPane.showMessageDialog(null, pounds + " pound is " + kilograms + " kilograms ");
    }
}
