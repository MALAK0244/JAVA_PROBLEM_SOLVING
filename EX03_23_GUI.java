package CH03;

import javax.swing.JOptionPane;

public class EX03_23_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter a coordinate X : ");
        String s2 = JOptionPane.showInputDialog(null,
                "Enter a coordinate Y : ");
        double x = Double.parseDouble(s1);
        double y = Double.parseDouble(s2);
        if (x <= (10 / 2) && y <= (5 / 2)) {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " )" + " is in the rectangle");
        } else {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " )" + " is not in the rectangle");

        }

    }
}
