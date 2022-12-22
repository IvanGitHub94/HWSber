package HW1_2;

import java.util.Scanner;

public class Hw01Task13 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

        System.out.println(6 - n <= 0 ? "Ура, выходные!" : 6 - n);
    }
}
