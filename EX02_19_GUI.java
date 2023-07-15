package CH02;

import javax.swing.JOptionPane;

public class EX02_19_GUI {

    public static void main(String[] args) {

        char ch = (char) (System.currentTimeMillis() % 26 + 65);
        JOptionPane.showMessageDialog(null, ch);
    }
}
