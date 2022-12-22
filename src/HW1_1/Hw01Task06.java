package HW1_1;

import java.util.Scanner;

public class Hw01Task06 {
    public static void main(String[] args) {
        final double KM_PER_MILES = 1.60934;
        int km;
        double miles;

        Scanner scanner = new Scanner(System.in);
        km = scanner.nextInt();

        miles = km / KM_PER_MILES;
        System.out.println(miles);
    }
}
