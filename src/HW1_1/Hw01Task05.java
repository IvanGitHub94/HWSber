package HW1_1;

import java.util.Scanner;

public class Hw01Task05 {
    public static void main(String[] args) {

        final double SM_PER_INCH = 2.54;
        int inches;
        double sm;

        Scanner scanner = new Scanner(System.in);
        inches = scanner.nextInt();

        sm = inches * SM_PER_INCH;

        System.out.println(sm);
    }
}
