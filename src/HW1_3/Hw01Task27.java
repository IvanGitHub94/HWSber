package HW1_3;

import java.util.Scanner;

public class Hw01Task27 {
    public static void main(String[] args) {
        int n;
        int result = 0;
        int pow = 1;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

        for(int match = 0; n > match; result++) {
            match = (match << 3) + (match << 1) + 9;
        }

        for (int i = 0; i < result; i++) {
            System.out.println( (n / (int)Math.pow(10, result - pow)) % 10 );
            pow++;
        }
    }
}
