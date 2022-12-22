package HW1_2;

import java.util.Scanner;

public class Hw01Task14 {
    public static void main(String[] args) {
        int a, b, c, d;

        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            d = b * b - 4 * a * c;

        System.out.println(d > 0 ? "Решение есть" : "Решения нет");
    }
}
