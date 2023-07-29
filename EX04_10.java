package CH04;

// finding numbers divisible by 5 and 6
public class EX04_10 {

    public static void main(String[] args) {
        int number = 100;
        int count = 0;
        System.out.println("Numbers divisible by 5 and 6 are ");
        while (number < 1000) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                 count++;
            }
            number++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
