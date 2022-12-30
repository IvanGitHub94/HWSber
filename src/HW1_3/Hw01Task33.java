package HW1_3;

import java.util.Scanner;

public class Hw01Task33 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            int temp = n;
            int a = n - 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < temp; j++) {
                if (i != n) {
                    if (j < a) System.out.print(" ");
                    else System.out.print("#");
                }
                else {
                    if(j == (temp - 1) / 2) System.out.print("|");
                    else System.out.print(" ");
                }
            }
            a--;
            temp++;
            System.out.println();
        }
    }
}
