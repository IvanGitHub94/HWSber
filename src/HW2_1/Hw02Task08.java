package HW2_1;

import java.util.Scanner;

public class Hw02Task08 {
    public static void main(String[] args) {
        int length;
        int m;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        m = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]) - Math.abs(m) < Math.abs(min)) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
