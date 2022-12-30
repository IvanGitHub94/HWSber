package HW1_3;

import java.util.Scanner;

public class Hw01Task26 {
    public static void main(String[] args) {
        int start, end;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        start = scanner.nextInt();
        end = scanner.nextInt();

        for (int i = 1; i <= end; i++) {
            sum += (int) Math.pow(start, i);
        }
        System.out.println(sum);
    }
}
