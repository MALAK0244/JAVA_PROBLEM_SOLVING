package CH04;

public class EX04_03 {

    public static void main(String[] args) {
        System.out.println("kilograms\t\tpounds");
        for (int i = 1; i < 200; i++) {
            double pound = i * 2.2;
            System.out.printf("%3d\t\t\t%3.1f\n", i, pound);
        }
    }
}
