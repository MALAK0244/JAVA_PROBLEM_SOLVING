package CH03;

import javax.swing.JOptionPane;

public class SubtractionQuiz_GUI {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        String s = JOptionPane.showInputDialog(null, "What subtraction of "
                + number1 + " and " + number2 + " ? ");
        int solution = Integer.parseInt(s);
        if (solution == number1 - number2) {
            JOptionPane.showMessageDialog(null, "You are Correct\n"
                    + number1 + "-" + number2 + " = " + solution);
        } else {
            JOptionPane.showMessageDialog(null, "Your solution is False "
                    + "\nThe correct solution is " + (number1 - number2));
        }

    }
}
