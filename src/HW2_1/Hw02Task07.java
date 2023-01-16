package HW2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Hw02Task07 {
    public static void main(String[] args) {
        int length;

        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();

        int[] arrays = new int[length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
        }

        int[] resArr = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            resArr[i] = arrays[i] * arrays[i];
        }

        Arrays.sort(resArr);

        for (int e : resArr) {
            System.out.print(e + " ");
        }
    }
}
