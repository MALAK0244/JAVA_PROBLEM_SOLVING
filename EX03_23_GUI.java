package CH03;

import javax.swing.JOptionPane;

public class EX03_23_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter a coordinate X : ");
        String s2 = JOptionPane.showInputDialog(null,
                "Enter a coordinate Y : ");
        String s3 = JOptionPane.showInputDialog(null,
                "Enter the width for a rectangle : ");
        String s4 = JOptionPane.showInputDialog(null,
                "Enter the height for a rectangle : ");
        double x = Double.parseDouble(s1);
        double y = Double.parseDouble(s2);
        double width = Double.parseDouble(s3);
        double height = Double.parseDouble(s4);
        if (x <= (width / 2) && y <= (height / 2)) {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " )" + " is in the rectangle with the width equals "
                    + width + " and height equals " + height);
        } else {
            JOptionPane.showMessageDialog(null, "Point " + "( " + x + " , "
                    + y + " )" + " is not in the rectangle");

        }

    }
}
