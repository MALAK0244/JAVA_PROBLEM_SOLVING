package CH03;

import javax.swing.JOptionPane;

public class EX03_16_GUI {

    public static void main(String[] args) {
        char ch = (char) (Math.random() * 26 + 'A');
        JOptionPane.showMessageDialog(null, "Random character is " + ch);
    }
}
