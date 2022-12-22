package HW1_2;

import java.util.Scanner;

public class Hw01Task11 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            y = scanner.nextInt();

        System.out.println(x > 0 && y > 0);
    }
}
