package CH02;

import javax.swing.JOptionPane;

public class EX02_14_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter weight in pounds: ");
        String s2 = JOptionPane.showInputDialog(null,
                "Enter height in inches: ");

        double weight = Double.parseDouble(s1);
        double height = Double.parseDouble(s2);
        double kiloWeight = weight * 0.45359237;
        double metheight = height * 0.0254;
        double BMI = (kiloWeight / (metheight * metheight));

        JOptionPane.showMessageDialog(null, "BMI is " + BMI);
    }
}
