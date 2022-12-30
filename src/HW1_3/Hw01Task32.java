package HW1_3;

import java.util.Scanner;

public class Hw01Task32 {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);

        while (temp < 2) {
            number = scanner.nextInt();
            if(number > 0) temp++;
            else count++;
        }
        System.out.println(count);
    }
}
