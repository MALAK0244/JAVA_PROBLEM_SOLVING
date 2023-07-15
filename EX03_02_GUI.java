package CH03;

import javax.swing.JOptionPane;

public class EX03_02_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter an integer ");
        int integer = Integer.parseInt(s);
        if (integer % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Is " + integer
                    + " an even number?" + " true");
        } else {
            JOptionPane.showMessageDialog(null, "Is " + integer
                    + " an even number?" + " false");
        }
    }
}
