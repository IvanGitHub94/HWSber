package HW2_1;

import java.util.Scanner;

public class Hw02Task05 {
    public static void main(String[] args) {
        int length;
        int m;

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        int[] arrays = new int[length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }

        m = scanner.nextInt();

        swap(arrays, m);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    public static void swap(int[] array, int position) {
        int n;

        for (int i = 0; i < position; i++) {
            n = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = n;
        }
    }
}
