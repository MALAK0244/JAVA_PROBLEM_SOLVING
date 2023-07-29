package CH04;

import javax.swing.JOptionPane;

public class EX04_01_GUI {

    public static void main(String[] args) {
        String s;
        int value = 0;
        int total = 0;
        int count = 0;
        int pos = 0;
        int neg = 0;
        // 1 2 -1 3 0 

        do {
            s = JOptionPane.showInputDialog(null, "Enter the first int value, "
                    + "the program exits if the input is 0: ");
            value = Integer.parseInt(s);
            if (value == 0) {
                continue;
            }
            if (value > 0) {
                pos++;
            } else if (value < 0) {
                neg++;

            }
            total += value;
            count++;
        } while (value != 0);
        JOptionPane.showMessageDialog(null, "The number of positives is " + pos
                + "\nThe number of negatives is " + neg
                + "\nThe total is " + total
                + "\nThe average is " + ((double) total / count));

    }

}
