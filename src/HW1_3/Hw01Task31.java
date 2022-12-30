package HW1_3;

import java.util.Scanner;

public class Hw01Task31 {
    public static void main(String[] args) {
        int n, p;
        int a;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            p = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if(a > p) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
