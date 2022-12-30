package HW1_3;

import java.util.Scanner;

public class Hw01Task28 {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);
            m = scanner.nextInt();
            n = scanner.nextInt();

        while (true) {
            if(m < n) {
                System.out.println(m);
                break;
            }
            m = m - n;
        }
    }
}
