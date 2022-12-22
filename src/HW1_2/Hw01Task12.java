package HW1_2;

import java.util.Scanner;

public class Hw01Task12 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();

        System.out.println(x > 12 ? "Пора" : "Рано");
    }
}
