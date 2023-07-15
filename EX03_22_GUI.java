package CH03;

import javax.swing.JOptionPane;

public class EX03_22_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter a coordinate X : ");
        String s2 = JOptionPane.showInputDialog(null,
                "Enter a coordinate Y : ");
        double x = Double.parseDouble(s1);
        double y = Double.parseDouble(s2);
        double dis = Math.pow((x * x) + (y * y), 0.5);
        int radius = 10;
        if (dis <= radius) {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " ) " + " is in the circle");
        } else {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " )" + " is not in the circle");

        }
    }
}
