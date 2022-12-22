package HW1_2;

import java.util.Scanner;

public class Hw01Task10 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться");
        }
        else {
            System.out.println("Петя молодец!");
        }
    }
}
