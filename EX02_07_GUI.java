package CH02;

import javax.swing.JOptionPane;

public class EX02_07_GUI {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter the number of minutes: ");
        int min = Integer.parseInt(s);
        int days = ((min / 60)) / 24;
        int year = days / 365;
        int x = days - (year * 365);
        
        JOptionPane.showMessageDialog(null, min + " minutes is approximately "
                + year + " years and " + x + " days");

    }
}
