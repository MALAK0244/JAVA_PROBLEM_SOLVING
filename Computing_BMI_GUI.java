package CH03;

import javax.swing.JOptionPane;

public class Computing_BMI_GUI {

    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter weight in "
                + "kilograms : ");
        double weight = Double.parseDouble(s1);
        String s2 = JOptionPane.showInputDialog(null, "Enter height in "
                + "meters : ");
        double height = Double.parseDouble(s2);
        double BMI = weight / (height * height);
        JOptionPane.showMessageDialog(null, "Your BMI is " + BMI + "\n");
        if (BMI < 16) {
            JOptionPane.showMessageDialog(null, "You are seriously underweight");
        } else if (BMI < 18) {
            JOptionPane.showMessageDialog(null, "You are under weight");
        } else if (BMI < 24) {
            JOptionPane.showMessageDialog(null, "You are normal weight");
        } else if (BMI < 29) {
            JOptionPane.showMessageDialog(null, "You are overweight");
        } else if (BMI < 35) {
            JOptionPane.showMessageDialog(null, "You are seriously overweight");
        } else {
            JOptionPane.showMessageDialog(null, "You are gravely overweight");
        }

    }
}
