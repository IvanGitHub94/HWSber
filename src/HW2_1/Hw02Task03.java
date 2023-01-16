package HW2_1;

import java.util.Scanner;

public class Hw02Task03 {
    public static void main(String[] args) {
        int length;
        int x;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
            length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        x = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(x >= arr[i]) {
                temp = i + 1;
            }
        }

        System.out.println(temp);
    }
}
