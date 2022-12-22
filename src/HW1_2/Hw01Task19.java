package HW1_2;

import java.util.Scanner;

public class Hw01Task19 {
    public static void main(String[] args) {
        double n;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextDouble();

        System.out.println(Math.log(Math.pow(Math.E, n)) == n);
    }
}
