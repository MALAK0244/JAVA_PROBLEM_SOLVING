package CH02;

import javax.swing.JOptionPane;

public class EX02_08_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter an ASCII code: ");
        int x = Integer.parseInt(s);
        char ch = (char) x;

        JOptionPane.showMessageDialog(null, "The character for ASCII code "
                + x + " is " + ch);
    }
}
