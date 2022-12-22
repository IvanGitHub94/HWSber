package HW1_2;

import java.util.Scanner;

public class Hw01Task18 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();

        System.out.println( (int)(Math.pow(Math.sin(x), 2) +
                Math.pow(Math.cos(x), 2) - 1) == 0);
    }
}
