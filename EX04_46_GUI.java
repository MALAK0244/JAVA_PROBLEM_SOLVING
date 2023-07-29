package CH04;

import javax.swing.JOptionPane;

public class EX04_46_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter an integer : ");
        short integer = Short.parseShort(s);
        String bits = "";
        for (int i = 0; i < 16; i++) {
            // if integer is odd --->1
            // if integer is even --->0
            bits = (integer & 1) + bits;
            // integer / 2 and round 
            // round above if integer is negative
            // round below if integer is positive
            integer >>= 1;

        }

        JOptionPane.showMessageDialog(null, "The bits are " + bits);

    }
}
