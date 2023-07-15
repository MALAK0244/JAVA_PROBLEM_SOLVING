package CH02;

import javax.swing.JOptionPane;

public class EX02_11_GUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter employee's name: ");
        String s2 = JOptionPane.showInputDialog(null, "Enter number of hours"
                + " worked in a week: ");
        String s3 = JOptionPane.showInputDialog(null, "Enter hourly pay rate: ");
        String s4 = JOptionPane.showInputDialog(null, "Enter federal tax"
                + " withholding rate: ");
        String s5 = JOptionPane.showInputDialog(null, "Enter state tax "
                + "withholding rate: ");

        int hours = Integer.parseInt(s2);
        double pay = Double.parseDouble(s3);
        double federal = Double.parseDouble(s4);
        double state = Double.parseDouble(s5);

        JOptionPane.showMessageDialog(null, "Employee Name: " + name
                + "\nHours Worked: " + hours
                + "\nPay Rate: $" + pay + "\nGross Pay: $" + (pay * 10));
        double x = (pay * (federal * 10));
        double y = (pay * (state * 10));

        JOptionPane.showMessageDialog(null, "\nDeductions: "
                + "\n  Federal Withholding (" + (federal * 100) + "%)  : $" + x
                + "\n  State Withholding (" + (state * 100) + "%)  : $" + y
                + "\n  Total Deduction: $" + (x + y)
                + "\nNet Pay : " + ((pay * 10) - (x + y))
        );

    }
}
